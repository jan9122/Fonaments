package Activitat11;

import java.util.Random;
import Keyboard.*;

public class Activitat11 {

	private static double dist(double x, double y) {

		return Math.round((Math.sqrt(Math.pow(1 - x, 2) + Math.pow(1 - y, 2))) * 100.0) / 100.0;

	}

	public static void main(String[] args) {
		int trys, count = 0;
		double x, y, dist, oka = 2.1;
		Random rng = new Random();
		boolean stop = false;

		System.out.println("*****DIANA VERSION 2*****");
		System.out.println("Iniciem la sessió de tirades");
		System.out.println("############################");
		System.out.print("Entra el numero de tirades a efectuar: ");
		trys = Keyboard.readInt();

		while (count < trys && !stop) { // CERCA
			count++;
			
			x = rng.nextDouble(1);
			y = rng.nextDouble(1);
			dist = dist(x, y);

			System.out.println("La tirada " + count + " efectuada ha estat a la posició: (x = "
					+ Math.round(x * 100.0) / 100.0 + " , y = " + Math.round(y * 100.0) / 100.0 + ")");
			System.out.println("La distància al punt (1,1) és: " + dist + "m");

			if (dist < oka) {
				oka = dist;
			} else {
				stop = !stop;
			}
		}
		System.out.println();

		if (stop)
			System.out.println("La seqüència no es estrictament decreixent.");
		else
			System.out.println("La seqüència es estrictament decreixent.");
	}
}
