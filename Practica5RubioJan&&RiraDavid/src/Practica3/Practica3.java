package Practica3;

import java.util.Random;
import Keyboard.*;

public class Practica3 {

	private static int llegirValor(int minim, int maxim, String text) {
		int valor;

		do {
			valor = Keyboard.readInt();
			if (valor < minim || valor > maxim) {
				System.out.println(text);
			}
		} while (valor < minim || valor > maxim);

		return valor;
	}

	private static void visualitzar(int[][] taulell, int numFiles) {
		for (int i = 0; i < numFiles; i++) {
			if (!isBuida(taulell, i)) {
				for (int j = 0; j < taulell[i].length; j++) {
					if (taulell[i][j] == 0) {
						System.out.print("X ");
					} else {
						System.out.print(taulell[i][j] + " ");
					}
				}
				System.out.println();
			}
		}
	}

	private static int[][] crearTaulell() {
		int[][] taulell = new int[12][9];
		Random rand = new Random();
		int comptador = 0;

		for (int i = 0; i < taulell.length; i++) {
			for (int j = 0; j < taulell[i].length; j++) {
				if (comptador < 36) {
					taulell[i][j] = rand.nextInt(9) + 1;
					comptador++;
				} else {
					taulell[i][j] = 0;
				}
			}
		}
		return taulell;
	}

	private static void buidaComponent(int[][] taulell, int fila, int col) {
		if (fila >= 0 && fila < taulell.length && col >= 0 && col < taulell[0].length) {
			taulell[fila][col] = 0;
		} else {
			System.out.println("Posició fora dels límits del tauler.");
		}
	}

	private static boolean parellaHoritzontal(int[][] taulell, int fil1, int col1, int fil2, int col2) {
		if (taulell[fil1][col1] == 0 || taulell[fil2][col2] == 0
				|| (taulell[fil1][col1] != taulell[fil2][col2] && taulell[fil1][col1] + taulell[fil2][col2] != 10)) {
			return false;
		}

		int start = col1;
		int end = taulell[fil2].length;

		for (int i = fil1; i <= fil2; i++) {
			if (i == fil2) {
				end = col2;
			}
			for (int j = start + 1; j < end; j++) {
				if (taulell[i][j] != 0) {
					return false;
				}
			}
			start = 0;
		}

		return true;
	}

	private static boolean parellaVertical(int[][] taulell, int fil1, int col1, int fil2, int col2) {
		if (col1 != col2) {
			return false;
		}

		for (int i = fil1 + 1; i < fil2; i++) {
			if (taulell[i][col1] != 0) {
				return false;
			}
		}

		return true;
	}

	private static boolean parellaDiagonal(int[][] taulell, int fil1, int col1, int fil2, int col2) {
		if (fil1 - col1 != fil2 - col2) {
			return false;
		}

		int start = Math.min(col1, col2);
		int end = Math.max(col1, col2);
		for (int i = start + 1; i < end; i++) {
			if (taulell[i][i] != 0) {
				return false;
			}
		}

		return true;
	}

	private static void afegir(int[][] taulell, int numFiles) {
		int[] vector = new int[numFiles * taulell[0].length];
		int index = 0, i;

		for (i = 0; i < numFiles; i++) {
			for (int j = 0; j < taulell[i].length; j++) {
				if (taulell[i][j] != 0) {
					vector[index++] = taulell[i][j];
				}
			}
		}

		index = 0;
		for (i = i; i < numFiles + 4; i++) {
			for (int j = 0; j < taulell[i].length; j++) {
				taulell[i][j] = vector[index];
				index = (index + 1) % (numFiles * taulell[0].length);
			}
		}
	}

	private static boolean isBuida(int[][] taulell, int fila) {
		for (int j = 0; j < taulell[fila].length; j++) {
			if (taulell[fila][j] != 0) {
				return false;
			}
		}
		return true;
	}

	private static void eliminarFila(int[][] taulell, int fila) {
		int i = fila, j = 0, cont = 0;
		while (cont < 11 - fila) {
			while (j < taulell[i].length) {

				taulell[i][j] = taulell[i + 1][j];

				j++;
			}
			cont++;
			i++;
			j = 0;
		}

	}

	public static boolean isBuit(int[][] t, int numFiles) {
		for (int i = 0; i < numFiles; i++) {
			for (int j = 0; j < t[i].length; j++) {
				if (t[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] taulell = crearTaulell();
		int numFiles = 4;
		boolean end = false;
		System.out.println("NUMBER MATCH. Comença la partida");
		System.out.println("********************************");
		System.out.println("Estat inicial: Taulell creat");
		while (!isBuit(taulell, numFiles) && !end) {
			visualitzar(taulell, numFiles);
			System.out.println("Que vols fer");
			System.out.println("************");
			System.out.println("1.- Aparellar");
			System.out.println("2.- Posar més números -màxim 2 cops");
			System.out.println("3.- Acabar");
			int preg = llegirValor(1, 3, "Indica un numero dins de las opcions.");

			if (preg == 1) {
				System.out.println("INDICA ELS ÍNDEXS DE LES COMPONENTS QUE VOLS APARELLAR");
				System.out.println("ENTRAR PRIMER LA COMPONENT QUE ESTÀ MÉS AMUNT I ESQUERRA. FEM CONFIANÇA");

				System.out.println("Indica la fila de la primera component");
				int fil1 = llegirValor(0, numFiles - 1, "Indica un numero dins de las opcions.");

				System.out.println("Indica la columna de la primera component");
				int col1 = llegirValor(0, taulell[0].length - 1, "Indica un numero dins de las opcions.");

				System.out.println("Indica la fila de la segon component");
				int fil2 = llegirValor(0, numFiles - 1, "Indica un numero dins de las opcions.");

				System.out.println("Indica la columna de la segon component");
				int col2 = llegirValor(0, taulell[0].length - 1, "Indica un numero dins de las opcions.");

				if (parellaHoritzontal(taulell, fil1, col1, fil2, col2)
						|| parellaVertical(taulell, fil1, col1, fil2, col2)
						|| parellaDiagonal(taulell, fil1, col1, fil2, col2)) {
					System.out.println("Fan Parella.");
					buidaComponent(taulell, fil1, col1);
					buidaComponent(taulell, fil2, col2);

					if (isBuida(taulell, fil1) == true) {
						System.out.println("eliminada fila de índice " + fil1);
						eliminarFila(taulell, fil1);
						numFiles--;
					}
					if (isBuida(taulell, fil2) == true && fil1 != fil2) {
						System.out.println("eliminada fila de índice " + fil2);
						eliminarFila(taulell, fil2);
						numFiles--;
					}
				} else {
					System.out.println("Las componentes seleccionadas no forman una pareja.");
					System.out.println();
				}
			} else if (preg == 2) {
				afegir(taulell, numFiles);
				numFiles += 4;
			} else {
				System.out.println("Adeu!!");
				end = true;
			}

		}
		if (isBuit(taulell, numFiles)) {
			System.out.println("¡Felicidades! Has vaciado el tablero.");
		}

	}

}
