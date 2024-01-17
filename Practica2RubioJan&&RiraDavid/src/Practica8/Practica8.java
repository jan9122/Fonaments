package Practica8;

import Keyboard.*;

public class Practica8 {

	public static void main(String[] args) {

		char vocal;
		int A=0,E=0,I=0,O=0,U=0;

		System.out.print("Entra caràcter: ");
		vocal = Keyboard.readChar();

		while (vocal != '.') {
			if (vocal == 'A') {
				A++;
			} else if (vocal == 'E') {
				E++;
			} else if (vocal == 'I') {
				I++;
			}
			else if (vocal == 'O') {
				O++;
			}
			else if (vocal == 'U') {
				U++;
			}
			System.out.print("Entra caràcter: ");
			vocal = Keyboard.readChar();
		}

		if (vocal == '.') {
			System.out.println("Comptador de vocals majúsculas");
			System.out.println("==============================");
			System.out.println("Nombre de A: " + A);
			System.out.println("Nombre de E: " + E);
			System.out.println("Nombre de I: " + I);
			System.out.println("Nombre de O: " + O);
			System.out.println("Nombre de U: " + U);
		}
	}

}
