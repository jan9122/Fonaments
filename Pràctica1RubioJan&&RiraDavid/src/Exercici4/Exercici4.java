package Exercici4;

import Keyboard.*;

public class Exercici4 {

	public static void main(String[] args) {
		
		float consum;
		int litres;
		float autonomia;
		int resultado;
		
		System.out.println("Càlcul de l'autonomia d'un vehicle");
		System.out.println("==================================");
		
		System.out.println("Quants litres consumeix per cada 100 quilòmetres?");
		consum = Keyboard.readFloat();
		
		System.out.println("Quants litres et queden de dipòsit?");
		litres = Keyboard.readInt();
		
		autonomia = (litres * 100) / consum;
		resultado = Math.round(autonomia);
		
		System.out.println("Tens una autonomia per fer: " + resultado + "Km");
		
	}
	
}
