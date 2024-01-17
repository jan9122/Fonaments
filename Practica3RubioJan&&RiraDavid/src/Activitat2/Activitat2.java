package Activitat2;

import Keyboard.*;

public class Activitat2 {

	public static void main(String[] args) {

		int num, numorig, invnum = 0, digito;

		System.out.println("**********INVERTIR NUMERO**********");
		System.out.println("Entra el numero a invertir");
		num = Keyboard.readInt();

		while (num <= 0) { //CERCA
			System.out.println("Incorrecte. Ha de ser positiu. Entra altre número");
			num = Keyboard.readInt();
		}

		numorig = num;

		while (num > 0) { //REPETICIO
			digito = num % 10;
			invnum = invnum * 10 + digito;
			num = num / 10;
		}

		System.out.println("El número invertido del " + numorig + " és el " + invnum);

	}
}
