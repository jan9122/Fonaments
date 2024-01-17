package Activitat7;

import Keyboard.Keyboard;

public class Activitat7 {

	public static void main(String[] args) {
		int x = 0, y = 0, alçada;

		System.out.println("*****CREADOR DE CREUS*****");
		System.out.print("Entra l'alçada de la creu: ");
		alçada = Keyboard.readInt();

		while (alçada < 3 || alçada % 2 == 0) { // CERCA
			System.out.println("El valor ha de ser un nombre enter, senar i superior a 1: ");
			alçada = Keyboard.readInt();
		}

		while (x < alçada) { // REPETICIÓ
			y = 0;

			while (y < alçada) { // REPETICIÓ
				if (y == x || y == alçada - 1 - x) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				y++;
			}

			System.out.println();
			x++;
		}
	}
}
