package curs13homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * Scriem un program care printeaza in consola cate calorii are o leguma pe care utilizatorul vrea sa o cumpere.
 * Avem o metoda care scrie intr-un properties file 5 legume si un numar de calorii asociat lor (exemplu morcov=58)
 * Avem o metoda care citeste si din properties file valoarea caloriilor.
 * Daca utilizatorul introduce o leguma care nu se afla in acest data structure returneaza “Nu vindem aceasta leguma”
 * In metoda main intrebam utilizatorul ce leguma vrea sa cumpere. Daca leguma se afla in cele pe care le avem in data structure
 * printam : “Leguma aleasa de tine are X calorii”. Daca nu se afla printam “Nu vindem aceasta leguma” si rugam utilizatorul sa 
 * aleaga alta leguma.
 * 
 */

public class PropertiesFileCalories {
	
	public void writePropertiesFile() {
		
		try(FileOutputStream iesire = new FileOutputStream("calories.properties")) {
			
			Properties vegFile = new Properties();
			
			vegFile.setProperty("varza","10");
			vegFile.setProperty("cartofi","60");
			vegFile.setProperty("ceapa","45");
			vegFile.setProperty("rosii","25");
			vegFile.setProperty("sparanghel","13");
			
			vegFile.store(iesire, null);
			
			
		}catch (IOException e) {
			System.out.println("Nu am putut scrie in fisier!");
			e.printStackTrace();
			
		}
	}
	
	public String readPropertiesFile(String key) {
		
		Properties vegFile = new Properties();
		
		try(FileInputStream intrare = new FileInputStream("calories.properties")){
			
			vegFile.load(intrare);
			
			
		}catch (IOException e) {
			System.out.println("Nu pot citi fisierul!");
			e.printStackTrace();
			
		}
		return vegFile.getProperty(key);
	}
	
	

}
