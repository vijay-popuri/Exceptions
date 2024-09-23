package Exceptions;

import java.util.Scanner;

class InvalidCredentialsException extends Exception {
	public InvalidCredentialsException(String msg) {
		super(msg);
	}
}

class Atm {
	int username = 4321;
	int pswd = 1234;
	int un;
	int pw;

	void inpt() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username");
		un = sc.nextInt();
		System.out.print("Enter Password");
		pw = sc.nextInt();
		System.out.println(un);
		System.out.println(pw);

	}

	void verify() throws InvalidCredentialsException {
		if (un == username && pw == pswd) {
			System.out.println("Hey Logged In Collect your cash");
		} else {
			InvalidCredentialsException invc = new InvalidCredentialsException("try again");
			System.out.println(invc.getMessage());
			throw invc;

		}
	}

}

class Bank {
	void check() {
		Atm at = new Atm();
		try {
			at.inpt();
			at.verify();
		} catch (InvalidCredentialsException e) {
			System.out.println(e);
			try {
				at.inpt();
				at.verify();
			} catch (InvalidCredentialsException exception) {
				System.out.println(exception);
			}
			try {
				at.inpt();
				at.verify();
			} catch (InvalidCredentialsException exception) {
				System.out.println("please try again after sometime");
			}
		}
	}
}

public class UserDefinedExceptions1 {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.check();

	}

}
