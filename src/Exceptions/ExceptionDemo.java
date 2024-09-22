package Exceptions;

import java.util.Scanner;

public class ExceptionDemo
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter Numerator");
			int a=sc.nextInt();
			System.out.println("Enter denominator");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("Please enter non-zero in denominator.....!");
		}
	}

}
