package Exercici2;

import Keyboard.*;

public class Exercici2 {

	public static void main(String[] args) {
		
		int dias;
		int hores;
		int minuts;
		int segons;
		int resultado;
		
		System.out.println("Calcular número TOTAL de segons");
		System.out.println("*******************************");
		
			
		System.out.println("Quants dias?");
		dias = Keyboard.readInt();
		System.out.println("Quantes hores?");
		hores = Keyboard.readInt();
		System.out.println("Qunts minuts?");
		minuts = Keyboard.readInt();
		System.out.println("Quants segons?");
		segons = Keyboard.readInt();
		
		resultado = dias * 86400 + hores * 3600 + minuts * 60 + segons;
		
		System.out.println(dias + " dias" + " - " + hores + " hores" + " - " + minuts + " minuts" + " - " + segons + " segons són:" + resultado + " segons");
		
	}
	
}
