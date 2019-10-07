package com.programs.arrayprograms;

public class NinthLargestElement {
public static void main(String[] args) {
	int arr[]= {112,234,798,55,230,985,2};
	int max=arr[0];
	
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]>max) {
			max=arr[i];
			System.out.println("largest element is:"+max);
		}
	}
	
}
}
