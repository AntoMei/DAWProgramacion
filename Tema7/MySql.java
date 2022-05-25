import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySql{
    public static void main(String[] args) {
        try
        {
<<<<<<< HEAD
            Class.forName("com.mysql.jc.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/clientes","phpmyadmin2","phpmyadmin");
=======
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://192.168.204.168:3306/clientes","phpmyadmin2","phpmyadmin2");
>>>>>>> fcf82d456f0fd215c6c8761c01afecd2bd97fa06
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("SELECT count(*) from clientes");
            System.out.println("Connected");  
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }  
}