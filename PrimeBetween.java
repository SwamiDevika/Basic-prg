package com.java.Devika;

import java.util.Scanner;

public class PrimeBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		/*
		 * find the given number is prime
		 */

		Scanner scan = new Scanner(System.in);

		int o = scan.nextInt();
		int n = scan.nextInt();
		isPrime(o, n);

	}

	private static void isPrime(int o, int n) {
		// TODO Auto-generated method stub

		while (o <= n) 
		{
			int count = 0;

			for (int i = 2; i <= o / 2; i++) {
				if (o % i == 0) {
					count++;
					break;
				}
			}

			if (count == 0) {
				System.out.println(o + " is prime number");
			}

			o++;
		}

	}
}
