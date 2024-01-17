package Activitat6;

import java.util.Random;
import Keyboard.*;

public class Activitat6 {

	public static void main(String[] args) {
		int jugador = 0, da1, da2, count = 0, winrate = 0;
		double plata, i = 0, ratio = 1;

		Random rng = new Random();

		System.out.println("*****JOC DE DAUS*****");
		System.out.println("Quants voleu jugar: ");
		jugador = Keyboard.readInt();

		while (jugador < 2) { // REPETICIO
			System.out.println("Valor no correcte. Quants voleu jugar >=2: ");
			jugador = Keyboard.readInt();
		}

		while (count < jugador) { // REPETICIO

			System.out.println("Indica la quantitat de diners que vol jugar el jugador " + (count + 1));
			plata = Keyboard.readInt();

			while (plata <= 1) { // REPETICIO

				System.out.println("Valor de diners no correcte. Indica altre import... ");
				plata = Keyboard.readInt();

			}

			System.out.println("Tirem els daus i ......");
			da1 = rng.nextInt(1, 7);
			System.out.println("Ha surtit el dau: " + da1);
			da2 = rng.nextInt(1, 7);
			System.out.println("Ha surtit el dau: " + da2);
			System.out.println();
			da1 = da1 + da2;

			switch (da1) {
			case 2:
				System.out.println("Es dupliquen els diners! Ha passat de " + plata + "€ a: " + (plata * 2) + "€");
				i = plata * 2;
				break;
			case 3:
				if (plata % 4 == 0) {
					System.out.println("Guanya 12€! Ha passat de " + plata + "€ a: " + (plata + 12) + "€");
					i = plata + 12;
				} else {
					System.out.println("Guanya 4€! Ha passat de " + plata + "€ a: " + (plata + 4) + "€");
					i = plata + 4;
				}
				break;
			case 4:
				System.out.println("Ha perdut un 10%! Ha passat de " + plata + "€ a: " + Math.round(plata * .9) + "€");
				i = plata * .9;
				break;
			case 5:
				System.out.println("Ha perdut un 25%! Ha passat de " + plata + "€ a: " + (plata * .75) + "€");
				i = plata * .75;
				break;
			case 6:
				if (da2 == 3) {
					System.out.println("Es dupliquen els diners! Ha passat de " + plata + "€ a: " + (plata * 2) + "€");
					i = plata * 2;
				} else {
					System.out.println("Es tripliquen els diners! Ha passat de " + plata + "€ a: " + (plata * 3) + "€");
					i = plata * 3;
				}
				break;
			case 7:
				System.out.println("Ha perdut un 10%! Ha passat de " + plata + "€ a: " + (plata * .9) + "€");
				i = plata * .9;
				break;
			case 8:
				System.out.println("Ha guaanyat un 10%! Ha passat de " + plata + "€ a: " + (plata * 1.1) + "€");
				i = plata * 1.1;
				break;
			case 9:
				System.out.println("Els diners s'eleven a la cinquena potència! Ha passat de " + plata + "€ a: "
						+ (Math.round(Math.pow(plata, 5) * 100) / 100) + "€");
				i = Math.pow(plata, 5);
				break;
			case 10:
				System.out.println("Es fà l'arrel quadrada dels diners! Ha passat de " + plata + "€ a: "
						+ (Math.round(Math.sqrt(plata) * 100) / 100) + "€");
				i = Math.pow(plata, .5);
				break;
			case 11:
				System.out.println("Els diners s'eleven a la cinquena potència! Ha passat de " + plata + "€ a: "
						+ (Math.round(Math.pow(plata, 5) * 100) / 100) + "€");
				i = Math.pow(plata, 5);
				break;
			case 12:
				System.out.println("Ni ha perdut ni ha guanyat, es queda amb " + plata + "€");
				i = plata;
				break;
			}

			count++;
			if (i / plata > ratio) {
				ratio = i / plata;
				winrate = count;
			}
		}

		System.out.println();
		if (ratio == 1) {
			System.out.println("Ningú a guanyat");
		} else {
			System.out.println("El jugador " + winrate + " ha guanyat més diners en proporcio que els demes jugadors");
		}
	}

}
