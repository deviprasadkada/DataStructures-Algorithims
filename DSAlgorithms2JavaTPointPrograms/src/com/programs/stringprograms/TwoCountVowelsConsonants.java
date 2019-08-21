package com.programs.stringprograms;

public class TwoCountVowelsConsonants {

	public static void main(String[] args) {

		//String str="This is a really simple sentence";
		String str="The quick brown fox jumps over the lazy dog";
		int vow=0;
		int con=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vow++;
			}else {
				con++;
			}
		}
		
		System.out.println("number of vowels::"+vow);
		System.out.println("number of consonants::"+con);
	}

}
