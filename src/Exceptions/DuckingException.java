package Exceptions;
class Alpha1{
	
	void disp() throws ArithmeticException{
		int a=10/0;
	}
}
public class DuckingException {

	public static void main(String[] args)
	{
		Alpha1 al=new Alpha1();
		try {
			al.disp();
		} catch (Exception e) {
			System.out.println("Hey Java Developer please enter non negetive integer in the denominator");
		}

	}
//if you not handle the exception in the caller then it again throws to default exception handler
}
