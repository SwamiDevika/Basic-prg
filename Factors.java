package com.java.Devika;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * to find the factors of  number
		 */
		int count=0;
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println("using for loop");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				count++;
			}	
		}
		System.out.println(count);
//		System.out.println("using while loop");
//		int i=1;
//		while(i<=n) 
//		{
//			if(n%i==0)
//			{
//			System.out.print(i+" ");
//			i++;
//			}
//		}

	}

}
