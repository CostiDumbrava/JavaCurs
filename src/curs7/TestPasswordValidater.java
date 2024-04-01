package curs7;

public class TestPasswordValidater {

	public static void main(String[] args) {
		
		PasswordValidator obj = new PasswordValidator();
		obj.printPasswordRules();
		obj.readUserName();
		obj.validatePassword();
		

	}

}
