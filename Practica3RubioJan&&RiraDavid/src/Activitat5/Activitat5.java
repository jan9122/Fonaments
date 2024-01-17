package Activitat5;

import Keyboard.*;
import java.util.Random;

public class Activitat5 {

	public static void main(String[] args) {

		double x, y, xf = 1.0, yf = 1.0, resultat, intents = 1.0, acerts = 1.0;
		int trys, on = 0, i = 1;

		Random rnd = new Random();

		System.out.println("Iniciem la sessió de tirades");
		System.out.println("############################");
		System.out.println("Entra el número de tirades a efectuar:");
		trys = Keyboard.readInt();

		while (trys > i) { // REPETICIO
			x = rnd.nextDouble(0, 1);
			y = rnd.nextDouble(0, 1);
			x = Math.round(x * 100.0) / 100.0;
			y = Math.round(y * 100.0) / 100.0;
			resultat = Math.round(Math.sqrt(Math.pow(xf - x, 2) + Math.pow(yf - y, 2)) * 100.0) / 100.0;
			System.out.println("La tirada " + i + " efectuada ha estat a la posició: (x=" + x + ",y=" + y + ")");
			if (resultat < 1) {
				System.out.println("Encert, cau a la zona ombrejada, la dsitància al punt (1,1) és: " + resultat);
				on++;
				acerts = on;
			} else {
				System.out
						.println("Fallada, cau fóra de la zona ombrejada, la dsitància al punt (1,1) és: " + resultat);
			}
			System.out.println("La proporcio d'encerts fins el moment és: " + on + " encerts de " + i
					+ " tirades. La proporció és: " + Math.round(acerts / intents * 100.0) / 100.0);
			i++;
			intents = i;
		}

	}

}
