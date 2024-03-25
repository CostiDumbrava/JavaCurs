package curs5;

public class StringComparison {

	public static void main(String[] args) {
		
		String first = "Java";
		String second = "Code";
		String third = "Java";
		String fourth = new String("Java");
		
		System.out.println(first);
		System.out.println(third);
		System.out.println(fourth);
		
		
		System.out.println(first == third);
		System.out.println(first == second);
		System.out.println(first.equals(third));
		System.out.println(first.equals(second));
		
		System.out.println("------------------------------");
		
		System.out.println(first == fourth);
		
		System.out.println(first.equals(fourth));
	
		

	}

}
