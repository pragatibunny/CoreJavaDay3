/**
 *Accept a string, and two indices(integers), 
 *and print the substring consisting of all characters inclusive range from ..to .   
 */
package com.hcl;

/**
 * @author Pragati Sharma
 *
 */
public class Assignment5 {
	public static void main(String[] args) {
		String string = "PragatiSharma";
		// to extract the substring from the string
		String subString = string.substring(3,7);

		// Displaying the two strings for the comparison.
		System.out.println("Original String: " + string);
		System.out.println("Substring is: " + subString);

	}

}
