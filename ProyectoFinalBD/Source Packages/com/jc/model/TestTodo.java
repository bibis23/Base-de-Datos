import com.jc.model.DAOUsuario;
import com.jc.model.Usuario;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abigail
 */
public class TestTodo {
    
public static void main(String...x)throws Exception{
        System.out.println("probando usuario");
        
        for(Usuario u:DAOUsuario.buscarTodos()){
            System.out.println(u.getLogin());
        }
}
        
}