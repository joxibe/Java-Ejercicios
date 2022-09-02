package raizcuadrada;

import java.util.Scanner;

public class RaizCuadrada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el numero a");
        int a = sc.nextInt();
        System.out.println("ingresa el numero b");
        int b = sc.nextInt();
        System.out.println("ingresa el numero c");
        int c = sc.nextInt();
        
        double discriminante = Math.pow(b, 2)-(4*a*c);
        
        //mensaje de traza
        System.out.println(discriminante);
        
        if (discriminante>0){
            //Tambien se puede hacer por parte si lo ves más facil
            //recuerda que debes tener en cuenta la prioridad de elementos
            double x1=((b*(-1))+Math.sqrt(discriminante))/(2*a);
            double x2=((b*(-1))-Math.sqrt(discriminante))/(2*a);
  
            System.out.println("El valor de x1 es "+x1+" y el valor de x2 es "+x2);
        }else{
            System.out.println("El discriminante es negativo");
        }
    }
    
}
