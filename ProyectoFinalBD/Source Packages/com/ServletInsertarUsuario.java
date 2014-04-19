import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author abigail
 */
public class ServletInsertarUsuario extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String mensaje="no insertado";
        //Pedimos los valores
        
    int id=   Integer.parseInt(request.getParameter("id"));
    String nombre=    request.getParameter("nombre");
    float sueldo=    Float.parseFloat(request.getParameter("sueldo"));
    
    
    Usuario u=new Usuario();
    u.setId(id);
    u.setNombre(nombre);
    u.setSueldo(sueldo);
   
    DAOUsuario dao=new DAOUsuario();
        try {
            dao.insertar(u);
            mensaje="Tu usuario se guardo con exito :)";
        } catch (Exception ex) {
   mensaje=ex.getMessage();
        }
              out.println(mensaje);    
    }
}
