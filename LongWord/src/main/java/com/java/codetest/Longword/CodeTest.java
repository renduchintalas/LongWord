package com.java.codetest.Longword;

import java.util.Scanner;

/**
 * Problem:
 * Longest Word in string
 *
 * @author renduchintalas
 
 * Assumptions:
 * When two words in single sentence has same number of characters then first word is considered longest.
 * Full Stop character (.) is never considered as a character in word
 */

public class CodeTest {
	
    public static LongWord LongWordDetails(String str)
    {
    	/**  verify and trim for any extra spaces at start and end, also remove "." from string as this 
    	 * shouldnt be taken as character**/

    	str=str.trim().replace(".", "");

    	/** Base case: When string is null **/

        if (str == null)
        {
            return new LongWord("Enter valid String",0);
        }  
        
        String lw="";

        /** Length of given string and Initialize integers  **/
        
        int s=str.length(),l=0,lengthofword=0;
        
        /** Split strings based on each space between words **/

        String words[]=str.split(" ");
        
        /** Base case: When string is empty **/
        
        if (str.length()==0)
        {
            return new LongWord("Enter valid String",0);
        }
        
        /** Loop through all words **/
         
        for(String word:words)
        {
        	/** After splitting each word make sure there are no extra spaces added for each word 
        	/* For example sentence like "this is   yahoo", splits into "this","is","  yahoo" 
        	 * validating length of word trim unwanted extra space in word as well 
        	 * removes all whitespaces and non-visible characters (e.g., tab, \n)**/
        	 
        	word= word.replaceAll("\\s+","");
        	
        	/**Start with word length Zero and if word length is greater than previous word length 
        	 * then consider shares the that as longest word
        	 */
        	    if(word.length()>l)
                {
                        lw=word;
                        l = word.length();
                }
            
        	                  	
        }
        
        /** Length of word **/
        
        lengthofword= lw.length();
        
        /** return actual word and length of word to constructor  **/
        
        return new LongWord(lw,lengthofword);
        
    }
    
    /** Below main method is created for standalone testing this java file**/
    
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.printf("Enter a sentence to get longest word:");
        String str=scr.nextLine();
        str+=" ";
        LongWord longword=  LongWordDetails(str);
        System.out.println("LONGEST WORD : "+longword.word);
        System.out.println("LENGTH OF LONGEST WORD : "+ longword.wordlength);
        
    }
}

