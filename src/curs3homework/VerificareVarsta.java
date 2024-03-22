package curs3homework;

import java.util.Scanner;

public class VerificareVarsta {
	
	int varsta;
	
	public void askAge(){
				Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti varsta dumneavoastra: ");
		varsta = scan.nextInt();
	}
	
	public void verificaVarsta() {
		if (varsta < 18) {
			System.out.println("Esti minor");
		} else if (varsta>65) {
			System.out.println("Esti batran");
		} else {
			System.out.println("Esti adult");
		}
	}

}
