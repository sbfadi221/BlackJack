package Tests;

import static org.junit.Assert.*;


import org.junit.Test;

import Model.Card;
import Model.Hand;
import Model.SuitEnum;
/**
 * tests the hand class functionality
 * @author TheMist
 *
 */
public class HandTest {



	@Test
	public void testCheckBlackJack() {
		Hand h=new Hand();
		// add black jack sequence
		h.cards.add(new Card(SuitEnum.Clubs,"1",1));
		h.cards.add(new Card(SuitEnum.Clubs,"2",10));
		assertTrue(h.checkBlackJack("player"));
	}

	@Test
	public void testCalculateValue() {
		Hand h=new Hand();
		// add cards in this sequence a 6 and 5 and then two aces should give different result for dealer and player
		h.cards.add(new Card(SuitEnum.Clubs,"1",6));
		h.cards.add(new Card(SuitEnum.Clubs,"2",5));
		h.cards.add(new Card(SuitEnum.Clubs,"4",1));
		h.cards.add(new Card(SuitEnum.Clubs,"4",1));
		h.calculateValue("player");
		assertEquals(h.value,23);
		h.calculateValue("dealer");
		assertEquals(h.value,13);
		
	}

}
