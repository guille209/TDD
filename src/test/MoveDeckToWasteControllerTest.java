package test;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import solitario.Card;
import solitario.MoveDeckToWasteController;

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
	public void numberCardsInDeckTest(){
		if (!moveDeckToWasteController.initialDeckThreeOrLessCards()) {
			int numberOfCardsMoved = 3;
			assertEquals(moveDeckToWasteController.numberCardsInDeck(),moveDeckToWasteController.initialNumberCardsInDeck()-numberOfCardsMoved);
		}
	}

	@Test
	public void isDeckEmptyTest() {
		if (moveDeckToWasteController.initialDeckThreeOrLessCards()) {
			assertTrue(moveDeckToWasteController.isDeckEmpty());
		}
	}

	@Test
	public void isWasteWithInitialDeckCardsTest() {
		if (moveDeckToWasteController.initialDeckThreeOrLessCards()) {
			assertTrue(moveDeckToWasteController.isWasteWithInitialDeckCards());
		}
	}

}
