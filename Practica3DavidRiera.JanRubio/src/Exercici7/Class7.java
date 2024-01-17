package Exercici7;

import Keyboard.*;

public class Class7 {
	
	public static void main(String[] arngs) {
		int n,x = 0, y = 0;
		
		System.out.println("Entra la mida de la creu");
		n = Keyboard.readInt();
		
		
		while (x < n) {
			y = 0;
			
			while (y < n) {
				
				if (y==x || y == n -1 -x) {
				System.out.print("*");
				}
				else 
				System.out.print(" ");
				
				y++;

				}
			
			System.out.println();
			x++;
			}
			
		}

	}
