package curs13;

public class TestPropertiesFile {

	public static void main(String[] args) {
	
		PropertiesFileProcessor obj = new PropertiesFileProcessor();
		
		//obj.writePropertiesFile(); // am creat fisierul, il scoate din Java, pentru a l vedea dam refresh (F5) pe CursJava
		
		//daca vreau sa completez fisierul se face de regula manual, il deschid si scriu in continuare in el
		
		
		obj.readPropertiesFile("port");
		obj.readPropertiesFile("user");
		obj.readPropertiesFile("browser");
		
		System.out.println("======================");
		
		obj.updatePropertiesFile("browser", "Edge");
		obj.updatePropertiesFile("user","utilizator");
		
		
		obj.readPropertiesFile("user");
		obj.readPropertiesFile("browser");//ca sa le vad in consola, pot sa vad acelasi lucru daca deschi fisierul
		
		
		System.out.println("======================");
		
		obj.deleteFromPropertiesFile("browser");
		obj.readPropertiesFile("browser");
		
	}

}
