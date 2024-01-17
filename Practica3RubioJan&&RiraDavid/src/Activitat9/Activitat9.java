package Activitat9;

import java.util.Random;
import Keyboard.*;

public class Activitat9 {

	public static void chair(int tall, char sim, boolean rl) {
		int x, y;
		y = 0;
		if (rl) {
			while (y < tall) { // REPETICIÓ
				x = 0;

				while (x < tall) { // REPETICIÓ

					if (x == 0 || y == tall / 2 || x == tall - 1 && y > tall / 2) {
						System.out.print(sim);
					} else {
						System.out.print(' ');
					}
					x++;
				}
				System.out.println();
				y++;
			}
		} else {
			while (y < tall) { // REPETICIÓ
				x = 0;

				while (x < tall) { // REPETICIÓ

					if (x == tall - 1 || y == tall / 2 || x == 0 && y > tall / 2) {
						System.out.print(sim);
					} else {
						System.out.print(' ');
					}
					x++;
				}
				System.out.println();
				y++;
			}
		}
	}

	public static void main(String[] args) {

		int tall, xsim, xrl, count = 0;
		char sim;
		boolean rl;

		Random rng = new Random();

		System.out.println("*****CADIRES*****");

		while (count < 5) { // REPETICIÓ
			System.out.print("Entri un nombre enter, senar i més gran que 2: ");
			tall = Keyboard.readInt();

			while (tall < 2 || tall % 2 == 0) { // CERCA
				System.out.print("Entri un nombre enter, senar i més gran que 2: ");
				tall = Keyboard.readInt();
			}

			xsim = rng.nextInt(3);
			if (xsim == 0) {
				sim = '*';
			} else if (xsim == 1) {
				sim = '%';
			} else {
				sim = '&';
			}

			xrl = rng.nextInt(2);
			if (xrl == 0) {
				rl = false;
			} else {
				rl = true;
			}

			chair(tall, sim, rl);

			count++;
		}
		System.out.println();
		System.out.println("FI!!");
	}
}