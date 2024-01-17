package Activitat4;

import Keyboard.*;
import java.util.Random;

public class Activitat4 {

	public static void main(String[] args) {

		int numale, na1 = 0, na2 = 0, na3 = 0, na4 = 0;
		int numuser, nu1 = 0, nu2 = 0, nu3 = 0, nu4 = 0;
		int var;
		boolean found = false;

		// Random Number 1000-9999
		Random rnd = new Random();
		var = rnd.nextInt(1000, 10000);
		numale = var;

		System.out.println("Ja tenim el teu número amagat!");

		while (var > 999) {
			na1 = var % 10;
			var = var / 10;
		}

		while (var > 99) {
			na2 = var % 10;
			var = var / 10;
		}

		while (var > 9) {
			na3 = var % 10;
			var = var / 10;
		}

		while (var > 0) {
			na4 = var % 10;
			var = var / 10;
		}

		// Check
		System.out.println("Dona un número de 4 dígits:");
		numuser = Keyboard.readInt();
		while (found == false) { //CERCA
			if (numuser == numale || numuser == 0) {
				found = true;
			} else {
				System.out.print("El número descobert fins ara és: ");
				while (numuser > 999) {
					nu1 = numuser % 10;
					numuser = numuser / 10;
				}

				while (numuser > 99) {
					nu2 = numuser % 10;
					numuser = numuser / 10;
				}

				while (numuser > 9) {
					nu3 = numuser % 10;
					numuser = numuser / 10;
				}

				while (numuser > 0) {
					nu4 = numuser % 10;
					numuser = numuser / 10;
				}

				if (nu4 == na4) {
					System.out.print(nu4);
				} else {
					System.out.print("?");
				}
				if (nu3 == na3) {
					System.out.print(nu3);
				} else {
					System.out.print("?");
				}

				if (nu2 == na2) {
					System.out.print(nu2);
				} else {
					System.out.print("?");
				}

				if (nu1 == na1) {
					System.out.print(nu1);
				} else {
					System.out.print("?");
				}
				System.out.println(" ");
				System.out.println("Dona un altre número de 4 xifres o zero per acabar");
				numuser = Keyboard.readInt();
			}
		}
		if (numale == numuser) {
			System.out.println(" ");
			System.out.println("Has esbrinat el número. Adeu!");
		} else {
			System.out.println("Has sortit.");
		}
	}
}
