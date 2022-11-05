
package packageDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import packageCRUD.CadastroUsuario;

public class InsertDAO {

    Connection conn;
    PreparedStatement pstm;
    
    //metodo para inserir no banco de dados os parametros do cadastro de usuarios
    public void insertUsuario(CadastroUsuario objCadastroUsuario) throws ClassNotFoundException, SQLException{
        //a String sql chama o comando sql de inntroduzir no banco de dados as informmações entre parentese
        String sql = "insert into usuario" + "(nome_usuario, fone_usuario, email_usuario, senha_usuario)" + "value (?, ?, ?, ?)";
        conn = new conexaoDAO().conexaoBD();
        
       try {
           
           //PreparedStatement pstm = conn.prepareStatement(sql);
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
