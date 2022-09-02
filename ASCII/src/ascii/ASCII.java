package ascii;

import java.util.Scanner;

public class ASCII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero para mostar el codigo ASCII");
        int num = sc.nextInt();
        
        char ascci = (char)num;
        System.out.println("ascci = " + ascci);
        
        System.out.println("Ingresa un caracter la tabla ASCII ");
        char caracter = sc.next().charAt(0);
        
        //pasamos el caracter a codigo
        int codigo = (int) caracter;
        System.out.println("el codigo es: " + codigo);
    }
    
}
