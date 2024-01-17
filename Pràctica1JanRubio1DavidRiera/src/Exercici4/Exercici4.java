package Exercici4;

import Keyboard.*;

public class Exercici4 {

	public static void main(String[] args) {
		
		float consum;
		int consumround;
		int litres;
		int autonomia;
		
		System.out.println("Càlcul de l'autonomia d'un vehicle");
		System.out.println("==================================");
		System.out.println("Quants litres consumeix per cada 100 quilòmetres?");
		consum = Keyboard.readFloat();
		consumround = Math.round(consum);
		System.out.println("Quants litres et queden de dipòsit?");
		litres = Keyboard.readInt();
		
		autonomia = litres * 100 / consumround;
		System.out.println("Tens una autonomia per fer: " + autonomia + "Km");
		
	}
	
}
