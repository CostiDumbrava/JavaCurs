package curs11;

public interface Angajat {
	
	public int salariu = 100;
	
	public void setName(String name);
	public String getName();
	
	public void setEmail(String email);
	
	public String getEmail();
	
	//toate nu metodele nu au body in interfata
	
    //public void testCeva();
	
	default void printCeva() {
		
	} // cu default pot adauga o metoda noua dar fara sa fiu nevoit sa o folosesc in clasele copil
	// functionalitatea aceasta a fost adaugata ulterior, si de aceea daca adaugi ceva ce nu vrei sa mostenesti in toate clasele
}
