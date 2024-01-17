package Practica9;

import Keyboard.*;

public class Practica9 {

	public static void main(String[] args) {

		char characterActual = ' ', characterAnterior = ' ';
		boolean finalitzat = false;

		characterActual = Keyboard.readChar();

		while (!finalitzat && characterActual != '.') {
			if ((characterActual >= 'A' && characterActual <= 'Z') || (characterActual >= 'a' && characterActual <= 'z')) {
				if (characterAnterior != ' ' && characterActual <= characterAnterior) {
					System.out.println("La seqüència no és estrictament creixent.");
				}
				characterAnterior = characterActual;
			} else {
				characterActual = Keyboard.readChar();
			}
			characterActual = Keyboard.readChar();

			if (characterActual == '.') {
				finalitzat = true;
			}
		}
		if (finalitzat && characterActual == '.') {
			System.out.println("La seqüència és estrictament creixent.");
		}
	}
}
