import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloForm extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        String title = "Using GET Method to Read Form Data";
        out.println("<html>" +
                        "<head><title>" +
                            title +
                        "</title></head>" +
                        "<body>" +
                            request.getParameter("name")+
                        "</body>" +
                    "</html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        Cookie cookie = new Cookie("name",name);
        cookie.setMaxAge(600); //this is in seconds
        response.addCookie(cookie);
        PrintWriter out = response.getWriter();
            out.println("<a href ='Home'>Home</a>");
    }
}
