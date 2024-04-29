package curs14;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		reverseString("masina");
		
		replaceFromString("Salut Popescu", 6, 13 ,"Oana");//permite sa ies dincolo de ultimul caracter
	                   //0123456789101112
		
		
		deleteFromString("Salut Ion Popescu", 6, 10);
		                //012345678910
		
		insertIntoString("tele", 4,"vizor"); //e ca un apend, pt ca adaug de la final in aces caz
		                                     //normal se foloseste sa introduci la mijloc
		
		appendToString("tele","vizor");
		
		addSpacesToText("acestaEsteUnStringCareFolosesteUnFormatCamelCase");
		
	}
	
	public static void reverseString(String text) { //String ul este obiect nemodificabil
		
		StringBuilder sb = new StringBuilder(text); //un stringbuilder este mereu un String
		sb.reverse(); // asa il facem reverse, prin metoda deja din clasa StringBuilder
		System.out.println(sb);
	} 
	
	public static void replaceFromString(String text, int startIndex, int endIndex, String textToReplace) {
		
		StringBuilder sb = new StringBuilder (text);
		sb.replace(startIndex, endIndex, textToReplace);//index start - este inclus in set, apoi index end-care este exclus, nu il ia in considerare
		System.out.println(sb);
	}
	
	public static void deleteFromString(String text, int startIndex, int endIndex) {
		
		StringBuilder sb = new StringBuilder (text);
		sb.delete(startIndex, endIndex);
		System.out.println(sb);	
	}
	
	public static void insertIntoString(String text, int startIndex, String textToInsert) {
		StringBuilder sb = new StringBuilder (text);
		sb.insert(startIndex, textToInsert);
		System.out.println(sb);	
	}
	
	public static void appendToString(String text, String textToAppend) {
		StringBuilder sb = new StringBuilder (text);
		sb.append( textToAppend);
		System.out.println(sb);	
	}
	
	//acestaEsteUnStringCareFolosesteUnFormatCamelCase
	
	public static void addSpacesToText(String text) {
		StringBuilder sb = new StringBuilder (text);
		
		for (int i=0; i<sb.length();i++) {
			if(Character.isUpperCase(sb.charAt(i))){
				sb.insert(i, " ");
				i++;
			}
			
		}
		
		System.out.println(sb);
	}
	
}
