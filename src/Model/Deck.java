package Model;

import java.util.Random;

public class Deck {
	public Card[] cards = new Card[52];
	/**
	 * deck constructor loads all the images into a deck of cards
	 * the images are set in a way that:
	 * 1-13 are Clubs
	 * 14-26 are Hearts
	 * 27-39 are Spades
	 * 40-52 are Diamond
	 */
	public Deck(){
		
		for(int i=0;i<cards.length;i++){
			SuitEnum suit;
			// decide which suite is the card
			if(i<13){
				suit = SuitEnum.Clubs;
			}else if(i>=13 && i<26){
				suit = SuitEnum.Hearts;
			}else if(i>=26 && i<39){
				suit = SuitEnum.Spades;
			}else{
				suit = SuitEnum.Diamond;
			}
			cards[i]=new Card(suit,"Images\\"+(i+1)+".png");//create the card with the image path
		}
	}
	/**
	 * shuffles the deck
	 */
	public void shuffleDeck(){
		Random rand = new Random();

		for(int i=0;i<1000;i++){//do it 1000 times so the deck will be shuffled 
			//pick two random cards number i1 and i2 from 0-51 
			int i1 = rand.nextInt(52);
			int i2 = rand.nextInt(52);
			//switch the cards
			Card temp = cards[i1];
			cards[i1]=cards[i2];
			cards[i2]=temp;
		}
	}
	/**
	 * gets the top card of the deck also known as Draw a card
	 * @return the top card
	 */
	public Card getTopCard(){
		Card ret=null;
		//keep running through the deck until you found the first card that is not null
		for(int i=0;i<cards.length;i++){
			if(cards[i]!=null) {//found the card
				ret= cards[i];
				cards[i]=null;//set the card to null because it was drawn
				break;
			}
		}
		return ret;
	}

}
