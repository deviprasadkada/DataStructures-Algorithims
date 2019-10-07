package com.programs.matrixprograms;

public class EightOddEvenFrequency {
public static void main(String[] args) {
	int m1[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int oddcount=0;
	int evencount=0;
	
	
	for(int i=0;i<m1.length;i++) {
		for(int j=0;j<m1[i].length;j++) {
			if(m1[i][j]%2==0) {
				evencount=evencount+1;

			}
			else {
				oddcount=oddcount+1;
			}
			System.out.print(m1[i][j]+" ");
		}
		System.out.println(" ");
	}
	
	System.out.println("evens frequency is:"+evencount);
	System.out.println("odd frequency is:"+oddcount);

	
}
}
