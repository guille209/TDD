package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import solitario.controllers.MoveWasteToFoundationController;
import solitario.entities.Card;
import solitario.entities.FoundationList;

public class MoveFoundationToTableauControllerTest {

	private MoveFoundationToTableauController moveFoundationToTableauController;

	@Before
	public void before() {
		Random r = new Random();
		int tableau = r.nextInt(12);
		int foundationCards = r.nextInt(12);

		moveFoundationToTableauController = new MoveFoundationToTableauController(
				foundationCards, tableau);
	}

	
}
