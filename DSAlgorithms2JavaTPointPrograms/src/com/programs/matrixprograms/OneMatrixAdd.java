package com.programs.matrixprograms;

import java.util.Arrays;

public class OneMatrixAdd {
public static void main(String[] args) {
	int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
	int [][]b=  {{1,2,3},{4,5,6},{7,8,9}};
	int [][]c = new int[3][3];
	//one representation of matrix
	for(int[] i:a) {
	System.out.println(Arrays.toString(i));
	}
	//another represntation of matrix
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println(" ");
	}
	//performing matrix addition
	System.out.println("Addition of two matrices A & B");
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]+" ");
		}
		System.out.println(" ");
	}
	
	
	
}
}
