package com.java.Devika;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		 * find the given number is prime
		 */
		int count=0;
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    for(int i=2;i<=n/2;i++)
    {
    if(n%i==0)
    {
    	count++;
    	break;
    }
    System.out.println(count);
	}
    if(n==1)
    {
    	System.out.println(n+" is composite number");
    }
    
    else if(count==0)
    {
    	System.out.println(n+" is prime number");
    }
    else
    	System.out.println(n+" is not prime number");
	}

}
