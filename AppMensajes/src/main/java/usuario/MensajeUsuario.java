package usuario;

import datos.MensajeDaoJDBC;
import domain.MensajeDTO;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class MensajeUsuario {
    
    
    public static void crearMensaje() throws SQLException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el mensaje");
        String mensaje = sc.nextLine();
        
        System.out.println("Escribe tu nombre");
        String nombre = sc.nextLine();
        
        MensajeDTO registro = new MensajeDTO();
        registro.setMensaje(mensaje);
        registro.setAutorMensaje(nombre);
        MensajeDaoJDBC mensajeDao = new MensajeDaoJDBC();
        mensajeDao.insert(registro);
    }
    
    public static void listarMensaje() throws SQLException{
        MensajeDaoJDBC mensajeDao = new MensajeDaoJDBC();
        List<MensajeDTO> mensajes = mensajeDao.select();
        for(MensajeDTO mensaje: mensajes){
            System.out.println(mensaje);
        }
    }
    
    public static void borrarMensaje() throws SQLException{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe el IdMensaje a eliminar");
        int idMensaje = sc.nextInt();
        
        MensajeDTO registro = new MensajeDTO();
        registro.setIdMensaje(idMensaje);
        
        MensajeDaoJDBC mensajeDao = new MensajeDaoJDBC();
        mensajeDao.delete(registro);
    }
    
    public static void editarMensaje() throws SQLException{
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe el mensaje");
        String mensaje = sc.nextLine();
        
        System.out.println("Escribre tu nombre");
        String nombre = sc.nextLine();
        
        System.out.println("Escoge el IdMensaje a editar");
        int idMensaje = sc.nextInt();
        
        MensajeDTO registro  = new MensajeDTO();
        registro.setMensaje(mensaje);
        registro.setAutorMensaje(nombre);
        registro.setIdMensaje(idMensaje);
        
        MensajeDaoJDBC mensajeDao = new MensajeDaoJDBC();
        mensajeDao.update(registro);
        
    }
}
