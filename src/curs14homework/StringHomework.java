package curs14homework;

public class StringHomework {
	
	/* Avem urmatorul string : “Lorem ipsum dolor sit amet, consectetur
	 * adipiscing elit. Aliquam consectetur odio ac quam commodo, eu
	 * eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus,
	 * vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius
	 * malesuada. Nulla neque lacus, euismod quis erat nec, convallis
	 * vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat.
	 * Nulla elementum urna in dolor viverra, in efficitur lectus mattis.”
	 * 
	 * Vom face 4 metode :
	 * 1. Prima metoda va verifica de catre ori apare cuvantul “Nulla” in acest string si va printa numarul
	 * 2. A doua metoda va imparti stringul in cate propozitii cuprinde si le va printa fiecare pe randul ei in consola
	 * 3. A treia metoda va folosi metoda deleteCharAt() din StringBuilder pentru a sterge toate aparitiile literei ‘a’
	 * 4. A patra metoda va folosi clasa StringBuilder pentru a inlocui toate aparitiile literei ‘o’ cu caracterul ‘#’
	 */

	public static void main(String[] args) {
		
		String text = "Lorem ipsum dolor sit amet, consectetur "
				    + "adipiscing elit. Aliquam consectetur odio ac quam commodo, eu "
				    + "eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, "
				    + "vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius "
				    + "malesuada. Nulla neque lacus, euismod quis erat nec, convallis"
				    + "vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. "
				    + "Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";
		
		
		//1		
		checkWordIntoText("Nulla",text);
		
		System.out.println("---------------------------------------------------------------");
		
		//2
		checkSentencesFromText(text);
		
		System.out.println("---------------------------------------------------------------");
		
		//3
		deleteCharFromText('a', text);
		
		System.out.println("---------------------------------------------------------------");
		
		//4
		replaceCharFromText('o', '#', text);
	
		
	}
	
	public static void checkWordIntoText(String word, String text) {
			   
			int count=0;
			int j=0;
			String s;
			
			StringBuilder sb = new StringBuilder(text);
	
			    //transform fiecare cuvant despartit de spatiu, virgula sau punct intr-un substring pentru a-l compara cu ceea ce caut
			    //dar verific si lungimea pentru a nu a avea situatii cum ar e sirul Nullam care contine cuvantul cautat dar e de fapt diferit de Nulla
			 
				for (int i=0; i<sb.length();i++) {
					
					if ((sb.charAt(i) == ' ')||(sb.charAt(i) == '.')||(sb.charAt(i) == ',')) { //pot fi adaugate si restul semnelor de punctuatie
						s=sb.substring(j, i);
						if (s.contains(word)&& (s.length() == word.length())) {
							count++;	
						}
							
						    j=i+1;
						    
					}	
				}
				
			System.out.println("Cuvantul " +word +" apare de " +count +" ori in text.");	
	}
	
	
public static void checkSentencesFromText(String text) {
		
	    StringBuilder sb = new StringBuilder(text);
	    int j=0;
	    
		for (int i=0; i<sb.length();i++) {
			
			if (sb.charAt(i) == '.')    // || (sb.charAt(i) == '!')|| (sb.charAt(i) == '?')) in acest text exemplu, separator este doar semnul "."
					{ 
				System.out.println(sb.substring(j, i+1));
				    j=i+2;
			};
			
		}
		
}
	
	
	public static void deleteCharFromText(char ch, String text) {
		
	    StringBuilder sb = new StringBuilder(text);
				
		for (int i=0; i<sb.length();i++) {
			
			if(sb.charAt(i) == ch) {
				sb.deleteCharAt(i);
			}
		}
		
		System.out.println(sb);
}
	
public static void replaceCharFromText(char ch, char newCh, String text) {
		
	    StringBuilder sb = new StringBuilder(text);
				
		for (int i=0; i<sb.length();i++) {
			
			if(sb.charAt(i) == ch) {
				sb.setCharAt(i, newCh);
			}
		}
		
		System.out.println(sb);
}
	
	
	
}
