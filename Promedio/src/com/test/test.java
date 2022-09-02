package com.test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese calificacion");
        double cal1 = sc.nextDouble();
        System.out.println("Ingrese calificacion");
        double cal2 = sc.nextDouble();
        System.out.println("Ingrese calificacion");
        double cal3 = sc.nextDouble();
        double [] calificaciones = {cal1, cal2, cal3};

        double promedio = 0;
        int cont = calificaciones.length;
        for(int i = 0; i < cont; i++){
            promedio = promedio+calificaciones[i];
        }
        promedio = promedio/cont;
        System.out.println(promedio);
    }
}
