
package packageDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import packageCRUD.CadastroProdutos;
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
    
    public void insertProduto(CadastroProdutos objProduto) throws ClassNotFoundException, SQLException{
        String sql = "insert into produtos" 
                + "(nome_produtos, modelo_produtos, tecnologia_produtos, potencia_produtos, qrd_produtos, largura_produto, altura_produto, peso_produto)"
                + "value (?, ?, ?, ?, ?, ?, ?, ?)";
        conn = new conexaoDAO().conexaoBD();
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objProduto.getNome_produto());
            pstm.setString(2, objProduto.getModelo_produto());
            pstm.setString(3, objProduto.getTecnologia_produto());
            pstm.setInt(4, objProduto.getPotência_produto());
            pstm.setInt(5, objProduto.getQuantidade_produto());
            pstm.setInt(6, objProduto.getLargura_placa());
            pstm.setInt(7, objProduto.getAltura_placa());
            pstm.setInt(8, objProduto.getPeso_placa());
            
            pstm.execute();
            pstm.close();
        }catch(Exception e){
            
        }
    }
}
