package Model;

public class Card {
	private SuitEnum suit;
	private String path;
	public Card(SuitEnum suit, String path) {
		super();
		this.suit = suit;
		this.path = path;
	}
	public SuitEnum getSuit() {
		return suit;
	}
	public void setSuit(SuitEnum suit) {
		this.suit = suit;
	}

	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	

}
