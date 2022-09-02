package datos;

import domain.MensajeDTO;
import java.sql.SQLException;
import java.util.List;

public interface IMensajes {
    public List<MensajeDTO> select() throws SQLException;
    
    public int insert(MensajeDTO mensaje) throws SQLException;
    
    public int update(MensajeDTO mensaje) throws SQLException;
    
    public int delete(MensajeDTO mensaje) throws SQLException;
    
}
