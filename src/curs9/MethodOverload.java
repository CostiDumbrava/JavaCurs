package curs9;

public class MethodOverload {

	public static void main(String[] args) {
		System.out.println(multiply(2,3));
		
		System.out.println(multiply(2, 2.5));

		System.out.println(500);//integer
		System.out.println("500");// String
		System.out.println(500.6);//double
		System.out.println('5');//char 
		
		
		
	}

	public static int multiply(int num1, int num2) {
		
		return num1*num2;
	}
		
		public static double multiply(int num1, double num2) {
			
			return num1*num2;
	}
}
