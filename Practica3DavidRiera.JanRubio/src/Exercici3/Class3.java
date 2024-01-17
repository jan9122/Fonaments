package Exercici3;

import Keyboard.*;

public class Class3 {

	public static void main(String[] args) {
		int num1, num2, n1, n2, mult, nm;
		double arr;

		System.out.println("Entra valor inferior de l'interval");
		num1 = Keyboard.readInt();
		arr =0;
		n2=0;

		while (num1 < 0) {

			System.out.println("Incorrecte. Ha de ser positiu. Entre un altre número. ");
			num1 = Keyboard.readInt();
		}
		
		System.out.println("Entra valor superior de l'interval");
		num2 = Keyboard.readInt();
		
		while (num2 > 0 && num2 < num1) {
			
			System.out.println("Incorrecte. Ha de ser major a " + num1 + ". Entre un altre número. ");
			num2 = Keyboard.readInt();

		}
		
		System.out.println("Dins de l'interval [" + num1 + ", " + num2 + "] hi ha: ");
		
		while (num1 <= num2) {
				n2=0;
				
				if(num1 % 5 == 0) {
					
					mult = num1;
					
				while (mult != 0) {
						
					nm = mult % 10;
					mult = mult / 10;
					n2 = n2* 10 + nm;
					
				}
					arr = Math.sqrt(n2);
				
				System.out.println("El númer invertit del " + num1 + " és el " + n2 + " i la seva arrel cuadrada és:" + arr);
		}		
				num1++;
		
		}
	}
}

