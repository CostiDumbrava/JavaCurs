package curs14;

public class TransformToString {

	public static void main(String[] args) {
		
		
		char ch = 'x';
		String chStr = Character.toString(ch);
		String chStr2 = String.valueOf(ch);
		
		System.out.println(chStr.getClass());
		System.out.println(chStr2.getClass());
		
		System.out.println("--------------------------");
		
		
		boolean bol = true;
		
		String bolStr = Boolean.toString(bol);// folosesc metoda toString doar daca vreau sa iasa pe exceptie
		String bolStr2 = String.valueOf(bol);
		
		System.out.println(bolStr.getClass());
		System.out.println(bolStr2.getClass());
		
		System.out.println("--------------------------");
		
		String str = null;
		//System.out.println(str.toString());// nu poate sa transforme null
		System.out.println(String.valueOf(str)); // valueOf printeaza valoarea chair daca este null
				                                // daca nu vreau sa iasa pe exceptie atunci folosesc valueOf
		
	}
	

}
