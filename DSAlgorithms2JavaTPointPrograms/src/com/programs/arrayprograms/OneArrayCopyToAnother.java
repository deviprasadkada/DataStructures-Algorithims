package com.programs.arrayprograms;

public class OneArrayCopyToAnother {

	public static void main(String[] args) {

		int []arr1= {1,2,3,4,5};
		//System.out.println(arr1.length);
		int []arr2 = null;
		for(int i:arr1) {
			System.out.println(i);
		}
		arr2=arr1;
		
		System.out.println("the copied array is:");
		for(int j:arr2) {
			System.out.println(j);
		}
		System.out.println("the new copied array");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}

	}

}
