package Exceptions;

import java.util.Scanner;

class Alpha {
	public void disp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numerator");
		int a = sc.nextInt();
		System.out.println("Enter denominator");
		int b = sc.nextInt();
		int c = a / b;
		System.out.println("The result is " + c);

	}
}

class Beta {

	void show() {
		Alpha al = new Alpha();
		al.disp();
	}

}

public class ClassHirarchyUsingExceptions {

	public static void main(String[] args) {
		try {
			Beta b = new Beta();
			b.show();
		} catch (Exception e) {
			System.out.println("Something occured");
		}

	}

}
