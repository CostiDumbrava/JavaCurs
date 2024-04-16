package curs9homework;

/*
 * Avem o clasa Qualification care mosteneste clasa Teacher
 * In cadrul acestei clase avem un constuctor care seteaza caracteristicle din Teacher
 * Avem o metoda care se numeste verify si care verifica urmatoarele:
 * Daca xperienceYears sunt mai mari ca 3 si daca course este egal cu “Java” si daca schedule este egal cu “Afternoon”
 * Daca toate conditiile sunt indeplinite printeaza mesajul de qualification ”You qualify to teach at this school!”
 * Daca nu printeaza mesajul de necalificare “You do not qualify!”
 * 
 */

public class Qualification extends Teacher {
	
	public void verify() {
		
		if ((experienceYears > 3) && (course.equals("java") && schedule.equals("afternoon")))  {
			System.out.println("You qualify to teach at this school!");
		} else {
			System.out.println("You do not qualify!");
		}
		
		}
	

        public static void main(String[] args) {

		
	    Qualification obj = new Qualification(); 
		
		obj.setCourse("Java".toLowerCase());
		obj.setExperienceYears(5);
		obj.setSchedule("Afternoon".toLowerCase());
         
		
		obj.verify();
			

}
}
		
	
	
		
