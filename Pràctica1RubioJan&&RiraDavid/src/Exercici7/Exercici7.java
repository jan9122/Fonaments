package Exercici7;

import Keyboard.*;

public class Exercici7 {

	public static void main(String[] args) {
		
		int sells;
		double importe, nomina;
		
		
		System.out.println("Càlcul Import Nòmina");
		System.out.println("====================");
		System.out.println("Quants cotxes ha venut el comercial?");
		sells = Keyboard.readInt();
		System.out.println("Indica l'import total dels " + sells + " cotxes venuts");
		importe = Keyboard.readDouble();
		
		nomina = 1250 + (sells * 150) + (importe * 0.05);
		
		System.out.println("La seva nòmina és de: " + Math.floor(nomina*100)/100 + " euros");
		
	}
	
}
