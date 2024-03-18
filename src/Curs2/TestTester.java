package curs2;

public class TestTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tester tester1 = new Tester();
		tester1.numeTester = "Oana";
		tester1.varstaTester = 25;
		
		tester1.afiseazaDetaliiTester();
		
		
		Tester tester2 = new Tester();
		tester2.numeTester = "Ioana";
		tester2.varstaTester = 35;
		
		tester2.afiseazaDetaliiTester();
		
		
		Tester tester3 = new Tester("Monica",34);
		tester3.afiseazaDetaliiTester();
	}

}
