package Activitat8;

import Keyboard.*;

public class Activitat8 {
	public static void main(String[] args) {
		int x = 0, y = 0, digit, num, count = 0;

		System.out.println("*****ROMBES*****");
		System.out.println("De quina alçada vol el rombe? (senar)");
		digit = Keyboard.readInt();

		while (digit < 3 || digit % 2 == 0) { // CERCA
			System.out.println("El valor ha de ser un nombre enter, senar i superior a 1: ");
			digit = Keyboard.readInt();
		}

		System.out.println("Indiqui un nombre de [0-9]: ");
		num = Keyboard.readInt();

		while (num < 0 || num > 9) { // CERCA
			System.out.print("El nombre ha de ser de [0-9]: ");
			num = Keyboard.readInt();
		}

		System.out.println();
		
		while (x < digit) { // REPETICIÓ
			y = 0;
			while (y < digit) { // REPETICIÓ
				if (2 * x + 2 * y == digit - 1 || 2 * x - 2 * y == digit - 1 || 2 * y - 2 * x == digit - 1
						|| x + y == (digit - 1) + (digit - 1) / 2)
					System.out.print(num % 10);
				else
					System.out.print(" ");
				y++;
			}

			System.out.println();
			x++;

			if (count == 0 || count == 1) {
				num++;
				count++;
			} else {
				num -= 2;
				count = 0;
			}
		}
	}
}
