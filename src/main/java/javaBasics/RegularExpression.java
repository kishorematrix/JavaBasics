package javaBasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A regular expression is a sequence of characters that forms a search pattern. 
		//When you search for data in a text, you can use this search pattern to describe what you are searching for.

		/*
		 * A regular expression can be a single character, or a more complicated pattern.
		 * Regular expressions can be used to perform all types of text search and text replace operations.
		 * Java does not have a built-in Regular Expression class, but we can import the java.util.regex package to work with regular expressions. The package includes the following classes:
		 * Pattern Class - Defines a pattern (to be used in a search)
		 * Matcher Class - Used to search for the pattern
		 * PatternSyntaxException Class - Indicates syntax error in a regular expression pattern
		 * 
		 */

		/*
		 * In this example, The word "w3schools" is being searched for in a sentence.
		 * First, the pattern is created using the Pattern.compile() method. 
		 * The first parameter indicates which pattern is being searched for and the second parameter has a flag to indicates that the search should be case-insensitive. 
		 * The second parameter is optional.
		 * The matcher() method is used to search for the pattern in a string. 
		 * It returns a Matcher object which contains information about the search that was performed.
		 * The find() method returns true if the pattern was found in the string and false if it was not found.
		 */

		/*
		 * Example :  Regular expression for an email address :
		 * ^([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})$ 
		 */
		
		
		//// Create a pattern to be searched
        // Custom pattern
		Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
		
		// Search above pattern in "Visit W3Schools!"
		Matcher matcher = pattern.matcher("Visit W3Schools!");
		System.out.println(matcher);
		
		// Finding string using find() method

		
		 // Finding string using find() method
		 // Print starting and ending indexes
        // of the pattern in the text
        // using this functionality of this class
        while (matcher.find()) {
            System.out.println("Pattern found from " + matcher.start() + " to "+ (matcher.end() - 1));
        }
		boolean matchFound = matcher.find();
		System.out.println(matchFound);
		if(matchFound) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		}
		
		
		// Checking all the strings using regex
        System.out.println(Pattern.matches("[b-z]?", "a"));
 
        // Check if all the elements are in range a to z
        // or A to Z
        System.out.println(
            Pattern.matches("[a-zA-Z]+", "GfgTestCase"));
 
        // Check if elements is not in range a to z
        System.out.println(Pattern.matches("[^a-z]?", "g"));
 
        // Check if all the elements are either g,e,k or s
        System.out.println(
            Pattern.matches("[geks]*", "geeksgeeks"));
        
        // Check if all elements are numbers
        System.out.println(Pattern.matches("\\d+", "1234"));
 
        // Check if all elements are non-numbers
        System.out.println(Pattern.matches("\\D+", "1234"));
 
        // Check if all the elements are non-numbers
        System.out.println(Pattern.matches("\\D+", "Gfg"));
 
        // Check if all the elements are non-spaces
        System.out.println(Pattern.matches("\\S+", "gfg"));
	}

	/*Flags in the compile() method change how the search is performed. Here are a few of them:
	 * Pattern.CASE_INSENSITIVE - The case of letters will be ignored when performing a search.
	 *Pattern.LITERAL - Special characters in the pattern will not have any special meaning and will be treated as ordinary characters when performing a search.
	 *Pattern.UNICODE_CASE - Use it together with the CASE_INSENSITIVE flag to also ignore the case of letters outside of the English alphabet
	 */
}
