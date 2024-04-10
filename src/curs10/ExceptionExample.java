package curs10;

public class ExceptionExample {

	public static void main(String[] args) {
		String [] week = {"L", "Ma", "Mi", "J", "V", "S", "D"};
		  //index           0   1    2     3    4    5    6 
		
		
		try {
		System.out.println(week[7]); //exceptie, ne iese din executie in acest moment
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("A aparut o eroare");
			e.printStackTrace();
			
		}
		
		
		System.out.println("Some other code!");
		
		
		
	}

}
