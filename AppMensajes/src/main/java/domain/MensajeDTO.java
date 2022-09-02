package domain;

import java.sql.Date;

public class MensajeDTO {
    private int IdMensaje;
    private String mensaje;
    private String autorMensaje;
    private String fechaMensaje;
    
    public MensajeDTO(){
        
    }
    
    public MensajeDTO(int IdMensaje){
        this.IdMensaje = IdMensaje;
    }
    
    public MensajeDTO(String mensaje, String autorMensaje, String fechaMensaje){
        this.mensaje = mensaje;
        this.autorMensaje = autorMensaje;
        this.fechaMensaje = fechaMensaje;
    }

    public MensajeDTO(int IdMensaje, String mensaje, String autorMensaje, String fechaMensaje) {
        this.IdMensaje = IdMensaje;
        this.mensaje = mensaje;
        this.autorMensaje = autorMensaje;
        this.fechaMensaje = fechaMensaje;
    }
    
    

    public int getIdMensaje() {
        return IdMensaje;
    }

    public void setIdMensaje(int IdMensaje) {
        this.IdMensaje = IdMensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutorMensaje() {
        return autorMensaje;
    }

    public void setAutorMensaje(String autorMensaje) {
        this.autorMensaje = autorMensaje;
    }

    public String getFechaMensaje() {
        return fechaMensaje;
    }

    public void setFechaMensaje(String fechaMensaje) {
        this.fechaMensaje = fechaMensaje;
    }

    @Override
    public String toString() {
        return "Mensajes Guardados{" + "IdMensaje=" + IdMensaje + ", mensaje=" + mensaje + ", autorMensaje=" + autorMensaje + ", fechaMensaje=" + fechaMensaje + '}';
    }
    
    
    
}
