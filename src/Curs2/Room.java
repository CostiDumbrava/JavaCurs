package Curs2;

public class Room {
	
	//double= numar cu virgula
	
	//variabile
	private double lungime;
	private double latime;
	
	
	//constructor cu parametri
	
	public Room(double lungime, double latime) {
		
		this.latime = latime;
		this.lungime = lungime;
		
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
}

