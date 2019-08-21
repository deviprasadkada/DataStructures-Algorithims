package com.programs.matrixprograms;

import java.util.Arrays;

public class SecondMatrixSub {
public static void main(String[] args) {
	int [][]a= {{1,2,3},{4,5,6}};
	int [][]b=  {{1,2,3},{4,5,6}};
	int [][]c = new int[3][3];
	System.out.println("Printing an array a");
	for(int[]i:a) {
		System.out.println(Arrays.toString(i));
	}
	System.out.println("Substraction of two matrices");
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			c[i][j]=a[i][j]-b[i][j];
			System.out.print(c[i][j]+" ");
		}
		System.out.println(" ");
	}
	System.out.println("multiplication of two matrices");
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			c[i][j]=a[i][j]*b[i][j];
			System.out.print(c[i][j]+" ");
		}
		System.out.println(" ");
	}
	
}
}
