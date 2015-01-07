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
<<<<<<< HEAD
	public int getScore();//gets the player score
=======
>>>>>>> 33f142c38ea4124d1073075b9f866d18ef86eefb
}
