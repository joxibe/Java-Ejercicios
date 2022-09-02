package sololearn;

import java.util.Scanner;

public class SumaArreglos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la longitud del array");
        int length = scanner.nextInt();
        int[] array = new int[length];
        int suma = 0;
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < length; i++) {
            if(array[i] % 4 == 0){
                suma += array[i];
            }
        }
        System.out.println("La suma del arreglo es: " + suma);
    }

}
