
package packageDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//import java.util.List;
import javax.swing.JOptionPane;
import packageCRUD.CadastroProdutos;
import packageCRUD.CadastroUsuario;


public class SelectDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet res; 
    //int retorn = 0;
    //CadastroUsuario usu = new CadastroUsuario();
   
    public ArrayList<CadastroProdutos>BuscarProduto() throws SQLException{
      ArrayList<CadastroProdutos> lista = new ArrayList<>();  
        //variavel de busca no banco de dados
        String sqlSelect = "select * from produtos";
    
       try{
           
           conn = new conexaoDAO().conexaoBD();
           pstm = conn.prepareStatement(sqlSelect);
           res = pstm.executeQuery();
           
           //res.next() é um laço enquanto tiver linha repete a linha
           while(res.next()){
               
               //instacia da classe CadastroProdutos
               CadastroProdutos objProduto = new CadastroProdutos();
               
               //setar o nome do produto e atribuir o dados vindo do banco de dados
               objProduto.setId_produto(res.getInt("id"));
               objProduto.setNome_produto(res.getString("nome_produtos"));
               objProduto.setModelo_produto(res.getString("modelo_produtos"));
               objProduto.setTecnologia_produto(res.getString("tecnologia_produtos"));
               objProduto.setPotência_produto(res.getInt("potencia_produtos"));
               objProduto.setQuantidade_produto(res.getInt("qrd_produtos"));
               objProduto.setLargura_placa(res.getInt("largura_produto"));
               objProduto.setAltura_placa(res.getInt("altura_produto"));
               objProduto.setPeso_placa(res.getInt("peso_produto"));
               
               lista.add(objProduto);  
           }
    
       } catch (SQLException erro){
           JOptionPane.showMessageDialog(null, "SelectDAO select: " + erro);
       }
   
       return lista;
    }
    
   
}
