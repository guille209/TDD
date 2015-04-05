package solitario;

import java.util.ArrayList;
import java.util.Random;

public class MoveWasteToFoundationController {
	
	private ArrayList<Card> waste;
	private FoundationList<Card>foundation;
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
		initialLastCardInWaste = new Card(foundation.getSuit(),foundationCards,true);
		waste.add(initialLastCardInWaste);
		initialNumberCardsInWaste = waste.size();
		initialNumberCardsInFoundation = foundation.size(); 
		Random rSuit = new Random();
		int suit = rSuit.nextInt(4);
		for (int i = 0; i < foundationCards; i++) {
			foundation.add(new Card(foundation.getSuit(),i, true));
		}
		
		System.out.println("------------------------------\n\nEstado inicial:");
		System.out.println("Waste: "+waste.size()+" cartas "+waste);
		System.out.println("Foundation: "+foundation.size()+" cartas "+foundation);
		
		foundation.add(waste.remove(waste.size()-1));
		
		System.out.println("------------------------------\n\nEstado final:");
		System.out.println("Waste: "+waste.size()+" cartas "+waste);
		System.out.println("Foundation: "+foundation.size()+" cartas "+foundation);
	}

	public int initialNumberCardsInWaste() {
		// TODO Auto-generated method stub
		return initialNumberCardsInWaste;
	}

	public Card initialLastCardInWaste() {
		// TODO Auto-generated method stub
		return initialLastCardInWaste;
	}

	public Card getMovedCard() {
		// TODO Auto-generated method stub
		return foundation.get(foundation.size()-1);
	}

	public FoundationList<Card> getCurrentFoundation() {
		// TODO Auto-generated method stub
		return foundation;
	}

	public int initialNumberCardsInFoundation() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean initialFoundationisEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public Card initialLastCardInFoundation() {
		// TODO Auto-generated method stub
		return null;
	}


}
