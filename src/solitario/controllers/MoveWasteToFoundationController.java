package solitario.controllers;

import java.util.ArrayList;
import java.util.Random;

import solitario.entities.Card;
import solitario.entities.FoundationList;

public class MoveWasteToFoundationController {

	private ArrayList<Card> waste;
	private FoundationList<Card> foundation;
	private int initialNumberCardsInWaste;
	private Card initialLastCardInWaste;
	private int initialNumberCardsInFoundation;

	public MoveWasteToFoundationController(int wasteCards, int foundationCards) {

		waste = new ArrayList<>();
		foundation = new FoundationList<>(new Random().nextInt(4));
		for (int i = 1; i <= wasteCards; i++) {
			Random r = new Random();
			waste.add(new Card(r.nextInt(4), r.nextInt(12), true));
		}
		initialLastCardInWaste = new Card(foundation.getSuit(),
				foundationCards, true);
		waste.add(initialLastCardInWaste);
		initialNumberCardsInWaste = waste.size();

		Random rSuit = new Random();
		int suit = rSuit.nextInt(4);
		for (int i = 0; i < foundationCards; i++) {
			foundation.add(new Card(foundation.getSuit(), i, true));
		}
		initialNumberCardsInFoundation = foundation.size();

		foundation.add(waste.remove(waste.size() - 1));
	}

	public int initialNumberCardsInWaste() {
		return initialNumberCardsInWaste;
	}

	public Card initialLastCardInWaste() {
		return initialLastCardInWaste;
	}

	public Card getMovedCard() {
		return foundation.get(foundation.size() - 1);
	}

	public FoundationList<Card> getCurrentFoundation() {
		return foundation;
	}

	public int initialNumberCardsInFoundation() {
		return initialNumberCardsInFoundation;
	}

	public boolean initialFoundationisEmpty() {
		return false;
	}

	public Card initialLastCardInFoundation() {
		return null;
	}

	public int numberCardsInWaste() {
		return waste.size();
	}

}
