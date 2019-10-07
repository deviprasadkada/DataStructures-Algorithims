package com.programs.matrixprograms;

public class FourthSparse {
public static void main(String[] args) {
	//matix represntation simply with colons
	int m[][]=new int[3][3];
	m[0]=new int[] {1,2,3};
	m[2]=new int[] {7,8,9};
	for(int []m1:m) {
	for(int m2:m1) {
		System.out.print(m2);
	}
	System.out.println();
	}
	boolean flag=true;
	// identity matix second tiome practice
	int s[][]= {{1,0,0},{0,1,0},{0,0,1}};
	
	for(int i=0;i<s.length;i++) {
		for(int j=0;j<s.length;j++) {
			if(i==j&&s[i][j]!=1) {
				flag=false;
				break;
			}if(i!=j&&s[i][j]!=0) {
				flag=false;
				break;
			}
		}
	}
	if(flag) {
		System.out.println("identity matrix");
	}else {
		System.out.println("not an identity matrix");
	}
	
	//sparse matrix
	int sm[][]= {{2,0,0},{0,1,0},{0,0,1}};
	int rows=sm.length;
	int cols=sm[0].length;
	int size=rows*cols;
	int count=0;
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			if(sm[i][j]==0) {
				count++;
			}
		}
	}
	if(count>(size/2)) {
		System.out.println("sparse matrix");
	}
	else {
		System.out.println("not a sparse matrix");
	}
}
}
