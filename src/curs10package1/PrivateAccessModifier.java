package curs10package1;

public class PrivateAccessModifier {
	/*
	 * Scopul lui este limitat la clasa in care se afla
	 * 
	 * Aceeasi clasa: yes
	 * Alta clasa acelasi pachet : no
	 * clasa copil acelasi pachet : no, clasele copil nu mostenesc variabilele sau metodele private
	 * Alta clasa alt pachet : no
	 * Clasa copil alt pachet : no
	 * 
	 * 
	 */
	
	private PrivateAccessModifier() {}
	//poti face constructorul private, dar nu mai poti sa faci obiecte si nu te ajuta la nimic
    //nu ajuta sa faci privat
	
	
	//variabilele si metodele au sens sa fie private si pot fi folosite doar in clasa
	
	private String mesaj = "Private mesaj";
	
	
}
