import com.jc.model.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author abigail
 */
public class TestProcedimiento {
     public static void main(String args[])throws Exception{
        Conexion c=new Conexion();
        Connection con=c.conectarse();
        CallableStatement callate=con.prepareCall("{call autenticar(?,?,?)}");
        callate.registerOutParameter(1,java.sql.Types.INTEGER);
        callate.setString(2,"Abigail");
        callate.setString(3,"Abigail");
      
        callate.execute();
        int pk=callate.getInt(1);
        System.out.println("El id insertado es:"+pk);
    }
    
}
    
