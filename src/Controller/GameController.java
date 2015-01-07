package Controller;



import Model.*;


public class GameController implements GameControllerInterface{
	private static GameController instance=null;
	private Deck deck;
	private Player player;
	private Dealer dealer;
	public int round;
	
	/**
	 * The controller constructor creates the deck and the players
	 */
	private GameController(){
		createDeck();
		player = new Player("Player");
		dealer = new Dealer("Dealer");
		round = 1;

	}
	/**
	 * create a new deck
	 */
	public void createDeck(){
		deck = new Deck();
	}
	/**
	 * shuffle the cards in the deck
	 */
	public void shuffleDeck(){
		deck.shuffleDeck();
	}
	/**
	 * Deal opening hand for both player and dealer
	 */
	public void dealHands(){
		
		for(int i=0;i<2;i++){//deals two cards
		    player.getHand().cards.add(deck.getTopCard());//deal card to the player
		    dealer.getHand().cards.add(deck.getTopCard());//deal card to the dealer
		}
	}
	/**
	 * @return the hand  of the player
	 */
	public Hand getPlayerHand(){
		return player.getHand();
	}
	/**
	 * @return the hand  of the dealer
	 */
	public Hand getDealerHand(){
		return dealer.getHand();
	}
    /**
     * 
     * @return the game deck
     */
	public Deck getDeck() {
		return deck;
	}
/**
 * 
 * @return the player
 */
	public Player getPlayer() {
		return player;
	}
/**
 * 
 * @return the dealer
 */
	public Dealer getDealer() {
		return dealer;
	}
/**
 * creates or gets singleton instance  of the controller
 * @return the instance of the controller
 */
	public static GameController getInstance(){
		if(instance==null){
			instance=new GameController();
		}
		return instance;
	}
	/**
	 * gets a card from the deck
	 * @return
	 */
	public Card hit(){
		 Card c = deck.getTopCard();
		 getPlayerHand().cards.add(c);
		 calculatePlayerHandValue();
		 return c;
	}
	/**
	 * calculates player Hand value
	 * @return
	 */
	public void calculatePlayerHandValue(){
		player.getHand().calculateValue("player");
	}
	/**
	 * calculates player Hand value
	 * @return
	 */
	public void calculateDealerHandValue(){
		dealer.getHand().calculateValue("dealer");
	}
	/**
	 * Plays the dealer turn
	 */
	public String calculateDealerTurn(){
		calculateDealerHandValue();
		if(dealer.getHand().checkBlackJack("dealer")) return "bj";
		if(dealer.getHand().checkSoft17()) return "17";
		while(dealer.getHand().value<17  ){
			Card c = deck.getTopCard();
			getDealerHand().cards.add(c);
			calculateDealerHandValue();
		}
		return "";
	}
	/**
	 * calculates the winner of the game
	 */
	public String checkWinner() {
		if(dealer.getHand().value>=player.getHand().value && dealer.getHand().value<=21){
			
			return "The Dealer Wins Your Score This Round: "+ calculateScore(-1);
		}
			
		else{
			
			return "You Win Your Score This Round: "+ calculateScore(1);
		}
	}
	/**
	 * calculates the player score
	 * @param result of the game for the player -1 for lose 1 for win
	 * @return the score for the current round
	 */
	public int calculateScore(int result){
		int sc =0;
		if((round%2) == 0){
			sc=(result*2)+player.getScore();
			player.setScore(sc);
		}
		else{
			sc=(result*3)+player.getScore();
			player.setScore(sc);
		
		}
        return sc;
	}
	
}
