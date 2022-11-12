/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import packageCRUD.CadastroProdutos;


public class SelectDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet res; 
    ArrayList<CadastroProdutos> lista = new ArrayList<>();
    
    
    public ArrayList<CadastroProdutos>BuscarProduto() throws SQLException{
        String sqlSelect = "select nome_produtos,"
                           + " modelo_produtos,"
                           + " tecnologia_produtos,"
                           + "potencia_produtos,"
                           + "qrd_produtos,"
                           + "largura_produto,"
                           + "altura_produto," 
                           + "peso_produto"
                           + "from produtos";
        
        conn = new conexaoDAO().conexaoBD();
        
       try{
           
           pstm = conn.prepareStatement(sqlSelect);
           res = pstm.executeQuery();
           
           //res.next() é um laço enquanto tiver linha repete a linha
           while(res.next()){
               
               CadastroProdutos objProduto = new CadastroProdutos();
               //setar o nome do produto e atribuir o dados vindo do banco de dados
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
           
           //conn.close();
           
           
       } catch (SQLException erro){
           JOptionPane.showMessageDialog(null, "SelectDAO select: " + erro);
       }
       
       return lista;
    }
    
    
    
}
