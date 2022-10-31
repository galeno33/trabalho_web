
package packageDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import packageCRUD.CadastroUsuario;

public class InsertDAO {

    Connection conn;
    PreparedStatement pstm;
    
    public void insertUsuario(CadastroUsuario objCadastroUsuario) throws ClassNotFoundException{
        
        String sql = "insert into usuario (nome_usuario, fone_usuario, email_usuario, senha_usuario) value (?, ?, ?, ?)";
        conn = new conexaoDAO().conexaoBD();
        
       try {
           
           pstm = conn.prepareStatement(sql);
           pstm.setString(1, objCadastroUsuario.getNome_usuario());
           pstm.setInt(2, objCadastroUsuario.getFone_usuario());
           pstm.setString(3, objCadastroUsuario.getEmail_usuario());
           pstm.setInt(4, objCadastroUsuario.getSenha_usuario());
           
           
           pstm.execute();
           pstm.close();
           
       }catch (Exception e){
           
       }
        
    }
    
}
