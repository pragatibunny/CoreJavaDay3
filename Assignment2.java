/**
 *Program to replace all the 'd' occurrence characters with ‘h’ characters in each string. 
 */
package com.hcl;

/**
 * @author Pragati Sharma
 *
 */
public class Assignment2 {

	public static void main(String[] args) {
		String string = "My dog has a good appetite, my dog is good indeed";

		// Convert the above string to all lowercase.
		String lowerString = string.toLowerCase();
		// Now replacing the above 'd' occurrence characters with ‘h’ characters
		String replacedString = lowerString.replace('d', 'h');

		// Displaying the two strings for the comparison.
		System.out.println("Original String: " + string);
		System.out.println("String with replacement of d with h: " + replacedString);

	}

}
