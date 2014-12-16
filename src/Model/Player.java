package Model;

public class Player {

	private String name;
	private Hand hand;
	public Player(String name) {
		this.name = name;
		hand = new Hand();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Hand getHand() {
		return hand;
	}
	public void setHand(Hand hand) {
		this.hand = hand;
	}
}
