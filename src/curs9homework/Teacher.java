package curs9homework;


/*Scriem un program care verifica daca un profesor se califica sa predea la o scoala
 * Daca se califica, atunci printeaza ”You qualify to teach at this school!”
 * Daca nu se califica, atunci printeaza “You do not qualify!”
 * Avem o clasa Teacher care are urmatoarele caracteristici :
 * Course
 * ExperienceYears
 * Schedule
 * 
 * 
 */

public class Teacher {
	
	String course;
	int experienceYears;
	String schedule;
	
	
	
	public String getCourse() {
		return course.toLowerCase();
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getExperienceYears() {
		return experienceYears;
	}
	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}
	public String getSchedule() {
		return schedule.toLowerCase();
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	
}
