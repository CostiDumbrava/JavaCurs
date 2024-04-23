package curs13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileProcessor { // implementeaza un map, adica perechi Key,Value
	
	
	//lucru cu fisiere externe, de pe disc, din sistemul de operare
	//Java IO - input/output
	//lucrand cu fisiere externe, deschide canale de comunicare, cum era si Scanner
	//vom folosi metoda close ca sa le inchidem, altfel exista posibilitatea sa nu mearga programul daca nu le inchidem
	//vom folosi metoda try catch, deoarece e fisier extern si pot aparea multe probleme
	
	//are extensia properties si are o clasa care se numeste Properties
	
	
	
	
	//scriu in fisier si scot din program, din eclipse
	
	public void writePropertiesFile() {
		
		try(FileOutputStream output = new FileOutputStream("test.properties")) { // daca folosim asa nu mai trebuie inchis canalul, JAva o va face
			
			//canalul output trebuie inchis
			//output.close();
			
			
			Properties propFile = new Properties();
			
			propFile.setProperty("browser","firefox"); // browser = firefox
			
			//pereche K,V pt ca implementeaza un map, exista diferenta intre ce vreau sa scriu intr un map si intre un fisier properties
			
			propFile.setProperty("hostname", "server.com"); //toate obiectele sunt sub forma de String uri din fisierele Properties
			propFile.setProperty("port", "1234"); 
			propFile.setProperty("url", "example.com"); //get se foloseste ca sa citesti
			
			//asa il exportam din Java
			propFile.store(output, "am salvat fisierul"); // mesajul e scris in fisier impreuna cu un timestamp
			
			
		}catch (IOException e) {
			
			System.out.println("Nu am putut scrie fisierul!");
			e.printStackTrace();
		}
		
		
	}

	// citesc din fisier 
	
	public void readPropertiesFile(String Key) { 
		
		
		//try inchide canalul de comunicare
		try(FileInputStream input = new FileInputStream("test.properties")) { //fisierul trebuie sa existe
			
			Properties propFile = new Properties();// am creat fisierul pt a citi din el
			propFile.load(input);
			
			System.out.println(propFile.getProperty(Key));
			
			
		} catch(IOException e) {
			
			System.out.println("Nu am putut citi fisierul!");
			e.printStackTrace();
		}
		
	}
	
	
	
	//facem update la fisier, deci prima data il citesc ca sa am ultimul fisier, apoi scriu ca sa l updatez
	
	public void updatePropertiesFile(String key, String value) {
		
		Properties propFile = new Properties();
		
		
		try(FileInputStream input = new FileInputStream ("test.properties")) {
			
			propFile.load(input);
			
		}catch (IOException e) {
			System.out.println("Nu am putut citi fisierul!");//il incarc
			e.printStackTrace();
			
		}
		
		try(FileOutputStream output = new FileOutputStream("test.properties")){
			
			propFile.setProperty(key, value); //modific
			propFile.store(output, null); //scot
			
		}catch (IOException e) {
			System.out.println("Nu am putut scrie in fisier!");
			e.printStackTrace();
			
		}
	}
	
	
	public void deleteFromPropertiesFile(String key) {
		
       Properties propFile = new Properties();
		
		
		try(FileInputStream input = new FileInputStream ("test.properties")) {
			
			propFile.load(input);
			
		}catch (IOException e) {
			System.out.println("Nu am putut citi fisierul!");//il incarc
			e.printStackTrace();
			
		} 
		
      try(FileOutputStream output = new FileOutputStream("test.properties")){
			
			propFile.remove(key); // sterg
			propFile.store(output, null); //scot
			
		}catch (IOException e) {
			System.out.println("Nu am putut scrie in fisier!");
			e.printStackTrace();
			
		}
	}
}
