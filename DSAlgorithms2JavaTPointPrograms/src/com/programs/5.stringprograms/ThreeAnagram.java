package com.programs.stringprograms;
import java.util.Arrays;



public class ThreeAnagram {

	public static void main(String[] args) {

		String str1="Grabel";
		String str2="Blerag";
		
        str1 = str1.toLowerCase();  
        str2 = str2.toLowerCase();  
		
        char[] string1 = str1.toCharArray();  
        char[] string2 = str2.toCharArray();  

        Arrays.sort(string1);
        Arrays.sort(string2);
        
        if(Arrays.equals(string1,string2)==true) {
        	System.out.println("Both strings are anagram");
        }
        else {
        	System.out.println("both strings are not anagram");
        }
		
	}

}
