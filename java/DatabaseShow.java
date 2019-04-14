import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;

public class DatabaseShow extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("Inside GET");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ExamPortal","sandeep","root");
            out.println("Success");
        } catch(Exception e){
            e.printStackTrace();
        }
        out.println("<br>Exiting</body></html>");
    }
}
