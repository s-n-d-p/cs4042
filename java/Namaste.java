import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Namaste extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html"); //setting the response type as html
        PrintWriter out = response.getWriter();
        out.println("Namaste Servlet!");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html"); //setting the response type as html
        PrintWriter out = response.getWriter();
        out.println(request.getParameter("name"));
    }
}
