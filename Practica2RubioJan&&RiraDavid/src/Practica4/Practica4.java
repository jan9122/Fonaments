package Practica4;

import Keyboard.*;

public class Practica4 {

	public static void main(String[] args) {
		
		int tema, point;
		float total, press;
		total = 0.0f;
		
		System.out.println("Entra la temàtica del projecte (1:Medi ambient, 2:Sostenibilitat, 3:Perspectiva gènera) :");
		tema = Keyboard.readInt();
		while (tema < 1 || tema > 3) {
			
			System.out.println("Entra la temàtica del projecte (1:Medi ambient, 2:Sostenibilitat, 3:Perspectiva gènera) :");
			tema = Keyboard.readInt();
			
		}
		
		System.out.println("Entra el pressupost del projecte (valor superior a 1000)");
		press = Keyboard.readFloat();
		while (press<1000) {
			
			System.out.println("Entra el pressupost del projecte (valor superior a 1000)");
			press = Keyboard.readFloat();
			
		}
				
		System.out.println("Entra la puntuació del projecte (valor entre 10 i 200)");
		point = Keyboard.readInt();
		while (point<10&&point>200) {
			
			System.out.println("Entra la puntuació del projecte (valor entre 10 i 200)");
			point = Keyboard.readInt();
			
		}
		
		if (tema==1) {
			
			if (point>80) {
				
				total = press*0.9f;
				
			}
			else if (point>=60&&point<=80) {
				
				total = press*0.7f;
				
			}
			
		}
		else if (tema == 2) {
			
			if (point>75) {
				
				total = press;
				
			}
			else if (point>=60&&point<=75) {
				
				total = press*0.9f;
				
			}
			
		}
		else if (tema == 3) {
			
			if (point>50) {
				
				total = press*0.8f;				
				
			}
			else if (point>=40&&point<=50) {
				
				total = press*0.8f;
				
			}
			
		}
		else {
			
			total = 0.0f;
			
		}
	
		if (press<3500) {
			
			total = total+(total*0.2f);
			
			if (total>press) {
				
				total = press;
				
			}
			
		}
		
		System.out.println("La subenció atorgada al projecte és: " + total);
		
	}
	
}
