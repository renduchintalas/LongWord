package com.java.codetest.Longword;


/** 
 * 
 * @author renduchintalas
 *
 */
public class LongWord

{
	
	public final String word;
	public final int wordlength;
	
	/**
	  * Constructor.
	  * 
	  * @param word (required) Any String  
	  * 
	  * @param wordlength (required) Any integer.
	  * 
	  */
	
	public LongWord(String word, int wordlength){
		this.word = word;
		this.wordlength = wordlength;
		
	}
	
	 /** Return word passed to the constructor.  */
	public String getword(){
        
		return word;
    }
	
	 /** Return wordlength passed to the constructor.  */
	public int getwordlength(){
	    	
        return wordlength;
    }

}