package Practica1;

import Keyboard.*;

public class Practica1 {

	private static void modifica_pos_parells(int[] vector) {
		int i;

		for (i = 0; i < vector.length - 1; i++) {
			if (i % 2 == 0) {
				vector[i] = vector[i] + vector[i + 1];
			}
		}
	}

	private static void modifica_pos(int[] vector) {
		int i;

		vector[0] = 0;
		vector[vector.length - 1] = 0;

		for (i = 0; i < vector.length - 1; i++) {
			vector[i] *= 2;
		}

	}

	private static int mida_vector() {
		int x;
		do {
			System.out.print("Introdueix un numero entre [23,56]:");
			x = Keyboard.readInt();
			System.out.println();

			if (x < 23) {
				System.out.println("El numero es inferior a 23");
			} else if (x > 56) {
				System.out.println("El numero es superior a 56");
			}
		} while (x < 23 || x > 56);

		return x;

	}

	private static int[] crea_vector(int mida) {

		int[] vector = new int[mida];
		int i;
		int n;

		for (i = 0; i != mida; i++) {

			do {
				System.out.print("Entra un numero inferior a 250:");
				n = Keyboard.readInt();
				System.out.println();

				if (n >= 250) {
					System.out.println("El numero es superior/igual a 250, ha de ser inferior");
				}
			} while (n >= 250);

			vector[i] = n;

		}

		return vector;

	}

	private static void imp(int[] vector) {
		System.out.print("{");
		int i;
		for (i = 0; i < vector.length - 1; i++) {
			System.out.print(vector[i] + ", ");
		}
		System.out.print(vector[i] + "}");
		System.out.println();
	}

	public static void main(String[] args) {

		System.out.println("Manipulació de vectors");
		System.out.println("======================");
		int[] vector = crea_vector(mida_vector());
		System.out.println("El vector acaba de ser creat satisfactoriament!!");
		imp(vector);

		System.out.print("El vector amb posicions parells modificades es: ");
		modifica_pos_parells(vector);
		imp(vector);

		System.out.print("El vector amb tots els valors modificats és: ");
		modifica_pos(vector);
		imp(vector);

	}

}
