package com.java.Devika;
import java.util.Scanner;
public class TwinPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * to print twin prime numbers for given value of n. Twin prime number are prime
		 * number whose difference is 2 and only one composite number in between them.
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int j = 1;
		j++;
		System.out.println("twin prime number present upto n");
		isTwin(n);
	}

	private static void isTwin(int n) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= n; i++) {
			if (isPrime(i) && isPrime(i + 2)) {
				System.out.println(i + "&" + (i + 2));

			}
		}

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
		if (count == 0) {
			return true;
		} else
			return false;
	}
}
