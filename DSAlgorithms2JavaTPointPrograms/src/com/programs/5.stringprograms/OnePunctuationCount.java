package com.programs.stringprograms;

public class OnePunctuationCount {
public static void main(String[] args) {
	String str="Good Morning! Mr. James Potter. Had your breakfast?";
	int punMarks=0;
	
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='!'||str.charAt(i)=='.'||str.charAt(i)=='?') {
			punMarks++;
		}
	}
	System.out.println("total punc marks::"+punMarks);
}
}
