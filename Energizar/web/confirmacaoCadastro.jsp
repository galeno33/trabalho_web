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
    
    <body>
        <%   
            
            try{
                //instancia de objeto da calsse CadastroUsuario
                CadastroUsuario objCadastroUsuario = new CadastroUsuario();
                //setando informações do documento html cadastrar
                objCadastroUsuario.setNome_usuario(request.getParameter("nomeUsuario"));
                objCadastroUsuario.setFone_usuario(request.getIntHeader("foneUsuario"));//pesquisar se o get é esse mesmo
                objCadastroUsuario.setEmail_usuario(request.getParameter("emailUsuario"));
                objCadastroUsuario.setSenha_usuario(request.getIntHeader("senhaUsuario"));
                objCadastroUsuario.setSenha_confirme(request.getIntHeader("senhaConfirme"));

                //condicional de confirmação se a senha digitada é igual a senha de confirmação
                //if(objCadastroUsuario.setSenha_usuario(int senha_usuario) == objCadastroUsuario.setSenha_confirme(int senha_confirme)){

                        //instacia do objeto da classe insertDAO 
                        InsertDAO objetoInserido = new InsertDAO();
                        objetoInserido.insertUsuario(objCadastroUsuario);
                        
                        //--------------------- A IMPLEMENTAR --------------------//
                        //confirmação do cadastramento com sucesso
                        
                        
                //}
                
             
            }catch (Exception e){
                //notificação de exeção 
                
            }
        %>
        
    </body>
</html>
