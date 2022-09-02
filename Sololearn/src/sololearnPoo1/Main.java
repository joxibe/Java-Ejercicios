package sololearnPoo1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingresa la edad");
        int age = sc.nextInt();
        
        Student student = new Student();
        
        student.verificarEdad(age);
        System.out.println("Name: " + nombre);
        System.out.println("Age: " + student.getEdad());
    }
}
