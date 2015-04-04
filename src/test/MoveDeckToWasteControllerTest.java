package test;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import solitario.Card;
import solitario.MoveDeckToWasteController;

public class MoveDeckToWasteControllerTest {

	private MoveDeckToWasteController moveDeckToWasteControllerTest;

	@Before
	public void before() {
		Random r = new Random();
		int deckCards = (r.nextInt(30)) + 1;
		int wasteCards = r.nextInt(30);
		moveDeckToWasteControllerTest = new MoveDeckToWasteController(
				deckCards, wasteCards);

	}

	@Test
	public void deckIsEmpty() {
		if (moveDeckToWasteController.initialDeckThreeOrLessCards()) {
			assertTrue(moveDeckToWasteControllerTest.isDeckEmpty());
		}
	}

}
