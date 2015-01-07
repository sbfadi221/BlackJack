package Controller;


import Model.Card;
import Model.Hand;
/**
 * interface for the use of the game view
 * @author TheMist
 *
 */
public interface GameControllerInterface {
	public Hand getPlayerHand(); //Gets the player hand
	public Hand getDealerHand(); //gets the dealer hand
	public Card hit();//Gets a card from the deck
	public void calculateDealerHandValue();//Calculates the dealer hand value
	public String calculateDealerTurn();//calculates the dealer turn
	public String checkWinner();//calculates the winner
	public int getScore();//gets the player score

}
