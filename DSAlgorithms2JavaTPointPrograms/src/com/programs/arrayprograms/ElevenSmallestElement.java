package com.programs.arrayprograms;

public class ElevenSmallestElement {
public static void main(String[] args) {
	int arr[]= {112,234,798,55,230,985,2};
	int min=arr[0];
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}	}
	System.out.println("smallest element is:"+min);
}
}
