package solitario;

public class Card {

	private int suit;
	private int number;
	private boolean uncovered;

	public Card(int suit, int number, boolean uncovered) {
		this.suit = suit;
		this.number = number;
		this.uncovered = uncovered;

	}

	
	public boolean isUncovered() {
		return uncovered;
	}

	public void setUncovered(boolean uncovered) {
		this.uncovered = uncovered;
	}

	@Override
	public boolean equals(Object object) {
		assert object instanceof Card;
		Card card = (Card) object;
		return card.suit == suit && card.number == number;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if (uncovered)
			return "CARD[P:" + suit + ",N:" + number + ",Descubierta]\n";
		else
			return "CARD[P:" + suit + ",N:" + number + ",Tapada]\n";

	}

}
