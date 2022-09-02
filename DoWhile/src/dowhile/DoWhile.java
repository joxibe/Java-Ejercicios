package dowhile;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int passwordCorrect = 8819;
        int password;
        
        do{
            System.out.println("Ingresa la contraseña");
            password = sc.nextInt();
        }while(password != passwordCorrect);
    }
    
}
