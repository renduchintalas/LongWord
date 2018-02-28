package com.java.codetest.Longword;
/**
 * 
 */


import static org.junit.Assert.assertEquals;

import java.text.ParseException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author renduchintalas
 *
 */

public class LongWordTestCases {

	private CodeTest codetest ; 
	
	@Before
	public void setUp() throws Exception {
		CodeTest codetest= new CodeTest();
	}

	@After
	public void tearDown() throws Exception {
	}

  /** Negative Test case : This test looks with test string with spaces at starting **/ 
	
	@Test
	public void forTestingStringWithTrailingSpaces() throws ParseException{
			String testString= " this is yahoo";
			LongWord longword = codetest.LongWordDetails(testString);
			assertEquals(longword.getword(),"yahoo");
			assertEquals(longword.getwordlength(),5);
		
	}
	
	  /** Negative Test case : This test looks with test string only with spaces **/ 

	@Test
	public void forTestingStringWithJustSpaces() throws ParseException{
			String testString = "   ";
			LongWord longword = codetest.LongWordDetails(testString);
			assertEquals(longword.getword(),"Enter valid String");
			assertEquals(longword.getwordlength(),0);
		
	}

	/** Postive Test case : This test looks with test string with two words
	 *  having same number of word length **/ 
	
	@Test
	public void forTestingStringTwoWordsSameLength() throws ParseException{
			String testString = " yahoo times";
			LongWord longword = codetest.LongWordDetails(testString);
			assertEquals(longword.getword(),"yahoo");
			assertEquals(longword.getwordlength(),5);
		
	}
	
	/** Postive Test case : This test looks with test string with two words
	 *  having with spaces start and ending **/ 
	
	@Test
	public void forTestingStringTwoWordsWithMorethanOneSpaceInBetween() throws ParseException{
			String testString = " yahoo      yaho  ";
			LongWord longword = codetest.LongWordDetails(testString);
			assertEquals(longword.getword(),"yahoo");
			assertEquals(longword.getwordlength(),5);
	}
	
	/** Postive Test case : This test looks with test string with two words
			 *  having with spaces start and ending **/ 
	
	@Test
	public void forTestingCorrrectString() throws ParseException{
			String testString = "The cow jumped over the moon.";
			LongWord longword = codetest.LongWordDetails(testString);
			assertEquals(longword.getword(),"jumped");
			assertEquals(longword.getwordlength(),6);
	}
	
	/** Postive Test case : This test looks with character length same when fullstop is addded 
	 * at end, so fullstop is never considered word length **/ 
	@Test
	public void forTestingWordWithCharacterLengthAlongWithFullStop() throws ParseException{
			String testString = "The cow jumped over the moon.........";
			LongWord longword = codetest.LongWordDetails(testString);
			assertEquals(longword.getword(),"jumped");
			assertEquals(longword.getwordlength(),6);
	}
	
	  /** Negative Test case : This test looks with test NULL(Empty) string **/ 

	@Test
	public void forTestingNullString() throws ParseException{
			String testString = "";
			LongWord longword = codetest.LongWordDetails(testString);
			assertEquals(longword.getword(),"Enter valid String");
			assertEquals(longword.getwordlength(),0);
	}

}
