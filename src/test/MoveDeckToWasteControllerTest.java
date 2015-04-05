package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import solitario.controllers.MoveDeckToWasteController;
import solitario.entities.Card;

public class MoveDeckToWasteControllerTest {

	private MoveDeckToWasteController moveDeckToWasteController;

	@Before
	public void before() {
		Random r = new Random();
		int deckCards = (r.nextInt(30)) + 1;
		int wasteCards = r.nextInt(30);
		moveDeckToWasteController = new MoveDeckToWasteController(deckCards,
				wasteCards);
	}
	@Test
	public void numberCardsInDeckTest() {
		if (moveDeckToWasteController.initialDeckThreeOrLessCards()) {
			assertTrue(moveDeckToWasteController.isDeckEmpty());
		} else {
			int numberOfCardsMoved = 3;
			assertEquals(moveDeckToWasteController.numberCardsInDeck(),
					moveDeckToWasteController.initialNumberCardsInDeck()
							- numberOfCardsMoved);

		}
	}

	@Test
	public void numberCardsInWasteTest() {
		if (moveDeckToWasteController.initialDeckThreeOrLessCards()) {
			assertTrue(moveDeckToWasteController.isWasteWithInitialDeckCards());
		} else {
			int numberOfCardsMoved = 3;
			assertEquals(moveDeckToWasteController.numberCardsInWaste(),
					moveDeckToWasteController.initialNumberCardsInWaste()
							+ numberOfCardsMoved);

		}
	}
	@Test
	public void newCardsInWasteTest(){
		ArrayList<Card> newCardsInWaste = moveDeckToWasteController.newCardsInWaste();
		System.out.println("Cojo las ultimas del waste:\n"+newCardsInWaste);
		for(Card card: newCardsInWaste){		
			assertNotNull(card);
			assertTrue(card.isUncovered());
			assertEquals(newCardsInWaste.indexOf(card),newCardsInWaste.lastIndexOf(card));
		}	
	}
}
