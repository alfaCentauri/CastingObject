package main;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String args[]){
        System.out.println("Ejemplo de programación en Java con Casting (conversión de tipos): ");
        System.out.println("Convertir un tipo de variable String a un tipo Integer: ");
        var edad = Integer.parseInt("35");
        System.out.println("Edad es " + edad );

        System.out.println("Convertir un tipo de variable String a un tipo Double: ");
        var valorPI = Double.parseDouble("3.141516");
        System.out.println("Pi = " + valorPI);

        var consola = new Scanner(System.in);
        System.out.println("Escriba una edad: ");
        var numero = consola.nextLine();
        edad = Integer.parseInt(numero);
        System.out.println("La Edad es " + edad );
        System.out.println("La Edad en texto es " + String.valueOf( edad ) );
    }
}
