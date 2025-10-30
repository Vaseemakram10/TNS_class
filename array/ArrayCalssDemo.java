package com.tnsif.array;

import java.util.Arrays;

public class ArrayCalssDemo {
public static void main(String[] args) {
	int[] arr= {10,20,30,40};
	for(int num:arr) {
		System.out.print(num+" ");
	}
	System.out.println(Arrays.toString(arr));
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
}
}
