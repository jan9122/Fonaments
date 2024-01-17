package Activitat3;

import Keyboard.*;

public class Activitat3 {

	public static void main(String[] args) {

		int num1, num2, numero, numinv, num, digito;
		double raizCuadradaInvertida;

		System.out.println("Entra valor inferior de l'interval");
		num1 = Keyboard.readInt();

		while (num1 < 0) { // REPETICIO
			System.out.println("Incorrecte. Ha de ser positiu. Entra altre número");
			num1 = Keyboard.readInt();
		}

		System.out.println("Entra valor superior de l'interval");
		num2 = Keyboard.readInt();

		while (num2 <= num1) { // REPETICIO
			System.out.println("Incorrecte. Ha de ser un numero major a " + num1 + ". Entra altre número");
			num2 = Keyboard.readInt();
		}

		numero = num1;

		System.out.println("Dins de l'interval [" + num1 + ",  " + num2 + "] hi ha");

		while (numero <= num2) { // REPETICIO
			if (numero % 5 == 0) {
				numinv = 0;
				num = numero;
				while (num > 0) { // REPETICIO
					digito = num % 10;
					numinv = numinv * 10 + digito;
					num = num / 10;
				}
				raizCuadradaInvertida = Math.sqrt(numinv);
				raizCuadradaInvertida = Math.floor(raizCuadradaInvertida * 100) / 100;
				System.out.println("El numero invertit del " + numero + " és el " + numinv
						+ " i la seva arrel quadrada és " + raizCuadradaInvertida);
			}
			numero++;
		}

	}

}
