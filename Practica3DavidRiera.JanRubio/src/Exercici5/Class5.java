package Exercici5;

import java.util.Random;

import Keyboard.*;

public class Class5 {
	
	private static double Dist(double x, double y) {
	    double x2 = 1, y2 = 1, dist;
	    
	    // També podria haver fer-ho directe
	    
	    dist = Math.sqrt(Math.pow((x2 - x), 2) + Math.pow((y2 - y), 2));
	    dist = dist*100; dist = Math.round(dist); dist = dist/100;
	    return dist;
	}
	
	public static void main(String[] args) {
		int num, a;
		double x , y, dist, pro, e = 0, nuv;
		
		System.out.println("Iniciem la sessió de tirades");
		System.out.println("############################");
		
		System.out.println("Entra el númer de tirades a efecturar: ");
		num = Keyboard.readInt();
		nuv = 0;
		
		while (nuv < num) {
			
			nuv++;
			pro =0;
			Random x1 = new Random();
			Random y1 = new Random();
			x = x1.nextDouble(0,1);
			y = y1.nextDouble(0,1);
			x = x*100; x = Math.round(x); x = x/100;
			y = y *100; y = Math.round(y); y = y/100;
			
			System.out.println("La tirada " + nuv + " efectuada ha estat a la posició: (x=" + x + ", y=" + y + ")");
			dist = Dist(x, y);

			if (dist<=1) {
				
			System.out.println("Encert, cau a la zona ombrejada, la distància al punt (1,1) és: " + dist);
			e++;
				
			}
			
			else {
			
			System.out.println("Fallada, cau fóra de la zona ombrejada, la distància al punt (1,1) és: " + dist);
			 
			}
			
			pro = e/nuv;
			
			System.out.println("La proporció d'encerts fins el moment és: " + e +  " encerts de " + nuv + " tirada. La proporció és: " + pro);	
			System.out.println();
		}
	}

}
