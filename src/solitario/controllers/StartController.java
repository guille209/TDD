package solitario.controllers;

import java.util.ArrayList;
import java.util.Random;

import solitario.entities.Card;

public class StartController {

	public boolean isEmptyAllFoundations() {

		return true;
	}

	public ArrayList<Card> peeksEachTableau() {
		ArrayList<Card> peeksEachTableau = new ArrayList<Card>();
		for (int i = 0; i < 7; i++) {
			Card card;
			do {
				Random r = new Random();
				card = new Card(r.nextInt(4), r.nextInt(12), true);

			} while (peeksEachTableau.contains(card));
			{
				peeksEachTableau.add(card);
			}
		}
		return peeksEachTableau;
	}

}
