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

//import java.util.List;
import javax.swing.JOptionPane;
import packageCRUD.CadastroProdutos;


public class SelectDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet res; 
   
    public ArrayList<CadastroProdutos>BuscarProduto() throws SQLException{
      ArrayList<CadastroProdutos> lista = new ArrayList<>();  
        
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
           
           //conn.close();
           
           
       } catch (SQLException erro){
           JOptionPane.showMessageDialog(null, "SelectDAO select: " + erro);
       }
   
       return lista;
    }
    
    
    
}
