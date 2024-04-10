package curs10package1;

class defaultAccesModifier {
	
	/*
	 * Default inseamna atunci cand nu specificam nimic (nu e nici public nici private)
	 * Scopul lui este limitat la pachetul in care se afla
	 * 
	 * 
	 * Acces:
	 * aceeasi clasa : yes , in interior este acces
	 * alta clasa in acelasi pachet: yes
	 * Subclasa sau clasa copil in acelasi pachet: yes
	 * Alta clasa in alt pachet : no
	 * subc-clasa sau clasa copil in alt pachet : no;
	 * 
	 */
	
	String mesaj = "Default acces modifier";
	
	void printMesaj() {
		
		System.out.println(mesaj);
	}

}
