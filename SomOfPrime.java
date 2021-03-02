package com.java.Devika;

import java.util.Scanner;

public class SomOfPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		sum of n prime number
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int j = 1;
		int count = 0;
		int sum = 0;

		while (count <= n) {
			++j;
			boolean b = isPrime(j);
			if (b == true) {
				sum += j;
				count++;
			}
			if (count == n) {
				break;
			}

		}
		System.out.println(sum);
	}

	private static boolean isPrime(int j) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 2; i <= j / 2; i++) {

			if (j % i == 0) {
				count++;
				break;
			}

		}
		if (j == 1) {

			return false;
		}

		else if (count == 0) {
			return true;
		} else
			return false;
	}

}
