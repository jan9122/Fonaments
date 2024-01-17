package Exercici2;

import Keyboard.*;

public class Class2 {

	public static void main(String[] args) {
		int num, n, c;

		System.out.println("******INVERTIR NÚMERO*****");
		System.out.println("Entra el número a invertir");
		n = Keyboard.readInt();
		c = 0;

		while (n < 0) {

			System.out.println("El número ha de ser positiu, torne'l a introduir: ");
			n = Keyboard.readInt();
		}
		while (n > 0) {

			num = n % 10;
			n = n / 10;
			c = c * 10 + num;

		}

		System.out.println("El número girat és:");
		System.out.println(c);

	}

}
