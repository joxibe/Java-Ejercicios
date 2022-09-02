package bienvenida;

import java.util.Scanner;

public class Bienvenida {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Bienvenido " + nombre);

    }
    
}
