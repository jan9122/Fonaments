package Exercici10;

import Keyboard.*;

public class Exercici10 {

	public static void main(String[] args) {
		
		int filac, columnac, filaf, columnaf, diffila, difcolumnas;
		boolean posible;
		
		System.out.println("Indica en quina fila es troba el cavall");
		filac = Keyboard.readInt();
		System.out.println("Indica en quina columna es troba el cavall");
		columnac = Keyboard.readInt();
		
		System.out.println("Indica en quina fila desti vols moure el cavall");
		filaf = Keyboard.readInt();
		System.out.println("Indica en quina columna desti vols moure el cavall");
		columnaf = Keyboard.readInt();
		
		diffila = Math.abs(filac - filaf);
		difcolumnas = Math.abs(columnac - columnaf);
		
		posible = (diffila == 1 && difcolumnas == 2) || (diffila == 2 && difcolumnas == 1);
		
		System.out.println("El moviment de la posició (" + filac + "," + columnac + ") a la posició (" + filaf + "," + columnaf + ") és " + posible);
	}
	
}
