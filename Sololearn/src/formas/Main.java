package formas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        int x = sc.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        int y = sc.nextInt();
        
        Square s = new Square(x);
        s.area();
        
        Circle c = new Circle(y);
        c.area();
    }
}
