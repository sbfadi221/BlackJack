package Model;

public class Player {

	private String name;
	private Hand hand;
	private int score;
	public Player(String name) {
		this.name = name;
		hand = new Hand();
		score=0;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Hand getHand() {
		return hand;
	}
	public void setHand(Hand hand) {
		this.hand = hand;
	}
}
