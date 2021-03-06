/**
 * 
 */
package com.subhash.codinginterview.arraysandstrings;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * 1.1 Implement an algorithm to determine if a string has all unique characters
 *
 */
public class IsUnique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Entyer the string of your choice");
		String input = s.next();
		System.out.println(IsUnique.isUnique(input));
		s.close();

	}

	private static boolean isUnique(String input) {
		
		if(input.length() > 10)
			return false;
		boolean[] char_set = new boolean[128];
		for(int i=0; i<input.length(); i++) {
			int val = input.charAt(i);
			if(char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
 		return true;
				
	}

}
