package Practica2;

import Keyboard.*;

public class Practica2 {

	private static int llegir(int minim, int maxim, String quina) {
		int lectura = 0;

		if (quina == ("opcio")) {
			do {
				System.out.println("Tria una opcio:");
				System.out.println("1.- Nivell senzill");
				System.out.println("2.- Acabar");
				lectura = Keyboard.readInt();

				if (lectura < minim || lectura > maxim) {
					System.out.println("incorrecte. Intenteu de nou");
					System.out.println("Tria una opcio:");
					System.out.println("1.- Nivell senzill");
					System.out.println("2.- Acabar");
					lectura = Keyboard.readInt();
				}
			} while (lectura < minim || lectura > maxim);
		}

		if (quina == ("org")) {
			do {
				System.out.println("Indica l’ampolla origen [1,5]");
				lectura = Keyboard.readInt();
			} while (lectura < minim || lectura > maxim);
		}

		if (quina == ("dest")) {
			do {
				System.out.println("Indica l’ampolla destí [1,5]");
				lectura = Keyboard.readInt();
			} while (lectura < minim || lectura > maxim);
		}
		return lectura;

	}

	private static int quantsDigits(int num) {
		int cont = 0;

		if (num == 0)
			return 1;

		while (num != 0) {
			num /= 10;
			cont++;
		}
		return cont;
	}

	private static int colorSobre(int num) {

		while (num > 10) {
			num /= 10;
		}
		return num;
	}

	private static int treureColor(int num) {

		num %= (int) Math.pow(10, quantsDigits(num) - 1);
		return num;

	}

	private static int afegirColor(int num, int col) {

		if (num == 0)
			return col;
		else
			return (int) (num + col * Math.pow(10, quantsDigits(num)));
	}

	private static String donaColor(int col) {
		String color = "";
		switch (col) {
		case 0:
			color = "Buit			";
			break;
		case 1:
			color = "Blau			";
			break;
		case 2:
			color = "Vermell			";
			break;
		case 3:
			color = "Taronje			";
			break;
		}
		return color;
	}

	private static void mostrarAmpolles(int num1, int num2, int num3, int num4, int num5) {
		System.out.println("Ampolla 1		Ampolla 2		Ampolla 3		Ampolla 4		Ampolla 5");
		System.out.println("---------		---------		---------		---------		---------");
		System.out.println(
				num1 + "			" + num2 + "			" + num3 + "			" + num4 + "			" + num5);
		for (int i = 0, m = 1000; i < 4; i++, m /= 10) {
			System.out.print(donaColor(num1 / m % 10) + donaColor(num2 / m % 10) + donaColor(num3 / m % 10)
					+ donaColor(num4 / m % 10) + donaColor(num5 / m % 10));
			System.out.println();
		}

	}

	private static int quinaAmpolla(int num, int num1, int num2, int num3, int num4, int num5) {
		switch (num) {
		case 1:
			return num1;
		case 2:
			return num2;
		case 3:
			return num3;
		case 4:
			return num4;
		case 5:
			return num5;
		}
		return 0;
	}

	private static boolean idemColor(int num) {
		if (quantsDigits(num) == 4) {
			boolean check = true;
			int primerDigito = num % 10;
			num /= 10;
			while (num > 0 && check) {
				int digito = num % 10;
				if (digito != primerDigito) {
					check = false;
				}
				num /= 10;
			}
			return check;
		} else if (num == 0) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean traspassar(int origen, int desti) {
		return (!idemColor(origen) && (desti == 0 || colorSobre(origen) == colorSobre(desti)));
	}

	private static String crearLlavor() {
		String org = "111122223333", ale = "";

		while (!org.isEmpty()) {
			int indAle = (int) (Math.random() * org.length());

			char caracter = org.charAt(indAle);

			ale += caracter;

			org = org.substring(0, indAle) + org.substring(indAle + 1);
		}
		return ale;
	}

	private static int crearNum(String llavor, int quina) {
		String letra = llavor.substring(quina, quina + 4);
		int num = Integer.parseInt(letra);
		return num;
	}

	public static void main(String[] args) {
		int opcio;
		int orgnum, destnum, orgle, destle;
		int ampo1, ampo2, ampo3, ampo4, ampo5;
		int agregar = 0;
		boolean end = false;
		String semilla;
		while (!end) {
			opcio = llegir(1, 2, "opcio");
			if (opcio == 2) {
				end = true;
				System.out.println("Has salido del juego!");
			} else {
				semilla = crearLlavor();
				ampo1 = crearNum(semilla, 0);
				ampo2 = crearNum(semilla, 4);
				ampo3 = crearNum(semilla, 8);
				ampo4 = 0;
				ampo5 = 0;

				System.out.println("Ampolles creades. Visualització");
				System.out.println("*******************************");

				do {

					mostrarAmpolles(ampo1, ampo2, ampo3, ampo4, ampo5);
					System.out.println();
					System.out.println("Indica el traspàs que vols fer");
					System.out.println("------------------------------");

					do {
						orgle = llegir(1, 5, "org");
						destle = llegir(1, 5, "dest");
						orgnum = quinaAmpolla(orgle, ampo1, ampo2, ampo3, ampo4, ampo5);
						destnum = quinaAmpolla(destle, ampo1, ampo2, ampo3, ampo4, ampo5);
						if (!traspassar(orgnum, destnum)) {
							System.out.println("Traspàs no possible");
							System.out.println();
						}
						agregar = colorSobre(orgnum);
					} while (!traspassar(orgnum, destnum));

					switch (destle) {
					case 1:
						ampo1 = afegirColor(ampo1, agregar);
						break;
					case 2:
						ampo2 = afegirColor(ampo2, agregar);
						break;
					case 3:
						ampo3 = afegirColor(ampo3, agregar);
						break;
					case 4:
						ampo4 = afegirColor(ampo4, agregar);
						break;
					case 5:
						ampo5 = afegirColor(ampo5, agregar);
						break;
					}

					switch (orgle) {
					case 1:
						ampo1 = treureColor(ampo1);
						break;
					case 2:
						ampo2 = treureColor(ampo2);
						break;
					case 3:
						ampo3 = treureColor(ampo3);
						break;
					case 4:
						ampo4 = treureColor(ampo4);
						break;
					case 5:
						ampo5 = treureColor(ampo5);
						break;
					}

					System.out.println();

				} while (!(idemColor(ampo1) && idemColor(ampo2) && idemColor(ampo3) && idemColor(ampo4)
						&& idemColor(ampo5)));

				mostrarAmpolles(ampo1, ampo2, ampo3, ampo4, ampo5);
				System.out.println("-------------------------------");
				System.out.println("-Juego terminado. ¡Has ganado!-");
				System.out.println("-------------------------------");
				System.out.println("Vuelve a elegir si quieres jugar otra vez o salir del juego!");
				System.out.println();
			}
		}
	}

}