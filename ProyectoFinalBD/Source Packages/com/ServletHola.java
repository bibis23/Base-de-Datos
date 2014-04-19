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
public class ServletHola extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("Application/msexcel");
        PrintWriter out = response.getWriter();
        out.println("Tu IP de acceso es:"+request.getRemoteAddr());
        
        
        
    }
}
