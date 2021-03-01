package com.java.Devika;
import java.util.Scanner;
public class Swap 
{
	public static void main(String[] a)
	{
		/*
		 * Swap numer using 3rd veriable
		 */
		Scanner scan=new Scanner(System.in);
		int a1=scan.nextInt();
		int a2=scan.nextInt();
		int temp=0;
		System.out.println("before swaping"+" "+a1+" "+a2);
//		temp=a1;
//		a1=a2;
//		a2=temp;
//		System.out.println("after swaping"+" "+a1+" "+a2);
		/*
		 * without using 3rd veriable
		 */
//		a1=a1+a2;
//		a2=a1-a2;
//		a1=a1-a2;
//		System.out.println("after swaping"+" "+a1+" "+a2);
		
//		a1=a1*a2;
//		a2=a1/a2;
//		a1=a1/a2;
//		System.out.println("after swaping"+" "+a1+" "+a2);
		
		a1=a1^a2;
		a2=a1^a2;
		a1=a1^a2;
		System.out.println("after swaping"+" "+a1+" "+a2);
		
	}

}
