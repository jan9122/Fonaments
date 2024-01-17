package Practica2;

import java.util.Random;
import Keyboard.*;

public class Practica2 {

	private static String[] inici_numeros() {

		String[] numeros = new String[11];

		numeros[0] = "zero";
		numeros[1] = "one";
		numeros[2] = "two";
		numeros[3] = "three";
		numeros[4] = "four";
		numeros[5] = "five";
		numeros[6] = "six";
		numeros[7] = "seven";
		numeros[8] = "eight";
		numeros[9] = "nine";
		numeros[10] = "ten";

		return numeros;
	}

	private static int[] inici_trials() {

		int[] trials = new int[11];

		for (int i = 0; i < trials.length; i++) {
			trials[i] = 3;
		}

		return trials;
	}

	private static boolean[] inici_encerts() {

		boolean[] encerts = new boolean[11];

		for (int i = 0; i < encerts.length; i++) {
			encerts[i] = false;
		}

		return encerts;
	}

	private static boolean comprovar_spell(int n, String lletres, String[] nums) {

		return lletres.equals(nums[n]);

	}

	private static int fallada(int n, int[] trials) {

		trials[n] -= 1;

		return trials[n];

	}

	private static void encert(int n, boolean[] encerts) {

		encerts[n] = true;

	}

	private static int obtenir_numero(int[] trials, boolean[] encerts) {

		Random rand = new Random();
		int numeroAleatorio = rand.nextInt(11);

		while (encerts[numeroAleatorio] || trials[numeroAleatorio] == 0) {
			numeroAleatorio = rand.nextInt(11);
		}

		return numeroAleatorio;
	}

	public static boolean joc_acabat(int[] trials, boolean[] encerts) {
		for (int i = 0; i <= 10; i++) {
			if (!encerts[i] && trials[i] != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String[] nums = inici_numeros();
		int[] trials = inici_trials();
		boolean[] encerts = inici_encerts();
		boolean done = false;

		System.out.println("Benvinguts/des al joc de lletrejar números en anglès");
		System.out.println("Encerta tots els números! Molts ànims!");
		System.out.println("****************************************************");

		do {
			int n = obtenir_numero(trials, encerts);
			done = false;
			do {
				System.out.print("Com es lletreja el número " + n + " (minúscules)? ");
				String resposta = Keyboard.readString();

				if (comprovar_spell(n, resposta, nums)) {
					encert(n, encerts);
					done = true;
				} else if (trials[n] > 1) {
					System.out
							.println("No has lletrejat bé el número. Et queden " + fallada(n, trials) + " oprtunitats");
				} else {
					fallada(n, trials);
					System.out.println("No et queden oportunitats. Continuem amb un altre número");
				}
			} while (trials[n] > 0 && !done);
		} while (!joc_acabat(trials, encerts));

		System.out.println("****************************************************");
		System.out.println("JOC FINALITZAT");
		System.out.println("Números lletrejats de forma correcte: " + contarEncerts(encerts));
		System.out.println("Números lletrejats de forma incorrectes: " + contarErrades(trials));
	}

	private static int contarEncerts(boolean[] encerts) {
		int contador = 0;
		for (boolean encert : encerts) {
			if (encert) {
				contador++;
			}
		}
		return contador;
	}

	private static int contarErrades(int[] trials) {
		int contador = 0;
		for (int trial : trials) {
			if (trial == 0) {
				contador++;
			}
		}
		return contador;
	}
}