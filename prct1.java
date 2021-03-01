package com.java.Devika;

import java.util.Scanner;

public class prct1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("printing natural number using for() loop");
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		System.out.println("printing natural number using while() loop");
		int i = 1;
		while (i <= n) {
			System.out.println(i);
			++i;
		}
	}

}
