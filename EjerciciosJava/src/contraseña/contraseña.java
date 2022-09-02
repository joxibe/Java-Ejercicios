package contraseña;

import java.util.Scanner;

public class contraseña {

    public static void main(String[] args) {
        String contraseña;
        String contraseñaCorrecta = "Amoyew0308*";
        int intentos = 3;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Intentos: " + intentos);
            System.out.println("Ingresa la contrseña");
            contraseña = sc.nextLine();
                if (contraseña.equals(contraseñaCorrecta)) {
                    System.out.println("Enhorabuena");
                } else {
                    intentos--;
                    System.out.println("Incorrecto");
                }
        } while (!contraseña.equals(contraseñaCorrecta) && intentos>0);
    }
}
