package com.programs.basicprograms;

import java.util.Scanner;

public class TwelfthDaysToYears {
public static void main(String[] args) {
	System.out.println("main method");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	System.out.println("enter the days::"+x);
	double farenheit= x/365;
	System.out.println("the converted days to years::"+farenheit);

}
}
