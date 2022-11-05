
package packageDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author galeno
 */
public class conexaoDAO {
    
    public static Connection conexaoBD() throws SQLException{
        
        Connection conn = null;
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conectado");
            //linkar a url do servidor do banco de dados
            String url = "jdbc:mysql://localhost:3306/mrfsolarbd?user=root&password=";
            conn = DriverManager.getConnection(url);
            
        } catch(SQLException e){
            throw new SQLException(e);    
                   
        }catch(ClassNotFoundException el){
            throw new SQLException(el);
        }
        return conn;
        
    }
}
