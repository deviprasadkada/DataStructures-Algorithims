package com.programs.matrixprograms;

public class ElevenTransposeMatrix {
public static void main(String[] args) {
	int m1[][]= {{1,2,3},{4,5,6},{7,8,9}};

	for(int i=0;i<m1.length;i++) {
		for(int j=0;j<m1[i].length;j++) {
			System.out.print(m1[j][i]+" ");
		}
		System.out.println(" ");
	}
	
}
}
