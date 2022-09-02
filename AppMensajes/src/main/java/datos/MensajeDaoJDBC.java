package datos;

import static datos.Conexion.*;
import domain.MensajeDTO;
import java.sql.*;
import java.util.*;

public class MensajeDaoJDBC implements IMensajes{
    
    private Connection conexionTransaccional;

    private static final String SQL_SELECT = "SELECT id_mensajes, mensajes, autor_mensaje, fecha_mensaje FROM appmensajes.mensajes";
    private static final String SQL_INSERT = "INSERT INTO appmensajes.mensajes(mensajes, autor_mensaje) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE appmensajes.mensajes set mensajes = ?, autor_mensaje = ?, fecha_mensaje = ? WHERE id_mensajes = ?";
    private static final String SQL_DELETE = "DELETE FROM appmensajes.mensajes WHERE id_mensajes = ?";
    
    public MensajeDaoJDBC(){
        
    }
    
    public MensajeDaoJDBC(Connection conexionTransaccional){
        this.conexionTransaccional = conexionTransaccional;
    }
    
    
    
    public List<MensajeDTO> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        MensajeDTO mensajo = null;
        List<MensajeDTO> mensajes = new ArrayList<>();

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int idMensaje = rs.getInt("id_mensajes");
                String mensaje = rs.getString("mensajes");
                String autorMensaje = rs.getString("autor_mensaje");
                String fechaMensaje = rs.getString("fecha_mensaje");
                
                mensajo = new MensajeDTO(idMensaje, mensaje, autorMensaje, fechaMensaje);
                
                mensajes.add(mensajo);
            }
        } 
        finally{
            close(rs);
            close(stmt);
            if(this.conexionTransaccional == null){
               close(conn);
            } 
        }
        System.out.println(SQL_SELECT);
        return mensajes; 
    }
    
    public int insert(MensajeDTO mensaje) throws SQLException{
        Connection conn = null; 
        PreparedStatement stmt = null; 
        int registros = 0;
        
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, mensaje.getMensaje());
            stmt.setString(2, mensaje.getAutorMensaje());
            registros = stmt.executeUpdate();
        } 
        finally{
            close(stmt);
            if(this.conexionTransaccional == null){
               close(conn);
            } 
        }
        System.out.println(SQL_INSERT);
        return registros;
    }
    
    public int update(MensajeDTO mensaje) throws SQLException{
        Connection conn = null; 
        PreparedStatement stmt = null; 
        int registros = 0;
        
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, mensaje.getMensaje());
            stmt.setString(2, mensaje.getAutorMensaje());
            stmt.setString(3, mensaje.getFechaMensaje());
            stmt.setInt(4, mensaje.getIdMensaje());
            registros = stmt.executeUpdate();
        } 
        finally{
            close(stmt);
            if(this.conexionTransaccional == null){
               close(conn);
            } 
        }
        System.out.println(SQL_UPDATE);
        return registros;
    }
    
    public int delete(MensajeDTO mensaje) throws SQLException{
        Connection conn = null; 
        PreparedStatement stmt = null; 
        int registros = 0;
        
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, mensaje.getIdMensaje());
            registros = stmt.executeUpdate();
        } 
        finally{
            close(stmt);
            if(this.conexionTransaccional == null){
               close(conn);
            } 
        }
        System.out.println(SQL_DELETE);
        return registros;
    }
}