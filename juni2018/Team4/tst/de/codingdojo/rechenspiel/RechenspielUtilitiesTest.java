/**
 * 
 */
package de.codingdojo.rechenspiel;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**

 *
 */
public class RechenspielUtilitiesTest {
	private Rechenspiel rechenspiel;
	
	@Before
	public void setUp() throws Exception {

		rechenspiel = new Rechenspiel();
	}
	
	@Test
	public void isNumberTrueTest() {
		assertTrue(RechenspielUtilities.isNumber("9"));
	}	

	@Test
	public void isNumberFalseTest() {
		assertFalse(RechenspielUtilities.isNumber("x"));
	}
	
	@Test
	public void isRangeTrueTest() {
		rechenspiel.setRange(15);
		assertTrue(RechenspielUtilities.isRange(10, rechenspiel.getRange()));
	}


	@Test
	public void isRangeFalseTest() {
		rechenspiel.setRange(9);
		assertFalse(RechenspielUtilities.isRange(10, rechenspiel.getRange()));
	}
	
	@Test
	public void isOperationValidateAdditionTrueTest() {
		assertTrue(RechenspielUtilities.isOperationValidate("++"));
	}
	
	@Test
	public void isOperationValidateSubtraktionTrueTest() {
		assertTrue(RechenspielUtilities.isOperationValidate("--"));
	}
	
	@Test
	public void isOperationValidateAdditionSubtraktionTrueTest() {
		assertTrue(RechenspielUtilities.isOperationValidate("-+"));
		assertTrue(RechenspielUtilities.isOperationValidate("+-"));
	}

	@Test
	public void isOperationFalseTest() {
		rechenspiel.setRange(9);
		assertFalse(RechenspielUtilities.isRange(10, rechenspiel.getRange()));
	}

	@Test
	public void generateNumberInRangeTest() {
		rechenspiel.setRange(9);
		assertTrue(RechenspielUtilities.generateNumber(rechenspiel.getRange()) <= rechenspiel.getRange());
	}
	

}
