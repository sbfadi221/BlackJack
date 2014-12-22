package Controller;


import Model.Card;
import Model.Hand;

public interface GameControllerInterface {
	public Hand getPlayerHand(); //Gets the player hand
	public Hand getDealerHand(); //gets the dealer hand
	public Card hit();//Gets a card from the deck
	public void calculateDealerHandValue();//Calculates the dealer hand value
}
