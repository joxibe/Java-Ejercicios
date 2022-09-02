package resto;

import java.util.Scanner;

public class Resto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(num%2==0){
            System.out.println(num + " es divisible entre 2");
        }else{
            System.out.println(num + " no es divisible entre 2");
        }
    }
    
}
