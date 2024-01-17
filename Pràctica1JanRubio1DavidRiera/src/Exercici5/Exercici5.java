package Exercici5;

import Keyboard.*;

public class Exercici5 {

	public static void main(String[] args) {

		int edad1, edad2, edad3, edad4;
		float mitja;

		System.out.println("Especifica l'edat de les 4 persones");
		System.out.println("-----------------------------------");
		System.out.println("");
		System.out.print("Persona 1 - Quants anys té? ");
		edad1 = Keyboard.readInt();
		System.out.print("Persona 2 - Quants anys té? ");
		edad2 = Keyboard.readInt();
		System.out.print("Persona 3 - Quants anys té? ");
		edad3 = Keyboard.readInt();
		System.out.print("Persona 4 - Quants anys té? ");
		edad4 = Keyboard.readInt();

		System.out.println("");

		mitja = (float) (edad1 + edad2 + edad3 + edad4) / 4;
		System.out.println("Edat mitjana és: " + mitja);

	}

}
