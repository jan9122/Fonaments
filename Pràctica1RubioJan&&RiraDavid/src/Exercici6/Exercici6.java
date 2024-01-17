package Exercici6;

import Keyboard.*;

public class Exercici6 {
	
	public static void main(String[] args) {
		
		int input, hores, min, sec;
		
		System.out.println("Especifica el numero de segons");
		System.out.println("------------------------------");
		input = Keyboard.readInt();
		
		hores = input/3600;
		min = (input%3600)/60;
		sec = ((input%3600)%60);
		
		System.out.println(input + " són: " + hores + " hores i " + min + " minuts i queden " + sec + " segons");
		
	}

}
