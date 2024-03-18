package curs2;

public class TestRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Room baie = new Room (2,4);
		System.out.println("Arie baie:" +baie.calculArie());
		System.out.println("Perimtru baie:" +baie.calculPerimetru());
	
		Room dormitor = new Room (8.5,6.0);
		System.out.println("Arie dormitor" +dormitor.calculArie());
		System.out.println("Perimetru dormitor" +dormitor.calculPerimetru());
						
	}

}
