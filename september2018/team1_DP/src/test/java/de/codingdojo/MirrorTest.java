package de.codingdojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class MirrorTest {

	@Test
	public void testGetLastIndex() {
		Mirror mirror = new Mirror();
		String text2Test = "test";
		
		int lastIndex = mirror.getLastIndex(text2Test);
		
		assertEquals(3, lastIndex);
	}

	@Test
	public void testGetLastIndexTextIsNull() {
		Mirror mirror = new Mirror();
		String text2Test = null;
		
		int lastIndex = mirror.getLastIndex(text2Test);
		
		assertEquals(-1, lastIndex);
	}

	@Test
	public void testGetLastIndexTextIsEmpty() {
		Mirror mirror = new Mirror();
		String text2Test = "";
		
		int lastIndex = mirror.getLastIndex(text2Test);
		
		assertEquals(-1, lastIndex);
	}

	@Test
	public void testGetMirrorText() {
		Mirror mirror = new Mirror();
		String text2Test = "test";
		
		String mirrortext = mirror.getMirrorText(text2Test);
		
		assertEquals("tset", mirrortext);
	}

	@Test
	public void testGetMirrorTextTextIsNull() {
		Mirror mirror = new Mirror();
		String text2Test = null;
		
		String mirrortext = mirror.getMirrorText(text2Test);
		
		assertEquals("", mirrortext);
	}

	@Test
	public void testGetMirrorTextTextIsEmpty() {
		Mirror mirror = new Mirror();
		String text2Test = "";
		
		String mirrortext = mirror.getMirrorText(text2Test);
		
		assertEquals("", mirrortext);
	}


	@Test
	public void testReplaceChar01() {
		Mirror mirror = new Mirror();
		char char2Test = '(';
		
		String mirrortext = mirror.getReplaceChar(char2Test);
		
		assertEquals(")", mirrortext);
	}

	@Test
	public void testReplaceChar01I() {
		Mirror mirror = new Mirror();
		char char2Test = ')';
		
		String mirrortext = mirror.getReplaceChar(char2Test);
		
		assertEquals("(", mirrortext);
	}

	@Test
	public void testReplaceChar02() {
		Mirror mirror = new Mirror();
		char char2Test = '[';
		
		String mirrortext = mirror.getReplaceChar(char2Test);
		
		assertEquals("]", mirrortext);
	}

	@Test
	public void testReplaceChar02I() {
		Mirror mirror = new Mirror();
		char char2Test = ']';
		
		String mirrortext = mirror.getReplaceChar(char2Test);
		
		assertEquals("[", mirrortext);
	}

	@Test
	public void testReplaceChar03() {
		Mirror mirror = new Mirror();
		char char2Test = '{';
		
		String mirrortext = mirror.getReplaceChar(char2Test);
		
		assertEquals("}", mirrortext);
	}

	@Test
	public void testReplaceChar03I() {
		Mirror mirror = new Mirror();
		char char2Test = '}';
		
		String mirrortext = mirror.getReplaceChar(char2Test);
		
		assertEquals("{", mirrortext);
	}

}
