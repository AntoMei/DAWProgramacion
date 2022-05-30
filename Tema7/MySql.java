import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySql{
    public static void main(String[] args) {
       
       String consulta = "SELECT count(*) as total FROM Cliente";
       String connectioURL = "jdbc:mysql://10.0.2.4:3306/clientes";

       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
       } catch (ClassNotFoundException e) {
           //TODO: handle exception
           e.printStackTrace();
       }

       try (Connection conn =DriverManager.getConnection(connectioURL,"phpmyadmin2","phpmyadmin2");
            PreparedStatement ps = conn.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery()){

                while (rs.next()) {
                    int total = rs.getInt("total");
                    System.out.println("Total: " + total);
                }
    
       } catch (SQLException e) {
           //TODO: handle exception
           e.printStackTrace();
       }
    }
}
       
        /*try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://10.0.2.4:3306/clientes","phpmyadmin2","phpmyadmin2");
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("SELECT count(*) from Cliente");
            System.out.println("Connected");  
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }  */
