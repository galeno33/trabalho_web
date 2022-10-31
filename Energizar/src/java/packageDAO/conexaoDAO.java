
package packageDAO;

import java.sql.Connection;

/**
 *
 * @author galeno
 */
public class conexaoDAO {
    
    public Connection conexaoBD(){
        
        
        try{
            String url = "jdbc:mysql://localhost:3306/mrfsolarBD?user=root&password=";
        } catch(Exception e){
                        
        }
        return null;
        
    }
}
