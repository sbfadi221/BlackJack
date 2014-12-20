package Main;



import Controller.GameController;
import View.GameView;


public class GameRun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameController gc = GameController.getInstance();
		GameView gv = GameView.getInstance();
        gc.shuffleDeck();
        gc.dealHands();
        gc.calculatePlayerHandValue();
		gv.ShowMainWindow();
		gv.ShowDealedCards();
		gv.updatePlayerHandValue();

	}

}
