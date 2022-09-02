package diasemana;

import java.util.Scanner;

public class DiaSemana {

    public static void main(String[] args) {
//        int dia;
//        System.out.println("Dias de la semana");
//        do {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("1. Lunes"
//                    + "\n2. Martes"
//                    + "\n3. Miercoles"
//                    + "\n4. Jueves"
//                    + "\n5. Viernes"
//                    + "\n6. Sabado"
//                    + "\n7. Domingo"
//                    + "\n8. Salir");
//            dia = sc.nextInt();
//            switch (dia) {
//                case 1:
//                case 2:
//                case 3:
//                case 4:
//                case 5:
//                    System.out.println("Dia Laboral");
//                    break;
//                case 6:
//                case 7:
//                    System.out.println("Dia de descanso");
//                    break;
//                case 8:
//                    System.out.println("Hasta pronto");
//                    break;
//                default:
//                    System.out.println("Opcion desconocida");
//            }
//        }while(dia!=8);

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un dia de la semana");
        String dia = sc.nextLine();
        switch (dia) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Dia festivo");
                break;
            case "salir":
                System.out.println("Hasta pronto");
                break;
            default:
                System.out.println("Intenta nuevamente");
        }
    }

}
