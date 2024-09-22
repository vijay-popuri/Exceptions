package Exceptions;

class Alpha2{
	void disp()throws ArithmeticException{
		try {
			int c=10/0;
		}
		catch(ArithmeticException e) {
			throw e;//giving the exception object to the JVM manually
		}
	
	}
}
public class RetrowingException {

	public static void main(String[] args)
	{
		Alpha2 al=new Alpha2();
		try {
		al.disp();
		}
		catch(Exception e) {
			System.out.println();
		}

	}

}
