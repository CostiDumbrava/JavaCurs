package curs9;


//clasa Tester devine clasa copil (sau devine subclasa)
//clasa Angajat devine clasa parinte (sau devine superclasa)
public class Tester extends Angajat {
	
	private String testWritingSkills;
	private String bugWritingSkills;
	
	
	
	public String getTestWritingSkills() {
		return testWritingSkills;
	}
	public void setTestWritingSkills(String testWritingSkills) {
		this.testWritingSkills = testWritingSkills;
	}
	public String getBugWritingSkills() {
		return bugWritingSkills;
	}
	public void setBugWritingSkills(String bugWritingSkills) {
		this.bugWritingSkills = bugWritingSkills;
	}
	
	
	

}
