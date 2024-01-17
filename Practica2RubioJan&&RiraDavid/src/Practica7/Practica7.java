package Practica7;

import Keyboard.*;

public class Practica7 {

    public static void main(String[] args) {

        char pass;
        int mayus = 0, digit = 0, especial = 0, letter = 0;

        System.out.print("Entra caràcter: ");
        pass = Keyboard.readChar();

        while (pass != ' ') {
            if (pass >= 'A' && pass <= 'Z') {
                mayus++;
            } else if (pass >= '0' && pass <= '9') {
                digit++;
            } else if (!((pass >= 'A' && pass <= 'Z') || (pass >= 'a' && pass <= 'z') || (pass >= '0' && pass <= '9'))) {
                especial++;
            }
            if ((pass >= 'A' && pass <= 'Z') || (pass >= 'a' && pass <= 'z')) {
                letter++;
            }
            System.out.print("Entra caràcter: ");
            pass = Keyboard.readChar();
        }

        if (pass == ' ') {
            if (letter < 8) {
                System.out.println("Contrassenya incorrecte. No té la largaria mínima requerida");
            } else if (letter == 0) {
                System.out.println("Contrassenva incorrecte. No té cap caracter de l'abecedari");
            } else if (digit == 0 && mayus == 0) {
                System.out.println("Contrassenva correcte. Contrassenva débil");
            } else if ((mayus == 0 && digit != 0) || (mayus != 0 && digit == 0)) {
                System.out.println("Contrassenva correcte. Contrassenva segura");
            } else if (mayus != 0 && digit != 0 && especial == 0) {
                System.out.println("Contrassenva correcte. Contrassenva robusta");
            } else if (mayus != 0 && digit != 0 && especial != 0) {
                System.out.println("Contrassenya correcte. Contrassenya robusta . A més, contrassenya seguríssima");
            }
        }
    }
}
