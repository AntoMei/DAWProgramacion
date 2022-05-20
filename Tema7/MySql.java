import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class MySql{
    public static void main(String[] args) {
        try
        {
            Class.forName("dev.mysql.com/downloads/connector/j/");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/clientes","phpmyadmin2","phpmyadmin");
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("show databases;");
            System.out.println("Connected");  
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }  
}
