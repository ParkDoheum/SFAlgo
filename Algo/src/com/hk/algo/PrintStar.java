package com.hk.algo;

public class PrintStar {
	public static void main(String[] args) {
		reversePrintStar(7);
	}

	 public static void reversePrintStar(int line) {
		for(int z=0; z<line; z++) {
			for(int i=0; i<line; i++) {
				if(i < (line - (z+1))) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public static void printStar(int line) {
		for (int z = 0; z < line; z++) {
			for (int i = 0; i <= z; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	
}
