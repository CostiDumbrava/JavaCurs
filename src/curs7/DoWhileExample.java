package curs7;

public class DoWhileExample {

	public static void main(String[] args) {
	
		String[] array = {"Iasi", "Cluj", "Brasov", "Pitesti"};
       //index               0      1         2        3
		
		int i = 0;
		
		while(i> array.length) {
			System.out.println(array[i]);
			i++;
			
			
		}
		System.out.println("--------------------");
		
		//in cazul while ului nu intru in bucla daca conditia este falsa, dar in do while intru indiferent de conditie si va executa 1 data
		
		int j=0;
		do {
			System.out.println(array[j]);
			j++;
					
		} while(j> array.length);
		
	}

}
