package test;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import solitario.Card;

public class MoveDeckToWasteControllerTest {

	
	private MoveDeckToWasteController moveDeckToWasteControllerTest;


	@Before
	public void before(){
		Random r = new Random();
		int deckCards = r.nextInt(29);
		int wasteCards = r.nextInt(29);
		moveDeckToWasteControllerTest = new moveDeckToWasteController();
	}
}
