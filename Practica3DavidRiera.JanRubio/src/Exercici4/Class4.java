package Exercici4;

import Keyboard.*;

import java.util.Random;

public class Class4 {
	
	private static int InvN (int inver) {
		int j = 0, d = 0;
		
		while (inver > 0) {

			j = inver % 10;
			inver = inver / 10;
			d = d * 10 + j;
			
	}
			
		return (d);
		
}

	
	public static void main(String[] args) {
		int num, c = 0, n = 0, ran, ran1, num1, result;
		Random vt = new Random();
		ran = vt.nextInt(1000,9999);
		
	System.out.println("Ja tenim el número amagat!");
	System.out.println("Dona un número de 4 dígits: ");
	
	System.out.println(ran);
	
	num = Keyboard.readInt();
	
	if (num == ran) {
		
	System.out.println("El número descobert fins ara és: " + ran);
	System.out.println("Has esbrinat el número. Adeu!");
	
	}
	
	ran1 = InvN(ran);
	num1 = InvN(num);
	
	while (num1 != ran1) {
		
		
		n = ran1 %10;
		ran1 = ran1/10;

		c = num1 %10;
		num1 = num1 /10;
		
		if (n == c) {
			
			System.out.print(n);
		}
		
		else {
			
			System.out.print("?");
		}
		
		}
		
	}


	}
	
	

