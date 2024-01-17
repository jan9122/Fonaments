package Exercici9;

import java.util.Random;

import Keyboard.Keyboard;

public class Class9 {
	
	private static void Silla(int n, char f, boolean o) {
		int x = 1, y =1, c = 0, d, g = 0;
		if (o == true) {
			while (x < (n+1) / 2) {
				System.out.println(f);
				x++;		
				}
				while (c < n) {
				System.out.print(f);
				c++;
				}
				System.out.println();
				while (y < (n+1) / 2) {
				d = 0;
				System.out.print(f);
				
				while (d < n - 2) {
				System.out.print(' ');
				d++;
				}
				System.out.print(f);
				System.out.println();
				y++;
				}
			}
		else 
			while (x < (n+1) / 2) {
				g = 0;
				while (g < n-1) {
				System.out.print(' ');
				g++;
				}
				System.out.println(f);
				x++;	
				}
				while (c < n) {
				System.out.print(f);
				c++;
				}
				System.out.println();
				while (y < (n+1) / 2) {
				d = 0;
				System.out.print(f);
				while (d < n - 2) {
				System.out.print(' ');
				d++;
				}
				System.out.print(f);
				System.out.println();
				y++;
				}
			}
	
	public static void main(String[] arngs) {
		int n, b;
		Random rnd = new Random();
		boolean o;
		char f = 0;
		
		o = rnd.nextBoolean();
		b = rnd.nextInt(3);
		
		switch (b){
			case 0: f = '*'; break;
			case 1: f = '%'; break;
			case 2: f = '&'; break;	
		}
		System.out.println("Entra la mida del taburet");
		n = Keyboard.readInt();
		Silla (n,f,o);	
	}
}
