package Exercici1;

import Keyboard.*;

public class Class1 {
	
	public static void main(String[] args) {
		String pal="";
		char let;
		
		System.out.println("*************************GIRAR TEXT***************************");
		System.out.println("Entra un text càracter a càracter. Prem el punt per finalitzar");
		let = Keyboard.readChar();
		
		while (let != '.') {
			pal = let + pal;
			let = Keyboard.readChar();
		}
		
		System.out.println("El text girat és:");
		System.out.println(pal);
		
	}

}
