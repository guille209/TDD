package solitario;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class MoveDeckToWasteController {

	private ArrayList<Card> deck;
	private ArrayList<Card> waste;
	private int initialDeckCards;
	private int initialwasteCards;

	public MoveDeckToWasteController(int deckCards, int wasteCards) {
		deck = new ArrayList<Card>();
		waste = new ArrayList<Card>();
		for (int i = 1; i <= deckCards; i++) {
			Random r = new Random();
			deck.add(new Card(r.nextInt(4), r.nextInt(12), false));
		}
		for (int i = 1; i <= wasteCards; i++) {
			Random r = new Random();
			waste.add(new Card(r.nextInt(4), r.nextInt(12), true));
		}
		initialDeckCards = deckCards;
		initialwasteCards = wasteCards;
		System.out.println("Deck: "+deck);
		System.out.println("Waste: "+waste);
	}

	public boolean initialDeckThreeOrLessCards() {
		// TODO Auto-generated method stub
		return initialDeckCards <= 3;
	}

	public boolean isDeckEmpty() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isWasteWithInitialDeckCards() {
		// TODO Auto-generated method stub
		return true;
	}

	public int numberCardsInDeck() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int initialNumberCardsInDeck() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int numberCardsInWaste() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int initialNumberCardsInWaste() {
		// TODO Auto-generated method stub
		return 0;
	}

	public ArrayList<Card> newCardsInWasteTest() {
		if (initialDeckThreeOrLessCards()) {
			return new ArrayList<Card>(waste.subList(waste.size()
					- initialDeckCards, waste.size()));
		} else {
			return new ArrayList<Card>(waste.subList(waste.size() - 3,
					waste.size()));
		}
	}

}
