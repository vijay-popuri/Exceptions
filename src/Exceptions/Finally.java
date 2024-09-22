package Exceptions;

class Alpha3{
	void disp()throws ArithmeticException {
		try {
			int d=10/0;
		}
		catch(ArithmeticException e) {
			throw e;
		}
		finally {
			System.out.println("This is finallyyyy block.....!");
		}
	}
}
public class Finally {

	public static void main(String[] args)
	{
		Alpha3 al=new Alpha3();
		try {
			al.disp();
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		

	}

}
