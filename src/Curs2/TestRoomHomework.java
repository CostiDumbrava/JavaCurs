package Curs2;

public class TestRoomHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Room baie = new Room (2,4);
		System.out.println("Arie baie:" +baie.calculArie());
		System.out.println("Perimtru baie:" +baie.calculPerimetru());
	
		//Room dormitor = new Room (8.5,6.0);
		//System.out.println("Arie dormitor:" +dormitor.calculArie());
		//System.out.println("Perimetru dormitor:" +dormitor.calculPerimetru());
		
		RoomHomework sufragerie = new RoomHomework (6,4,RoomHomework.culoare);
		System.out.println("Arie sufragerie:" +sufragerie.calculArie());
		System.out.println("Perimetru sufragerie:" +sufragerie.calculPerimetru());
		System.out.println("Afiseaza culoare sufragerie:" +sufragerie.afiseazaCuloareDreptunghi());		
		
		RoomHomework dormitor = new RoomHomework (8.5,6.0,RoomHomework.culoare);
		System.out.println("Arie dormitor: " +dormitor.calculArie());
		System.out.println("Perimetru dormitor:" +dormitor.calculPerimetru());
		System.out.println("Afiseaza culoare dormitor:" +dormitor.afiseazaCuloareDreptunghi());
	}

}
