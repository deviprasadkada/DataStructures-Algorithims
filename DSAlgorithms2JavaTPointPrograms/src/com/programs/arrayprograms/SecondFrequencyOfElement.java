package com.programs.arrayprograms;

public class SecondFrequencyOfElement {

public static void main(String[] args) {
	int a[]= {1,1,1,1,1,2,2,2,2,3,3,3,4,4,5};
	System.out.println("the array is::");
	for(int i:a) {
		System.out.print(i+" ");
	}
	System.out.println("the frequency of each element in the list is::");
	int count=1;
	for(int i=0;i<a.length-1;i++) {
		for(int j=i+1;j<a.length-1;j++);
		{
			if(a[i]==a[i+1]) {
				count++;
			}
			System.out.println(a[i]+" "+count);

		}
	}
	
}
}
