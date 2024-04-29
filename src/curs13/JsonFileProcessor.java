package curs13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonFileProcessor { //java script object notation = json, este fff folosit
	//un obiect json este o pereche K,V
	/*
	 * [
	 * 
	 * {"name" : "oana", 
	 * "browser" : "firefox"
	 * 
	 *}, 
	 *
	 *{"name" : "oana", 
	 * "browser" : "firefox"
	 * 
	 *}
	 * 
	 * ]
	 * 
	 * 
	 */
	
	@SuppressWarnings("unchecked") // e o librarie mai veche si am adaugat suppress ul ca sa dispara warning ul
	public void writeJsonFile() { 

		JSONObject jsonObj = new JSONObject();
		
		jsonObj.put("name", "Oana");
		
		jsonObj.put("email", "oana@oana.com");
		
		try(FileWriter output = new FileWriter("test.json")){
			
			output.write(jsonObj.toJSONString());
			
		}catch(IOException e) {
			
			System.out.println("Nu am putut scrie fisierul");
			e.printStackTrace();
		}
	}
	
	public void readJsonFile(String key) { 
		
try(FileReader input = new FileReader("test.json")){ //am deschis canalul de comunicare
			
			JSONParser parser = new JSONParser(); // ne ajuta sa parcurgem structura
			
			@SuppressWarnings("unused")
			JSONObject jsonObj = (JSONObject)parser.parse(input);
			                      //facem cast pe JSONObject
			String value = (String)jsonObj.get(key);
			                //facem cast String, pt ca nu stie ce e 
			
			System.out.println(value);
			
		}catch(Exception e) {
			
			System.out.println("Nu am putut citi fisierul");
			e.printStackTrace();
		}
		
	}
	
	
	public void updateJsonFile(String key, String value) {
		
		try(FileReader input = new FileReader("test.json")){
			
			JSONParser parser = new JSONParser();//am incarcat fisierul
			JSONObject jsonObj = (JSONObject) parser.parse(input); //am incarcat obiectul in program
		    
			jsonObj.put(key,value); //am facut update ul
			
			try {
				FileWriter output = new FileWriter("test.json");
				output.write(jsonObj.toJSONString());
				output.close();//inchid canalul
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}catch(Exception e) {
			
			System.out.println("Nu am putut citi fisierul");
			e.printStackTrace();
		
		}	
		
	}
	
	
public void deleteFromJsonFile(String key) {
		
		try(FileReader input = new FileReader("test.json")){
			
			JSONParser parser = new JSONParser();//am incarcat fisierul
			JSONObject jsonObj = (JSONObject) parser.parse(input); //am incarcat obiectul in program
		    
			jsonObj.remove(key); //am sters
			
			try {
				FileWriter output = new FileWriter("test.json");
				output.write(jsonObj.toJSONString()); //scriu pe canalul de output
				output.close();//inchid canalul
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}catch(Exception e) {
			
			System.out.println("Nu am putut citi fisierul");
			e.printStackTrace();
		
		}	
		
	}
	
	

}
