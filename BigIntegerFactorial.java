package com.java.Devika;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * factorial of number using bigInteger class. primitive data type undergo
		 * overflow to overcome this we use bigInteger
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		factorial(n);
	}

	private static void factorial(int n) {
		// TODO Auto-generated method stub
		//BigInteger b1= BigInteger.ZERO;
//		BigInteger b= BigInteger.TEN;
//		BigInteger b= BigInteger.TWO;
//		BigInteger b= BigInteger.ONE;
//				BigInteger b=new BigInteger("1");---->collected string type of data and store as integer
		BigInteger b = BigInteger.valueOf(1);// ---->collected integer type of data and store as integer
		for (int i = n; i > 0; --i) {
			// inbuilt method of multiply present in bigIntger
			b = b.multiply(BigInteger.valueOf(i));
		}
		System.out.println(b);
	}

}
