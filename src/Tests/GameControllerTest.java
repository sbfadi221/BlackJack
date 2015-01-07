package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Controller.GameController;
/**
 * Tests the gamecontroller functionality
 * @author TheMist
 *
 */
public class GameControllerTest {



	@Test
	public void testHit() {
		GameController gc = GameController.getInstance();
		int oldSize = gc.getPlayer().getHand().cards.size();
		gc.hit();
		assertTrue(gc.getPlayer().getHand().cards.size()== (oldSize+1));
	}
	@Test
	public void testScoring() {
		GameController gc = GameController.getInstance();
		int sc=gc.calculateScore(-1);

		assertEquals(sc,-3);
		sc=gc.calculateScore(1);
		assertEquals(sc,3);
		gc.round=2;
		sc=gc.calculateScore(-1);

		assertEquals(sc,-2);
		sc=gc.calculateScore(1);
		assertEquals(sc,2);
	}
	@Test
	public void testWinner() {
		GameController gc = GameController.getInstance();
		gc.newGame();
		gc.getDealer().getHand().value=21;
		gc.getPlayer().getHand().value=17;
		String res=gc.checkWinner();
		assertTrue(res.contains("Lose"));

	}

}
