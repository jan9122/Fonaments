package Practica5;

public class Practica5 {

	public static void main(String[] args) {

		double carta1, carta2;
		long palo1, palo2, cartai1, cartai2;
		double total;
		String palos1, palos2;

		System.out.println("Joc del Set i Mig");
		System.out.println("=================");

		carta1 = Math.floor((Math.random() * 12) + 1); 		//Get Random Number for First Card between 0 and 11 later plus 1
		if (carta1 == 8 || carta1 == 9) {					//Here we exclude number 8 and 9 and we get a new random number (while is better for this)
			carta1 = Math.floor((Math.random() * 12) + 1);
		}

		carta2 = Math.floor((Math.random() * 12) + 1);		//Get Random Number for Second Card between 0 and 11 later plus 1
		if (carta2 == 8 || carta2 == 9) {					//Here we exclude number 8 and 9 and we get a new random number (while is better for this)
			carta2 = Math.floor((Math.random() * 12) + 1);
		}

		palo1 = Math.round((Math.random() * 3) + 1);			//We get here a number between 0 and 3 and then we plus 1
		palo2 = Math.round((Math.random() * 3) + 1);			//We get here a number between 0 and 3 and then we plus 1

		if (palo1 == 1) {										//Here we are comparing the number of palo with our 4 options (switch is better for this)

			palos1 = "OROS";

		} else if (palo1 == 2) {

			palos1 = "BASTONS";

		} else if (palo1 == 3) {

			palos1 = "ESPASES";

		} else if (palo1 == 4) {

			palos1 = "COPES";

		} else {												//In case we don't get any of that we put it in blank
			palos1 = "";
		}

		if (palo2 == 1) {										//Here we are comparing the number of palo with our 4 options (switch is better for this)

			palos2 = "OROS";

		} else if (palo2 == 2) {

			palos2 = "BASTONS";

		} else if (palo2 == 3) {

			palos2 = "ESPASES";

		} else if (palo2 == 4) {

			palos2 = "COPES";

		} else {												//In case we don't get any of that we put it in blank
			palos2 = "";
		}

		cartai1 = Math.round(carta1);							//Here we gone to separate the number we want to show with the one we want to do math
		cartai2 = Math.round(carta2);

		if (carta1 >= 10 && carta1 <= 12) {						//In case we get a number between 10 and 12 we are going to change it to 0.5
			carta1 = 0.5;
		}
		if (carta2 >= 10 && carta2 <= 12) {						//In case we get a number between 10 and 12 we are going to change it to 0.5
			carta2 = 0.5;
		}
		total = carta1 + carta2;								//Math first card plus second card

		System.out.println("Treiem la primera carta .... ha sortit: " + cartai1 + " de " + palos1);
		System.out.println("Treiem la segona carta .... ha sortit: " + cartai2 + " de " + palos2);

		if (total < 7.5) {										//Here we are comparing the number we get with 7.5 if its below we lose
			System.out.println("Vaja t'has quedat curt!");
		} else if (total == 7.5) {								//Here if our total its equal to 7.5 the we win
			System.out.println("Has guanyat. Felicitats!");
		} else {												//In case its not below or equal then we lose because its higher
			System.out.println("Uff t'has passat!");
		}

	}

}
