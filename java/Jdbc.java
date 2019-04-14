import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

class Jdbc extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        try{
            String dbDriver = "com.mysql.cj.jdbc.Driver";
            String dbURL = "jdbc:mysql://localhost:3306/";
            String dbName = "ExamPortal";
            String dbUsername = "sandeep";
            String dbPassword = "root";

            Class.forName(dbDriver);
            Connection connection = DriverManager.getConnection(dbURL + dbName, dbUsername, dbPassword);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Student");
            while(resultSet.next()){
                out.println(resultSet.getString(1));
            }
            statement.close();
            connection.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
