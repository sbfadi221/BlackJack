package Tests;

import static org.junit.Assert.*;


import org.junit.Test;

import Model.Card;
import Model.Hand;
import Model.SuitEnum;

public class HandTest {



	@Test
	public void testCheckBlackJack() {
		Hand h=new Hand();
		h.cards.add(new Card(SuitEnum.Clubs,"1",1));
		h.cards.add(new Card(SuitEnum.Clubs,"2",10));
		assertTrue(h.checkBlackJack("player"));
	}

	@Test
	public void testCalculateValue() {
		Hand h=new Hand();
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
