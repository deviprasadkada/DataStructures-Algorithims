package com.programs.matrixprograms;

import java.util.Arrays;

public class ThirdIdentityMatrix {
public static void main(String[] args) {
	int a[][]= {{1,0,0},{0,1,0},{0,0,1}};
	boolean b = true;
	for(int[] i:a) {
		System.out.println(Arrays.toString(i));
	}
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			if(i==j && a[i][j]!=1) {
				//System.out.println("identity matrix at:"+(i+1)+"*"+(j+1));
			b=false;
			break;
			}
			
			if(i!=j && a[i][j]!=0){
				b=false;
				break;
			}
				/*
				 * else { System.out.println("not a identity matrix"); }
				 */
		}
	}
	if(b) {
		System.out.println("identity matrix");
	}
	else {
		System.out.println("not a identity matrix");
	}
}
}
