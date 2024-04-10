package curs10;

public class ExceptionExample2 {

	public static void main(String[] args) {
		
		try {
			//String nume = "Maria";
			String nume = null;
			System.out.println("Lungimea numelui este de " + nume.length());
			
		}catch (Exception e) {
			//nu punem mereu Exception pt ca prinde orice fel de eroare, si nu vrem asta intotdeauna
			System.out.println("Exception occured");
			System.out.println(3/0);
			
			
		} finally {
			System.out.println("Finally block of code");
			//finally se executa mereu, chiar si cand e o exceptie ne prinsa, deci executa finally si apoi face exit
			//folosim finally atunci cand avem nevoie de un clean up
			
		}
		
    System.out.println("Code after Try-Catch");
    
    
	}

}
