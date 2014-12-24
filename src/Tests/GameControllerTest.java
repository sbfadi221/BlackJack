package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Controller.GameController;

public class GameControllerTest {

	@Test
	public void testDealHands() {
		GameController gc = GameController.getInstance();
		gc.createDeck();
		gc.dealHands();
		//check that four cards where dealt(erased from the deck)
		assertTrue(gc.getDeck().cards[0]==null && gc.getDeck().cards[1]==null&&gc.getDeck().cards[2]==null && gc.getDeck().cards[3]==null);
		assertTrue("player hand not dealt" ,gc.getPlayer().getHand().cards.size()==2);
		assertTrue("Dealer hand not dealt" ,gc.getDealer().getHand().cards.size()==2);
		String first = gc.getPlayer().getHand().cards.get(0).getPath();
		String second = gc.getPlayer().getHand().cards.get(1).getPath();
		String third = gc.getDealer().getHand().cards.get(0).getPath();
		String fourth = gc.getDealer().getHand().cards.get(1).getPath();
		assertTrue("two similar cards dealt" ,!first.equals(second) && !first.equals(third)&& !first.equals(fourth) && !second.equals(third)&& !second.equals(fourth)&& !fourth.equals(third));
	}

	@Test
	public void testHit() {
		GameController gc = GameController.getInstance();
		int oldSize = gc.getPlayer().getHand().cards.size();
		gc.hit();
		assertTrue(gc.getPlayer().getHand().cards.size()== (oldSize+1));
	}

}
