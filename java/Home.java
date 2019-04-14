import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Home extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Cookie[] cookie = request.getCookies();
        for (Cookie ck : cookie) {
            if(ck.getName().equals("name")){
                out.println(ck.getValue());
            }
        }
    }
}
