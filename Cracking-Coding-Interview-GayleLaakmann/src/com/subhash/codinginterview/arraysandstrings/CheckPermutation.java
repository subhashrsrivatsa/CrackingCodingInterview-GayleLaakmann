/**
 * 
 */
package com.subhash.codinginterview.arraysandstrings;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * 1.2 Given two strings, write a method to decide if one is a permutation of the other
 *
 */
public class CheckPermutation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String 1");
		String s1 = s.next();
		System.out.println("Enter the String 2");
		String s2 = s.next();
		
		System.out.println("The Permutations for string s1 and s2 is : "+checkPermutation(s1,s2));
		
		s.close();

	}

	private static boolean checkPermutation(String s1, String s2) {
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		int[] letters = new int[128];
		
		char[] s1_array = s1.toCharArray();
		for(char c : s1_array) {
			letters[c]++;
		}
		
		for(int i=0; i<s2.length();i++) {
			int c = (int) s2.charAt(i);
			letters[c]--;
			if(letters[c]<0) {
				return false;
			}
			
		}
		
		return true;
	}

}
