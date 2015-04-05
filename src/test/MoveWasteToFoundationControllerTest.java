package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import solitario.Card;
import solitario.MoveDeckToWasteController;

public class MoveWasteToFoundationControllerTest {

	private MoveWasteToFoundationController moveWasteToFoundationController;

	@Before
	public void before() {
		Random r = new Random();
		int wasteCards = r.nextInt(30) + 1;
		int foundationCards = r.nextInt(12) + 1;

		moveWasteToFoundationController = new MoveWasteToFoundationsController(
				wasteCards, foundationCards);
	}

	@Test
	public void numberCardsInWasteTest() {
		assertEquals(
				moveWasteToFoundationController.initialNumberCardsInWaste - 1,
				moveWasteToFoundationController.numberCardsInWaste());

	}

	@Test
	public void movedLastCardInWasteTest() {
		assertTrue(moveWasteToFoundationController.initialLastCardInWaste(),
				moveWasteToFoundationController.getMovedCard());
	}

	@Test
	public void numberCardsInFoundationTest() {

		assertEquals(
				moveWasteToFoundationController.initialNumberCardsInFoundation + 1,
				moveWasteToFoundationController.getCurrentFoundation().size());

	}

	@Test
	public void foundationSuitMatchesCardSuitTest() {
		FoundationList<Card> foundationList = moveWasteToFoundationController
				.getCurrentFoundation();
		Card movedCard = moveWasteToFoundationController.getMovedCard();

		assertEquals(foundationList.getSuit(), movedCard.getSuit());

	}

	public void isCorrectCardNumberTest() {
		Card movedCard = moveWasteToFoundationController.getMovedCard();
		if (moveWasteToFoundationController.initialFoundationisEmpty()) {
			assertEquals(
					new Card(movedCard.getSuit(), 1, movedCard.isUncovered()),
					movedCard);
		} else {
			Card lastFoundationCard = moveWasteToFoundationsController.initialLastCardInFoundation();
			assertEquals(lastFoundationCard.getNumber()+1,movedCard.getNumber());
		}
		assertTrue(movedCard.isUncovered());
	}

}
