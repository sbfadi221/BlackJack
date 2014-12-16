package View;

import Controller.GameController;
import Controller.GameControllerInterface;
import Model.Card;

public class GameView {
	private static GameView instance=null;
	private MainGameWindow gameWindow;
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
	}



}
