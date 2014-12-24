package Tests;

import static org.junit.Assert.*;


import org.junit.Test;

import Model.Deck;

public class DeckTest {



	@Test
	public void DeckConstructionTest() {
		Deck d = new Deck();
		assertEquals("Deck has less than 52 cards" ,checkCards(d),52);
	}
	@Test
	public void DeckShuffleTest() {
		Deck d = new Deck();
		d.shuffleDeck();
		assertEquals("Deck has less than 52 cards" ,checkCards(d),52); //checks that the deck didn't corrupt after shuffle(still have 52 cards)
	}
	@Test
	public void DeckGetTopCardTest() {
		Deck d = new Deck();
		d.getTopCard();
		d.getTopCard();
	    //checks that the deck gets down to 50 cards after getting two cards from it
		assertEquals(checkCards(d),50); 
	}
	/**
	 * Checks how many cards are in the deck
	 * @param d
	 * @return
	 */
	public int checkCards(Deck d){
		int n =0;
		for(int i=0;i<52;i++){
			if(d.cards[i]!=null) n++;
		}
		return n;
	}
}
