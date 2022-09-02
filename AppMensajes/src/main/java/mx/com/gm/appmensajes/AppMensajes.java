package mx.com.gm.appmensajes;

import java.sql.SQLException;
import java.util.Scanner;
import usuario.MensajeUsuario;

public class AppMensajes {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        
        int opcion = 0;
        
        do{
            System.out.println("----------------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. crear mensaje");
            System.out.println("2. listar mensaje");
            System.out.println("3. editar mensaje");
            System.out.println("4. elminar mensaje");
            System.out.println("5. salir");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1: 
                    MensajeUsuario.crearMensaje();
                    break;
                case 2:
                    MensajeUsuario.listarMensaje();
                    break;
                case 3:
                    MensajeUsuario.editarMensaje();
                    break;
                case 4:
                    MensajeUsuario.borrarMensaje();
                    break;
                default:
                    System.out.println("Opcion no reconocida: " + opcion);
            }
        }while(opcion != 5);
    }
}
