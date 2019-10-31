package com.hk.algo;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int[] array = {9, 10, 1, 4, 77, 100, 20, 12};
		
		System.out.println(Arrays.toString(array));
		bubbleSort(array);		
		System.out.println(Arrays.toString(array));		
	}
	
	public static void bubbleSort(int[] array) {
		for(int i=1; i<=array.length; i++) {
			for(int z=0; z<array.length-i; z++) {
				int iL = z;
				int iR = z + 1;
				
				if(array[iL] > array[iR]) {
					int temp = array[iL];
					array[iL] = array[iR];
					array[iR] = temp;
				}				
			}
		}
	}
	
	public static void selectSort(int[] array) {
		for(int i=0; i<array.length-1; i++) {
			
			for(int z=i+1; z<array.length; z++) {
				
					if(array[i] > array[z]) {
						int temp = array[i];
						array[i] = array[z];
						array[z] = temp;
					}
			}
			
		}
	}
}












