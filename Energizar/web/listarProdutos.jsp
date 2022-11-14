<%-- 
    Document   : listarProdutos
    Created on : 13 de nov. de 2022, 20:23:46
    Author     : Fabio
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="packageCRUD.CadastroProdutos"%>
<%@page import="packageDAO.SelectDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
         <div class="container" id="tabela" style="margin-top: 60px;">
            <h2>PRODUTOS CADASTRADOS</h2>
            <br>
            
          
            
            <table class="table">
              <thead class="thead-dark">
                <tr>
                  <th>Id</th>
                  <th>Nome do Produto</th>
                  <th>Modelo</th>
                  <th>Tecnologia</th>
                  <th>Potência</th>                 
                  <th>Quantidade</th>
                  <th>Largura</th>
                  <th>Altura</th>
                  <th>Peso</th>
                </tr>
              </thead>
              
              <tbody>
                 <%
                    SelectDAO select = new SelectDAO();
                    ArrayList<CadastroProdutos> lista = select.BuscarProduto();
                    
                    Iterator<CadastroProdutos> iterat = lista.iterator();
                    
                    //for(CadastroProdutos p: lista){
                    while(iterat.hasNext()){
                     CadastroProdutos  p=iterat.next();
                %>
                 
                        <tr>
                            <td><%=p.getId_produto()%></td>
                            <td><%=p.getNome_produto()%></td>
                            <td><%=p.getModelo_produto()%></td>
                            <td><%=p.getTecnologia_produto()%></td>
                            <td><%=p.getPotência_produto()%></td>
                            <td><%=p.getQuantidade_produto()%></td>
                            <td><%=p.getLargura_placa()%></td>
                            <td><%=p.getAltura_placa()%></td>
                            <td><%=p.getPeso_placa()%></td>

                        </tr>
                  
                        
                <% 
                    }
                %>
                        
              </tbody>
            </table>
            
          </div>
    </body>
</html>
