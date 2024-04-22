package curs13;

public class TestJsonFile {

	public static void main(String[] args) {
		
		
		JsonFileProcessor obj = new JsonFileProcessor();
		
	     obj.writeJsonFile();
	     
	     obj.readJsonFile("name");

	}

}
