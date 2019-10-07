package com.programs.matrixprograms;

public class FifthEqualMatrices {
public static void main(String[] args) {
	int m1[][]= {{1,2,3},{4,25,6},{7,8,9}};
	int m2[][]= {{1,2,3,},{4,5,6},{7,8,9}};
	int count=0;
	for(int i=0;i<m1.length;i++) {
		for(int j=0;j<m1[i].length;j++) {
			//System.out.print(m1[i][j]);
			if(m1[i][j]==m2[i][j]) {
				//System.out.println("equal matrices");
				count=count+1;
			}
			else {
				//System.out.println("maytrices are not equal");
				count=0;
			}
		}
	}
	if(count>8) {
		System.out.println("matrices  equal");
	}else {
		System.out.println("matrices not equal");
	}
	
}
}
