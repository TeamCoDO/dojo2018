package de.codingdojo.password;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PassWordGeneratorTest {

	private PassWordGenerator pwgen;

	@Before
	public void setUp() throws Exception {
		pwgen = new PassWordGenerator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testsplitSingleWord() {

		String meinPWString = "Wort";
		String[] myArr = new String[] { "Wort" };

		assertArrayEquals(myArr, pwgen.splitWords(meinPWString));

	}

	@Test
	public void testsplitSentence() {

		String meinPWString = "Mein Auto.";
		String[] myArr = new String[] { "Mein", "Auto." };

		assertArrayEquals(myArr, pwgen.splitWords(meinPWString));

	}

	@Test
	public void testsplitSentenceBlanks() {

		String meinPWString = "Mein Auto   .   ";
		String[] myArr = new String[] { "Mein", "Auto", "." };

		assertArrayEquals(myArr, pwgen.splitWords(meinPWString));

	}

	@Test
	public void testsplitSentence2() {

		String meinPWString = "Mein Auto .";
		String[] myArr = new String[] { "Mein", "Auto", "." };

		assertArrayEquals(myArr, pwgen.splitWords(meinPWString));

	}

	@Test
	public void testsplitWordsEmpty() {

		String meinPWString = "";
		String[] myArr = new String[] {};

		assertArrayEquals(myArr, pwgen.splitWords(meinPWString));

	}

	@Test
	public void testsplitWordsNull() {

		String meinPWString = null;
		String[] myArr = new String[] {};

		assertArrayEquals(myArr, pwgen.splitWords(meinPWString));

	}

	@Test
	public void testsplitTwoWords() {

		String meinPWString = "Mein Auto";
		String[] myArr = new String[] { "Mein", "Auto" };

		assertArrayEquals(myArr, pwgen.splitWords(meinPWString));

	}

	@Test
	public void testcountWords() {
		
		String meinPWString = "Mein Auto";
		String[] myArr = pwgen.splitWords(meinPWString);
		assertEquals(2, pwgen.countWords(myArr));
		
	}
	
	@Test
	public void testCountWordsSentence() {
		String meinPWString = "Mein Auto .";
		
		String[] myArr = pwgen.splitWords(meinPWString);
		assertEquals(3, pwgen.countWords(myArr));
	}
	
	@Test
	public void testCountWordsBlankSentence() {
		String meinPWString = "Mein Auto   .   ";
		
		String[] myArr = pwgen.splitWords(meinPWString);
		assertEquals(3, pwgen.countWords(myArr));

	}

	@Test
	public void testgetPassWordString() {
		String myPWSentence = "Mein Auto   .   ";
		String myPWString = "MA.3";
		
		assertEquals(myPWString,pwgen.getPassWordString(myPWSentence));
		
	}
	
	@Test
	public void testgetPassWordStringABN1() {
		String myPWSentence = "Mein Fahrrad fährt Tango.";
		String myPWString = "MFfT4";
		
		assertEquals(myPWString,pwgen.getPassWordString(myPWSentence));
		
	}
	
	@Test
	public void testgetPassWordStringABN2() {
		String myPWSentence = "Ein Passwort ist nur so gut , wie sein geheimer Platz .";
		String myPWString = "EPinsg,wsgP.12";
		
		assertEquals(myPWString,pwgen.getPassWordString(myPWSentence));
		
	}
	
	@Test
	public void testgetPassWordStringABN3() {
		String myPWSentence = "Selber programmieren ist überraschen !";
		String myPWString = "Spiü!5";
		
		assertEquals(myPWString,pwgen.getPassWordString(myPWSentence));
		
	}
	
	@Test
	public void testgetPassWordStringEmpty() {
		String myPWSentence = "";
		String myPWString = "";
		
		assertEquals(myPWString,pwgen.getPassWordString(myPWSentence));
		
	}

}
