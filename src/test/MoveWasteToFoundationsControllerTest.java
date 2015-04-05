package test;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import solitario.MoveDeckToWasteController;

public class MoveWasteToFoundationsControllerTest {

	
	
	@Before
	public void before(){
		Random r = new Random();
		int wasteCards = r.nextInt(30) + 1;
		int foundation1Cards = r.nextInt(12) + 1;
		int foundation2Cards = r.nextInt(12) + 1;
		int foundation3Cards = r.nextInt(12) + 1;
		int foundation4Cards = r.nextInt(12) + 1;
		moveWasteToFoundationsController = new MoveWasteToFoundationsController(wasteCards,
				foundation1Cards,foundation2Cards,foundation3Cards,foundation4Cards);
	}

}
