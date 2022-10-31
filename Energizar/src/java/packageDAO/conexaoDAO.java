
package packageDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author galeno
 */
public class conexaoDAO {
    
    public Connection conexaoBD() throws ClassNotFoundException{
        
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mrfsolarBD?user=root&password=";
            conn = DriverManager.getConnection(url);
        } catch(ClassNotFoundException | SQLException e){
                        
        }
        return conn;
        
    }
}
