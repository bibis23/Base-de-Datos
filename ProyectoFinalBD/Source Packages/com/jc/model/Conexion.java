
import java.sql.*;
/**
 *
 * @author abigail
 */
public class Conexion {
     public Connection conectarse()throws Exception{
        String url="jdbc:oracle:thin:@localhost:1521:XE";
       Class.forName("oracle.jdbc.OracleDriver");
       Connection con=DriverManager.getConnection(url,"Abigail","Abigail");
       return con;
    }
    
}
   