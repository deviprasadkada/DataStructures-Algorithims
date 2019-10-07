package com.programs.matrixprograms;

public class SeventhupperTraingularMatrix {
public static void main(String[] args) {
	int m1[][]= {{1,2,3,34},{4,5,6,67},{7,8,9,65},{23,45,67,89}};

	for(int i=0;i<m1.length;i++) {
		for(int j=0;j<m1[i].length;j++) {
			if(i>j) {
				m1[i][j]=0;
			}
			System.out.print(m1[i][j]+" ");
		}
		System.out.println(" ");
	}
	
}
}
