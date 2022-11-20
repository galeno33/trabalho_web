/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import packageCRUD.CadastroUsuario;


public class SelectUsuarioDAO {
    
        Connection conn;
        PreparedStatement pstm;
        ResultSet res; 
        int retorn = 0;
        //conexaoDAO conn = new conexaoDAO();
        //CadastroUsuario usu = new CadastroUsuario();
    
        public int BuscaUsuario(CadastroUsuario objetoUsuario) throws SQLException{
        
        //comando sql select na tabela usuario do banco de dados
        //String status;
        //String status = objetoUsuario.getStatus();
        String sqlUsuario = "select * from usuario where email_usuario=? and senha_usuario=?";
              
        try{           
            conn = conexaoDAO.conexaoBD();
            pstm = conn.prepareStatement(sqlUsuario);
            
            pstm.setString(1, objetoUsuario.getEmail_usuario());
            pstm.setInt(2, objetoUsuario.getSenha_usuario());
            //pstm.setString(3, objetoUsuario.getStatus());
            //pstm.setString(1, usu.getEmail_usuario());
            //pstm.setInt(2, usu.getSenha_usuario());
            //pstm.setString(3, status);
            
            res = pstm.executeQuery();
                          
            while(res.next()){
                
                retorn=retorn+1;
                //objetoUsuario.setId(res.getInt("id_usuario"));
                //objetoUsuario.setNome_usuario(res.getString("nome_usuario"));
                //objetoUsuario.setFone_usuario(res.getInt("fone_usuario"));
                objetoUsuario.setEmail_usuario(res.getString("email_usuario"));
                objetoUsuario.setSenha_usuario(res.getInt("senha_usuario"));
                //objetoUsuario.setStatus(res.getString("status_usuario"));
                //usu.setEmail_usuario(res.getString("email_usuario"));
                //usu.setSenha_usuario(res.getInt("senha_usuario"));                
                //usu.setStatus(res.getString("estatus_usuario"));
               
                
            }
            //if("fucnionario".equals(objetoUsuario.getStatus())){ 
                    //retorn = 1; 
                if(retorn == 1){
                    return 1;                    
                }else{
                    return 0;
                }
            
            /*}else{
                retorn = 0;
            }*/
            
           
           
        }catch(SQLException e){
            return 0;
        }
            
        //return retorn;
    }
}
