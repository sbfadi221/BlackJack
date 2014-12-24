package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Controller.GameController;
import View.GameView;
/**
 * Tests the GameView Functionality
 * @author TheMist
 *
 */

public class GameViewTest {

	@Test
	public void testShowDealedCards() {
		GameController gc = GameController.getInstance();
		GameView gv = GameView.getInstance();
		gc.dealHands();
		gv.ShowDealedCards();
	
		assertEquals(gv.gameWindow.playerHandPanel[0].getIcon().toString(),gc.getPlayerHand().cards.get(0).getPath());
		assertEquals(gv.gameWindow.playerHandPanel[1].getIcon().toString(),gc.getPlayerHand().cards.get(1).getPath());
		assertEquals(gv.gameWindow.dealerHandPanel[0].getIcon().toString(),"Images\\54.png");
		assertEquals(gv.gameWindow.dealerHandPanel[1].getIcon().toString(),gc.getDealerHand().cards.get(1).getPath());
	}



}
