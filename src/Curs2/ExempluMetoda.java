package curs2;

public class ExempluMetoda {

	public static void main(String[] args) {
		
		ExempluMetoda obj = new ExempluMetoda();
		
		int latime = 5;
		int lungime =3;
		
		//int arieRoom = latime * lungime;
		//System.out.println("Arie camera:" +arieRoom);
		System.out.println("Arie camera:" +obj.calculArie(latime, lungime));
		System.out.println("Perimetru camera 2:" +obj.perimetru);
		int latime2 = 4;
		int lungime2 =6;
		
		//int arieRoom2 = latime2 * lungime2;
		//System.out.println("Arie camera:" +arieRoom2);
		

	}

	
	public int calculArie(int latime, int lungime) {
		int arieRoom = latime * lungime;
		return arieRoom;
		
		
}
//bad practice sa declari in alta parte decat sus variabilele
	int perimetru;
	
	public void calculPerimetru(int latime, int lungime) {
		perimetru = 2 * (latime + lungime);
	}
}