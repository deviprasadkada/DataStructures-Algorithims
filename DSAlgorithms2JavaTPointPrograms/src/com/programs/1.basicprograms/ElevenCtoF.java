package com.programs.basicprograms;

import java.util.Scanner;

public class ElevenCtoF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("enter the temperature::"+x);
		double farenheit= ((x * 9) / 5) + 32;
		System.out.println("the converted temperatujre in farenheit is::"+farenheit);

	}

}
