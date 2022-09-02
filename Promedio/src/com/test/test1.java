package com.test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la calificacion");
        double cal1 = sc.nextDouble();
        System.out.println("ingrese la calificacion");
        double cal2 = sc.nextDouble();
        System.out.println("ingrese la calificacion");
        double cal3 = sc.nextDouble();
        double[] calificaciones = {cal1, cal2, cal3};
        int cantidadCal = calificaciones.length;
        double calificacionesIng = 0;
        for(int i = 0; i < cantidadCal; i++){
            System.out.println("las calificacones son: " + calificaciones[i]);
        }
        System.out.println();

        double promedio = 0;
        for(int i = 0; i < cantidadCal; i++) {
            promedio = promedio + calificaciones[i];
        }
        promedio = promedio/cantidadCal;
        System.out.println("El promedio de las calificaciones es: " + promedio);
    }
}
