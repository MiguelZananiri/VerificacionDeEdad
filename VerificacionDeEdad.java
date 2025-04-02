package VerificacionDeEdad;

import java.util.Scanner;

public class VerificacionDeEdad {
    public static void main(String[] args){
        System.out.println("ESPACIO");

        Scanner scanner = new Scanner(System.in);
        String nombre;
        String juego;
        int edad;

        System.out.println("¿Cual es tu nombre?");
        nombre = scanner.nextLine();

        System.out.println("Hola " + nombre + " ¿Que juego quieres iniciar?");
        juego = scanner.nextLine();

        System.out.println("Iniciando " + juego);
        System.out.println("¿Cual es su edad?");
        edad = scanner.nextInt();
        if (edad >= 18)  {
            System.out.println("Puedes jugar este juego sin problemas");
        }
        else if (edad < 18 && edad >= 1) {
            System.out.println("Este juego es solo para adultos");
        } else {
            System.out.println("Su edad esta incorrecta");
        }
        scanner.close();

    }
}
