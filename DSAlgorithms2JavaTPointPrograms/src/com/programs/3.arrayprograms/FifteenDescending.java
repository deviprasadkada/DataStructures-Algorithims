package com.programs.arrayprograms;

public class FifteenDescending {
public static void main(String[] args) {
	
	int arr[]= {112,234,798,55,230,985,2};
	System.out.println("Array before sorting::");
	for(int i:arr) {
		System.out.print(i+" ");
	}
	int temp=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	System.out.println("\nArray after sorting::");
	for(int i:arr) {
		System.out.print(i+" ");
	}
	
}
}
