package solitario;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class MoveDeckToWasteController {

	private ArrayList<Card> deck;
	private ArrayList<Card> waste;
	private int initialNumberDeckCards;
	private int initialNumberWasteCards;
	private ArrayList<Card> initialDeckCards;

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
		initialDeckCards = deck;
		initialNumberDeckCards = deckCards;
		initialNumberWasteCards = wasteCards;
		System.out.println("Antes de mover");
		System.out.println("Deck: " + deck);
		System.out.println("Waste: " + waste);

		if (initialDeckThreeOrLessCards()) {
			for (Card card : deck) {
				card.setUncovered(true);
			}
			waste.addAll(deck);
			deck.clear();
		} else {
			for (int i = 0; i <= 2; i++) {
				Card card = deck.remove(deck.size() - 1);
				card.setUncovered(true);
				waste.add(card);
			}
		}
		System.out.println("Despues de mover");
		System.out.println("Deck: " + deck);
		System.out.println("Waste: " + waste);

	}

	public boolean initialDeckThreeOrLessCards() {
		return initialNumberDeckCards <= 3;
	}

	public boolean isDeckEmpty() {
		return deck.isEmpty();
	}

	public boolean isWasteWithInitialDeckCards() {
		return initialDeckCards.equals(waste.subList(waste.size()-initialDeckCards.size(),waste.size()));
	}

	public int numberCardsInDeck() {

		return deck.size();
	}

	public int initialNumberCardsInDeck() {
		// TODO Auto-generated method stub
		return initialNumberDeckCards;
	}

	public int numberCardsInWaste() {
		// TODO Auto-generated method stub
		return waste.size();
	}

	public int initialNumberCardsInWaste() {
		// TODO Auto-generated method stub
		return initialNumberWasteCards;
	}

	public ArrayList<Card> newCardsInWaste() {
		if (initialDeckThreeOrLessCards()) {
			return new ArrayList<Card>(waste.subList(waste.size()
					- initialNumberDeckCards, waste.size()));
		} else {
			return new ArrayList<Card>(waste.subList(waste.size() - 3,
					waste.size()));
		}
	}

}
