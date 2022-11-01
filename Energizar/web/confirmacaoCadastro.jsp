<%-- 
    Document   : confirmacaoCadastro
    Created on : 1 de nov. de 2022, 17:35:05
    Author     : Equipe Marcos,Rafael, Fabio
--%>

<%@page import="packageDAO.InsertDAO"%>
<%@page import="packageCRUD.CadastroUsuario"%>
<%@page contentType="tex" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        
        <%   
            
            try{
                //instancia de objeto da calsse CadastroUsuario
                CadastroUsuario objetoCadastrando = new CadastroUsuario();
                //setando informações do documento html cadastrar
                objetoCadastrando.setNome_usuario(request.getParameter("nomeUsuario"));
                objetoCadastrando.setFone_usuario(request.getIntHeader("foneUsuario"));//pesquisar se o get é esse mesmo
                objetoCadastrando.setEmail_usuario(request.getParameter("emailUsuario"));
                objetoCadastrando.setSenha_usuario(request.getIntHeader("senhaUsuario"));
                objetoCadastrando.setSenha_confirme(request.getIntHeader("senhaConfirme"));

                //condicional de confirmação se a senha digitada é igual a senha de confirmação
                if(objetoCadastrando.getSenha_confirme() == objetoCadastrando.getSenha_confirme()){

                        //instacia do objeto da classe insertDAO 
                        InsertDAO objetoInserido = new InsertDAO();
                        objetoInserido.insertUsuario(objetoCadastrando);
                        
                        //--------------------- A IMPLEMENTAR --------------------//
                        //confirmação do cadastramento com sucesso
                        
                        
                }
                
             
            }catch (Exception e){
                //notificação de exeção 
                
            }
        %>
        
    </body>
</html>
