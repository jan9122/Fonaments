package Exercici9;

import Keyboard.*;

public class Exercici9 {

	public static void main(String[] args) {
		
		double mbps;
		double mates;
		int temps;
		
		System.out.println("Indica quin és el cabal de la conenexió a Internet (MB/s)");
		mbps = Keyboard.readDouble();
		System.out.println("Quants minuts et triga la descarrega del video?");
		temps = Keyboard.readInt();
		
		mates = (mbps*60)*temps;
		
		System.out.println("El teu vídeo té una mida de:");
		System.out.println((mates*1024) + "KB");
		System.out.println((mates) + "MB");
		System.out.println((mates/1024) + "GB");
		System.out.println(((mates/1024)/1024) + "TB");
		
	}
	
}
