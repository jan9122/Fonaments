package Practica2;

import Keyboard.*;

public class Practica2 {

	public static void main(String[] args) {

		int day, month, year, nday;
		int a, b, c, d, e, f, g, h;

		System.out.println("Entra el dia en què vas neixer:");
		day = Keyboard.readInt();
		if (day >= 1 && day <= 31) {
			System.out.println("Entra el mes en que vas neixer:");
			month = Keyboard.readInt();

			if (month >= 1 && month <= 12) {
				System.out.println("Entra l'any en que vas neixer:");
				year = Keyboard.readInt();

				if (year > 1582) {
					System.out.println("Has nascut el: " + day + "-" + month + "-" + year);

					a = (14 - month) / 12;
					b = year - a;
					c = month + (12 * a) - 2;
					d = b / 4;
					e = b / 100;
					f = b / 400;
					g = (31 * c) / 12;
					h = day + b + d - e + f + g;
					nday = h % 7;

					if (nday == 0) {

						System.out.println("El dia que vas néxer va caure en Diumenge");

					} else if (nday == 1) {

						System.out.println("El dia que vas néxer va caure en Dilluns");

					} else if (nday == 2) {

						System.out.println("El dia que vas néxer va caure en Dimart");

					} else if (nday == 3) {

						System.out.println("El dia que vas néxer va caure en Dimecres");

					} else if (nday == 4) {

						System.out.println("El dia que vas néxer va caure en Dijous");

					} else if (nday == 5) {

						System.out.println("El dia que vas néxer va caure en Divendres");

					} else if (nday == 6) {

						System.out.println("El dia que vas néxer va caure en Dissabte");

					}

				} else {
					System.out.println("Any incorrecte. Adeu!");
				}
			} else {
				System.out.println("Mes incorrecte. Adeu!");
			}
		} else {
			System.out.println("Dia incorrecte. Adeu!");
		}

	}

}
