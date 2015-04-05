package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import solitario.controllers.StartController;
import solitario.entities.Card;

public class StartControllerTest {

	StartController startController;

	@Before
	public void before() {
		startController = new StartController();
	}

	@Test
	public void isEmptyAllFoundationsTest() {
		assertTrue(startController.isEmptyAllFoundations());
	}

	@Test
	public void peeksEachTableauTest() {
		ArrayList<Card> peeksEachTableau = startController.peeksEachTableau();

		assertEquals(7, peeksEachTableau.size());
		for (Card card : peeksEachTableau) {
			assertNotNull(card);
			assertTrue(card.isUncovered());
		}

	}

}
