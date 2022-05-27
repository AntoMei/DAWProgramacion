import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySql{
    public static void main(String[] args) {
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://192.168.204.168:3306/clientes","phpmyadmin2","phpmyadmin2");
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
