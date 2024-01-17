package Activitat10;

import java.util.Random;

public class Activitat10 {

	public static void drum(int tall, boolean dob) {
		int x, y, count = 0;
		
		System.out.println("Dibuix del tamboret de mida " + tall);
		System.out.println();

		while (count < tall) { // REPETICIÓ
			System.out.print('*');
			count++;
		}
		System.out.println();

		if (dob) {
			count = 0;

			while (count < tall) { // REPETICIÓ
				System.out.print('*');
				count++;
			}
			System.out.println();
		}

		y = 0;

		while (y < tall - 2) { // REPETICIÓ
			x = 0;

			while (x < tall) { // REPETICIÓ

				if (x == 0 || x == tall - 1) {
					System.out.print('|');
				} else {
					System.out.print(' ');
				}
				x++;
			}
			System.out.println();
			y++;
		}
	}

	public static void main(String[] args) {

		int tall, z = 0;
		boolean dob;

		Random rng = new Random();

		System.out.println("*****TAMBORETS*****");

		while (z < 2) { // REPETICIÓ
			tall = rng.nextInt(3, 91);
			dob = rng.nextBoolean();
			drum(tall, dob);
			z++;
			System.out.println();
		}
	}
}
