package Model;

public class Card {

	private SuitEnum suit;
	private String path;
	private int value;
	public Card(SuitEnum suit, String path,int value) {
		super();
		this.suit = suit;
		this.path = path;
		this.value = value;
	}
	public SuitEnum getSuit() {
		return suit;
	}


	public String getPath() {
		return path;
	}
	public int getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Card [value=" + value + "]";
	}

}
