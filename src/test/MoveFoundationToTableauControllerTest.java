package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import solitario.controllers.MoveFoundationToTableauController;
import solitario.controllers.MoveWasteToFoundationController;
import solitario.entities.Card;
import solitario.entities.FoundationList;

public class MoveFoundationToTableauControllerTest {

	private MoveFoundationToTableauController moveFoundationToTableauController;

	@Before
	public void before() {

		Random r = new Random();
		int tableau = r.nextInt(11) + 1;

		moveFoundationToTableauController = new MoveFoundationToTableauController(
				tableau);
	}

	@Test
	public void numberCardsInFoundationTest() {
		assertEquals(
				moveFoundationToTableauController
						.initialNumberCardsInFoundation() - 1,
				moveFoundationToTableauController.numberCardsInFoundation());
	}

	@Test
	public void movedLastCardInFoundationTest() {
		assertEquals(
				moveFoundationToTableauController.initialLastCardInFoundation(),
				moveFoundationToTableauController.getMovedCard());
	}

	@Test
	public void numberCardsInTableauTest() {
		System.out.println("Ejecutando numberCardsInTableauTest");
		assertEquals(
				moveFoundationToTableauController.initialNumberCardsInTableau() + 1,
				moveFoundationToTableauController.getCurrentTableau().size());

	}

	@Test
	public void movedCardSuitNotMatchesTableuLastCardSuitTest() {

		Card movedCard = moveFoundationToTableauController.getMovedCard();
		assertNotEquals(moveFoundationToTableauController
				.initialLastCardInTableau().getSuit(), movedCard.getSuit());

	}
	@Test
	public void isCorrectCardNumberTest() {
		Card movedCard = moveFoundationToTableauController.getMovedCard();

		Card lastTableauCard = moveFoundationToTableauController
				.initialLastCardInTableau();
		assertEquals(lastTableauCard.getNumber() - 1, movedCard.getNumber());

		assertTrue(movedCard.isUncovered());
	}

}
