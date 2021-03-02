package com.java.Devika;

import java.util.Scanner;
public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * factorial of number
		 */
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		
		factorial(n);
	}

	private static void factorial(long n) {
		// TODO Auto-generated method stub
		long mul = 1;
		for (long i = n; i > 0; --i) {
			mul *= i;
		}
		System.out.println(mul);
	}

}
