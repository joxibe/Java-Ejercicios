package areacirculo;

import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indroduce el radio del circulo para calcular su area");
        double radio = sc.nextDouble();
        System.out.println("El area del circulo es: " + (radio*radio)*3.141592);
        
        //ahora con metodos de math
        double area = Math.PI*Math.pow(radio, 2);
        System.out.println("area = " + area);
    }
    
}
