package com.test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Ingresar cadena a invertir");
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();

        /*String textoInvertido = "";
        for(int i = texto.length() -1; i >= 0; i--){
            textoInvertido += texto.charAt(i);
        }
        System.out.println("Texto = " + texto);
        System.out.println("textoInvertido = " + textoInvertido);
        */

        Invertir invertir = new Invertir();
        String textoInvertido = invertir.invertirCadena(texto);
        System.out.println("texto: " + texto);
        System.out.println("textoInvertido: " + textoInvertido);


    }
}
