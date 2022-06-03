import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * MysqlUpdate
 */
public class MysqlUpdate {
   
    public static void update() throws ClassNotFoundException {
        String sqlUpdate = "Update Cliente" + "SET apellidos = ?" + "WHERE id = ?";

        String connectioURL = "jdbc:mysql://10.0.2.4:3306/clientes";
 
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
       
        Connection conn =DriverManager.getConnection(connectioURL,"phpmyadmin2","phpmyadmin2");
            PreparedStatement ps = conn.prepareStatement(sqlUpdate);
            Scanner lector = new Scanner(System.in);
            System.out.println("Introduzca el apellido");
            String apellidos = lector.nextLine();

            int id = 10;
            ps.setString(1, apellidos);
            ps.setInt(2, id);

            int filaAfectada = ps.executeUpdate();
            System.out.println(String.format("Fila afectada %d", filaAfectada));

        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }

     public static void main(String[] args) throws ClassNotFoundException {
        update();
    }
}