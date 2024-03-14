package Curs2;

public class RoomHomework {
	
	//double= numar cu virgula
	
	//variabile
	private double lungime;
	private double latime;
	static String culoare = "ALB";
	
	//constructor cu parametri
	
	public RoomHomework(double lungime, double latime, String culoare) {
		
		this.latime = latime;
		this.lungime = lungime;
		this.culoare = culoare;
		
	}
		
	//metode
	
	public double calculArie() {
		//double arieRoom = latime * lungime;
		//return arieRoom;
		return latime * lungime;
		
}
	
	public double calculPerimetru() {
		return 2 * (latime + lungime);
	
	
	}
	
	public String afiseazaCuloareDreptunghi() {
		return culoare;
	}
}

