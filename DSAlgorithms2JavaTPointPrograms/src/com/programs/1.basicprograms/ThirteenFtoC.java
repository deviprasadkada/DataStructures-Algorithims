package com.programs.basicprograms;

import java.util.Scanner;

public class ThirteenFtoC {
public static void main(String[] args) {
	System.out.println("main method");
	Scanner sc=new Scanner(System.in);
	int farenheit=sc.nextInt();
	System.out.println("enter the temperature::"+farenheit);
	double celcius=((farenheit-32)*5)/9;
	System.out.println("the converted temperatujre in farenheit is::"+celcius);

}
}
