package Activitat1;

import Keyboard.*;

public class Activitat1 {

	public static void main(String[] args) {

		char intro = ' ';
		String textinicial = "";

		System.out.println("**********GIRAR TEXT**********");
		System.out.println("Entra un text caràcter a cràcter. Prem el punt per finalitzar");
		intro = Keyboard.readChar();

		while (intro != '.') { //CERCA

			textinicial = intro + textinicial;
			intro = Keyboard.readChar();

		}

		System.out.println("El Text Girat és:");
		System.out.println(textinicial);

	}

}
