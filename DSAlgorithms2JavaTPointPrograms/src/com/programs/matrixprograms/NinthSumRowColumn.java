package com.programs.matrixprograms;

public class NinthSumRowColumn {
	public static void main(String[] args) {
		int m1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int rows,cols,sumRow,sumCol;
		rows=m1.length;
		cols=m1[0].length;
		for( int i=0;i<rows;i++) {
			sumRow=0;
			for(int j=0;j<cols;j++) {
			sumRow=sumRow+m1[i][j];	
			}
			System.out.println("sum of row is::"+sumRow);
		}
		
		for( int i=0;i<rows;i++) {
			sumRow=0;
			for(int j=0;j<cols;j++) {
			sumRow=sumRow+m1[j][i];	
			}
			System.out.println("sum of col is::"+sumRow);
		}
		
		
	}
}
