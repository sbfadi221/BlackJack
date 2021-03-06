package View;

import Controller.GameController;
import Controller.GameControllerInterface;
import Model.Card;

public class GameView {
	private static GameView instance=null;
	public MainGameWindow gameWindow;
	GameControllerInterface gc = GameController.getInstance();
	
	private GameView(){
	
		gameWindow = new MainGameWindow(this);
	}
	public static GameView getInstance(){
		if(instance==null){
			instance=new GameView();
		}
		return instance;
	}
	public void ShowMainWindow(){
		gameWindow.setVisible(true);
	}
	public void ShowDealedCards(){
		for(Card c:gc.getPlayerHand().cards){
			gameWindow.addCardToPlayerPanel(c.getPath());
		}
		
		for(Card c:gc.getDealerHand().cards){
			gameWindow.addCardToDealerPanel(c.getPath());
		}
		if(gc.getPlayerHand().checkBlackJack("player")){
			gameWindow.blackJack();
			updateDealerHandValue();
			dealerTurn();
			gameWindow.declareWinner(gc.checkWinner());
			gameWindow.setScore(gc.getScore());
		}
		updatePlayerHandValue();
	}
	public void Hit(){
		gameWindow.addCardToPlayerPanel(gc.hit().getPath());
		updatePlayerHandValue();
		if(gc.getPlayerHand().value>21){
			
		   gameWindow.busted(gc.busted());
		   gameWindow.setScore(gc.getScore());
		}
		
	}
	/**
	 * give the turn to the dealer (Visualy)
	 */
	public void stand(){
		gc.calculateDealerHandValue();
		updateDealerHandValue();
		
		gameWindow.stand();
		dealerTurn();
		gameWindow.declareWinner(gc.checkWinner());
		gameWindow.setScore(gc.getScore());
		
	}
	public void updatePlayerHandValue(){
		gameWindow.setPlayerHandValue(gc.getPlayerHand().value);
	}
	public void updateDealerHandValue(){
		gameWindow.setDealerHandValue(gc.getDealerHand().value);
	}
	public void dealerTurn(){
		String res = gc.calculateDealerTurn();
		updateDealerHandValue();
		if(res.equals(("bj"))) gameWindow.dealerBlackJack();
		else if(res.equals(("17")))gameWindow.dealerSoft17();
		else{
			
			for(int i=2;i<gc.getDealerHand().cards.size();i++){
				gameWindow.addCardToDealerPanel(gc.getDealerHand().cards.get(i).getPath());
			}
		}
	
	}
	public void newGame(){
		gc.newGame();
		ShowDealedCards();
		updatePlayerHandValue();
	}
	public void newRound(){
		gc.newRound();
		ShowDealedCards();
		updatePlayerHandValue();

	}
}
