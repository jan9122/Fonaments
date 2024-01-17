package Exercici3;

import Keyboard.*;

public class Exercici3 {

	public static void main(String[] args) {

		String name;
		int dia;
		int mes;
		int any;
		int resultat;

		System.out.println("Com et dius?");
		name = Keyboard.readString();
		System.out.println("Entra la teva data de néixement");
		System.out.println("===============================");

		System.out.println("Quin dia vas néixer, " + name + "?");
		dia = Keyboard.readInt();
		System.out.println("Quin mes vas néixer, " + name + "?");
		mes = Keyboard.readInt();
		System.out.println("Quin any vas néixer, " + name + "?");
		any = Keyboard.readInt();

		resultat = (any / 100) - mes + (dia / 10);

		System.out.println(name + ", el teu número de la sort és: " + resultat);
		System.out.println("Adeu!");

	}

}
