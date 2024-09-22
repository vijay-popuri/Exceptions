package Exceptions;

import java.util.Scanner;

public class SingleTryMultipleCatches {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Kindly Enter Numerator");
			int a=sc.nextInt();
			System.out.println("Kindly Enter Denominator");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("The result of the division is "+c);
			System.out.println("Enter the size of the Array");
			int size=sc.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter the element to insert in the array....");
			int ele=sc.nextInt();
			System.out.println("Enter the index to insert");
			int index=sc.nextInt();
			arr[index]=ele;
			System.out.println("the element is "+arr[index]);
		}
		catch(ArithmeticException ae) {
			System.out.println("It is ArithMetic Exception");
		}
		catch(ArrayIndexOutOfBoundsException asi) {
			System.out.println("You are trying to retrieve the element beyond the size");
		}
		catch(NegativeArraySizeException nas) {
			System.out.println("You Entered the negative size of the array please enter the positive size innext time");
		}
		catch(Exception e) {
			System.out.println("Some problem occured");
		}
		System.out.println("Connecction get terminated....!");
	}
	

	//Here for each error corresponding catch block gets executed if not final catch executes
}
