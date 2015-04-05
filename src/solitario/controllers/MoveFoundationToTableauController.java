package solitario.controllers;

import java.util.ArrayList;
import java.util.Random;

import solitario.entities.Card;
import solitario.entities.FoundationList;

public class MoveFoundationToTableauController {

	private FoundationList<Card> foundation;
	private ArrayList<Card> tableau;
	private int initialFoundationCards;
	private Card initialLastCardInFoundation;

	public MoveFoundationToTableauController(int tableauCards) {
		tableau = new ArrayList<>();
		Random random;
		int primerNumero;
		do {
			random = new Random();
			primerNumero = random.nextInt(11);
		} while (primerNumero < tableauCards - 1);

		Card firstCard = new Card(random.nextInt(4), primerNumero, true);
		tableau.add(firstCard);
		for (int i = 0; i < tableauCards - 1; i++) {
			int lastSuit = tableau.get(i).getSuit();
			int lastNumber = tableau.get(i).getNumber();
			int newSuit;
			do {
				Random randomSuit = new Random();
				newSuit = randomSuit.nextInt(4);

			} while (newSuit == lastSuit);
			tableau.add(new Card(newSuit, lastNumber - 1, true));
		}

		int suit;
		do {
			Random randomSuit = new Random();
			suit = randomSuit.nextInt(4);

		} while (suit == tableau.get(tableau.size() - 1).getSuit());

		foundation = new FoundationList<>(suit);
		Random randomNumber = new Random();
		initialFoundationCards = tableau.get(
				tableau.size() - 1).getNumber();
		for (int i = 0; i < initialFoundationCards; i++) {
			foundation.add(new Card(foundation.getSuit(), i, true));
		}
		initialLastCardInFoundation = foundation.get(foundation.size()-1);

		System.out.println("Estado inicial");
		System.out.println("Tableau con " + tableau.size() + " cartas: "
				+ tableau);
		System.out.println("Foundation con " + foundation.size() + " cartas: "
				+ foundation);

		tableau.add(foundation.remove(foundation.size() - 1));

		System.out.println("Estado Final");
		System.out.println("Tableau con " + tableau.size() + " cartas: "
				+ tableau);
		System.out.println("Foundation con " + foundation.size() + " cartas: "
				+ foundation);

	}

	public int initialNumberCardsInFoundation() {
		// TODO Auto-generated method stub
		return initialFoundationCards;
	}

	public int numberCardsInFoundation() {
		// TODO Auto-generated method stub
		return foundation.size();
	}

	public Card initialLastCardInFoundation() {
		// TODO Auto-generated method stub
		return initialLastCardInFoundation;
	}

	public Card getMovedCard() {
		// TODO Auto-generated method stub
		return null;
	}

	public int initialNumberCardsInTableau() {
		// TODO Auto-generated method stub
		return 0;
	}

	public ArrayList<Card> getCurrentTableau() {
		// TODO Auto-generated method stub
		return null;
	}

	public Card initialLastCardInTableau() {
		// TODO Auto-generated method stub
		return null;
	}

}
