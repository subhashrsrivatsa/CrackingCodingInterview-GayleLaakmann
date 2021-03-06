/**
 * 
 */
package com.subhash.codinginterview.arraysandstrings;

import java.util.Scanner;

/**
 * @author Subhash
 * 
 * 1.3 Write a method to replace all spaces in a string with '%20'
 *
 */
public class URLify {

	private static final int MAX = 1000;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] str = "Mr John Smith ".toCharArray();
		 
        // Prints the replaced string
        str = replaceSpaces(str);
 
        for (int i = 0; i < str.length; i++)
            System.out.print(str[i]);

	}

	private static char[] replaceSpaces(char[] str) {
		
		// find the number of spaces and current length 
		int space_count = 0,i=0;
		for(i=0;i<str.length;i++)
			if(str[i] == ' ')
				space_count++;
		// Find new length.
        int new_length = i + space_count * 2;
 
        // New length must be smaller than length
        // of string provided.
        if (new_length > MAX)
            return str;
 
        // Start filling character from end
        int index = new_length - 1;
 
        char[] old_str = str;
        str = new char[new_length];
 
        // Fill rest of the string from end
        for (int j = i - 1; j >= 0; j--) 
        {
 
            // inserts %20 in place of space
            if (old_str[j] == ' ') 
            {
                str[index] = '0';
                str[index - 1] = '2';
                str[index - 2] = '%';
                index = index - 3;
            } 
             
            else
            {
                str[index] = old_str[j];
                index--;
            }
        }
		return str;
	}

}
