package Practica1;

import Keyboard.*;

public class Practica1 {

	public static void main(String[] args) {
		
		int first, second, uFirst, uSecond, dFirst, dSecond, Sum, uSum, dSum;
		int uextra = 0;
		int dextra = 0;
		
		System.out.println("PROGRAMA PER EXPLICAR LA SUMA");
		System.out.println("*****************************");
		System.out.println("Entra primer número: ");
		first = Keyboard.readInt();
		System.out.println("Entra segon número: ");
		second = Keyboard.readInt();
		
		uFirst = first%10;
		uSecond = second%10;
		 
		dFirst = first/10;
		dSecond = second/10;
		
		if (uFirst+uSecond>9) {
			
			uextra = (uFirst+uSecond)/10;
			
		}
		uSum = (uFirst+uSecond)%10;
		
		if (dFirst+dSecond+uextra>9) {
			
			dextra = (dFirst+dSecond+uextra)/10;
			
		}
		dSum = (dFirst+dSecond+uextra)%10;
		
		Sum = first+second;
		
		if (first<=9 && second<=9) {
			
			System.out.println("La suma de les unitats " + uFirst + " i " + uSecond + " és " + uSum + " i ens portem " + uextra + ".");
			System.out.println("Las desenes és " + uextra + " del què portem.");
			System.out.println("La suma és: " + Sum + ".");
			
		}
		else {
			
			System.out.println("La suma de les unitats " + uFirst + " i " + uSecond + " és " + uSum + " i ens portem " + uextra + ".");
			System.out.println("La suma de les desenes " + dFirst + " i " + dSecond + ", més el que portem " + uextra + " , és " + dSum + " i ens portem " + dextra + ".");
			System.out.println("Les centenes del resultat són el que portem, " + dextra + ".");
			System.out.println("La suma és: " + Sum + ".");
			
		}	
	}
}
