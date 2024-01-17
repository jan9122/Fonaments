package Practica3;

import Keyboard.*;

public class Practica3 {

	public static void main(String[] args) {

		int pes;
		double altura, imc;
		String clasi = "";

		System.out.println("Clasificació de l'IMC");
		System.out.println("---------------------");
		System.out.println();
		System.out.println("Quin és el teu oes (en KG.)?");
		pes = Keyboard.readInt();
		if (pes > 0) {
			System.out.println("Quina és la teva alçaca (en m.)?");
			altura = Keyboard.readDouble();
			if (altura > 0.0) {

				imc = pes / (altura * altura);
				if (imc < 18.0) {
					clasi = "INFRAPÈS";
				} else if (imc >= 18.0 && imc <= 25.0) {
					clasi = "NORMAL";
				} else if (imc > 25.0) {
					clasi = "OBESITAT";
				}

				System.out.println();
				System.out.println("El teu IMC és:" + imc);
				System.out.println("Aixo vol dir que és " + clasi);
			} else {
				System.out.println("Error Numero negativo.");
			}
		} else {
			System.out.println("Error Numero Negativo.");
		}

	}

}
