package iva;

import java.util.Scanner;

public class Iva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double iva = 0.21;
        System.out.println("Ingresa el precio ara saber su precio con iva");
        double precio = sc.nextDouble();
        double precioFinal = (precio*iva)+precio;
        System.out.println("Precio con iva: " + precioFinal);
       
    }
    
}
