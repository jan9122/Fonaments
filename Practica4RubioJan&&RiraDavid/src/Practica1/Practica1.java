package Practica1;

import Keyboard.*;
import java.util.Random;

public class Practica1 {

	public static char rChar() {
		int decimal;
		char rchar;

		Random rng = new Random();

		decimal = rng.nextInt(33, 127);
		while (decimal == 42) {
			decimal = rng.nextInt(33, 127);
		}

		rchar = (char) decimal;
		return rchar;

	}

	public static void main(String[] args) {
		int age;
		char random;

		System.out.println("Quants anys tens?");
		age = Keyboard.readInt();

		if (age >= 18) {
			random = '*';
		} else {
			random = rChar();
		}

		if (age == 4 || age == 6) {
			Activitat10.Activitat10.drum(age, false);
		} else if (age >= 3 && age <= 7) {
			Activitat9.Activitat9.chair(age, random, false);
		} else if (age > 7 && age < 21) {
			Activitat10.Activitat10.drum(age, true);
		} else if (age >= 21) {
			if (age % 2 == 1 && age % 5 == 0) {
				Activitat9.Activitat9.chair(age, random, false);
			} else if (age % 2 == 1) {
				Activitat9.Activitat9.chair(age, random, true);
			} else if (age % 4 == 0) {
				Activitat10.Activitat10.drum(age, false);
			}else {
				Activitat10.Activitat10.drum(age, true);
			}
		} else {
			System.out.println("Encara et fa falta un cotxet");
		}

	}

}
