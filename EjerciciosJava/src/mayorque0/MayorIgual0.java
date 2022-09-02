package mayorque0;

import java.util.Scanner;

public class MayorIgual0 {

    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingresa un numero entero mayor a 0");
            numero = sc.nextInt();
        }while(numero < 0);
    }

}
