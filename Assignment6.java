/**
 *Take a string , print ‘Yes’ if it is a palindrome, otherwise print ‘No’. 
 */
package com.hcl;

/**
 * @author Pragati Sharma
 *
 */
import java.util.*;

public class Assignment6 {
	public static void main(String[] args) {

		String string;
		String reversedString = "";
		@SuppressWarnings("resource")
		// Taking the input string
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		string = Scanner.nextLine();
		// Convert the above string to all lowercase.
		String lowerString = string.toLowerCase();
		int length = string.length();
		for (int i = length - 1; i >= 0; i--) {
			// Reversing the String
			reversedString = reversedString + lowerString.charAt(i);
		}
		// Comparing the two Strings
		if (lowerString.equals(reversedString)) {
			System.out.println("The given string is a palindrome.");
		} else {
			System.out.println("The given string is not a palindrome.");

		}

	}

}
