
package packageDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import packageCRUD.CadastroProdutos;
import packageCRUD.CadastroUsuario;

public class InsertDAO {

    Connection conn;
    PreparedStatement pstm;
    
   
    
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
