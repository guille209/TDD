package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MoveDeckToWasteControllerTest.class,
		MoveWasteToFoundationControllerTest.class, StartControllerTest.class,
		MoveFoundationToTableauControllerTest.class })
public class AllTests {

}
