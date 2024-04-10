package curs10package1;

public class ProtectedAccessModifier {
	
	//clasa nu poate fi declarata protected niciodata, doar public si parametrii sunt protected
	
	/*Scopul lui protected este in acelasi pachet si sub clase din alte pachete
	 * clasele nu pot fi declarate ca protected
	 * 
	 * aceeasi clasa: yes
	 * lata clasa acelasi pachet : yes
	 * subclasa sau clasa copil acelasi pachet : da
	 * alat clasa din alt pachet : no
	 * subclasa sau clasa copil din alt pachet : yes (asta e diferenta dintre protected si default)
	 * 
	 */
	
	protected String mesaj = "Protected acces modifier";{

		
	System.out.println(mesaj);


	}

}
