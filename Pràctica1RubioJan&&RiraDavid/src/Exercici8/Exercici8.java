package Exercici8;

import Keyboard.*;

public class Exercici8 {

	public static void main(String[] args) {
		
		int first, second, third;
		
		System.out.println("****Entrada dels valors****");
		System.out.println("===========================");
		System.out.println("Entra el primer valor");
		first = Keyboard.readInt();		
		System.out.println((first/100));
		System.out.println((first/10)%10);
		System.out.println((first%10));
		System.out.println("Entra el segon valor");
		second = Keyboard.readInt();
		System.out.println((second/100));
		System.out.println((second/10)%10);
		System.out.println((second%10));
		System.out.println("Entra el tercer valor");
		third = Keyboard.readInt();
		System.out.println((third/100));
		System.out.println((third/10)%10);
		System.out.println((third%10));
		System.out.println("******Càlcul de les expressions amb els valors: " + "a=" + first + " b=" + second + " c=" + third + " ******");
		System.out.println("------------------------------------------------------------------------------------------------------------");
		System.out.println("Resultat de: a > 3 és: " + (first>3));
		System.out.println("Resultat de: a > c és: " + (first>third));
		System.out.println("Resultat de: b != c és: " + (second!=third));
		System.out.println("Resultat de: a == 3 és: " + (first==3));
		System.out.println("Resultat de: a * b == 15 és: " + (first*second==15));
		System.out.println("Resultat de: c / b == -10 és: " + (third/second==-10));
		System.out.println("Resultat de: a + b + c == 5 és: " + (first+second+third==5));
		System.out.println("Resultat de: (a+b == 8) && (a-b == 2) és: " + ((first+second==8)&&(first-second==2)));
		System.out.println("Resultat de: (a+b == 8) || (a-b == 6) és: " + ((first+second==8)||(first-second==6)));
		System.out.println("Resultat de: a > 3 && b > 3 && c < 3 és: " + ((first>3)&&(second>3)&&(third<3)));
		
	}
	
}
