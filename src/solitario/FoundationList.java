package solitario;

import java.util.ArrayList;

public class FoundationList<Card> extends ArrayList<Card> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int suit;

	public FoundationList(int suit) {
		this.suit = suit;
	}

	public int getSuit() {
		// TODO Auto-generated method stub
		return suit;
	}
}
