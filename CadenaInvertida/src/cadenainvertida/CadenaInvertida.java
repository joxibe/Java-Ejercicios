package cadenainvertida;

import java.util.Scanner;

public class CadenaInvertida {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el texto a invertir");
        String texto = sc.nextLine();
        String textoInvertido = "";
//        
//        StringBuilder sb = new StringBuilder(texto);
//        String textoInvertido = sb.reverse().toString();
//        
//        System.out.println(textoInvertido);

        for(int i = texto.length()-1; i>=0; i--){
            textoInvertido += texto.charAt(i);
        }
        System.out.println(textoInvertido);
    }
}
