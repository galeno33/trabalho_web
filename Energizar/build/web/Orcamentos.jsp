<%-- 
    Document   : Orcamentos
    Created on : 20 de nov. de 2022, 16:12:22
    Author     : MRFSolar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/style.css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        
        <div id="navigation-container">
            <ul>
                <li>
                    <a href="funcionario.html">Home</a>
                </li>
                <li>
                    <a href="produtos.jsp">Cadastrar produtos</a>
                </li>
                <li>
                    <a href="listarProdutos.jsp">Produtos Cadastrados</a>
                </li>
                
            </ul>
        </div>
        
         <div class="container" id="tabela" style="margin-top: 60px;">
            <h2>ORÇAMENTOS</h2>
            <br>
            
          
            
            <table class="table">
              <thead class="thead-dark">
                <tr>
                  <th>Id</th>
                  <th>Nome do Cliente</th>
                  <th>Email</th>
                  <th>Telefone</th>
                  <th>Consumo</th>                 
                  <th>Equipamento adicionados</th>
                  
                </tr>
              </thead>
              
              <tbody>
                  <!<!-- Adicionar os codigos para buscar do SelectOrcamentoDAO os dados do banco de dados -->
                 <%
                    /*SelectDAO select = new SelectDAO();
                    ArrayList<CadastroProdutos> lista = select.BuscarProduto();
                    
                    Iterator<CadastroProdutos> iterat = lista.iterator();
                    
                    //for(CadastroProdutos p: lista){
                    while(iterat.hasNext()){
                     CadastroProdutos  p=iterat.next();*/
                %>
                 
                        <tr>
                            <td><%//=p.getId_produto()%></td>
                            <td><%//=p.getNome_produto()%></td>
                            <td><%//=p.getModelo_produto()%></td>
                            <td><%//=p.getTecnologia_produto()%></td>
                            <td><%//=p.getPotência_produto()%></td>
                            <td><%//=p.getQuantidade_produto()%></td>
                            
                        </tr>
                  
                        
                <% 
                  //  }
                %>
                        
              </tbody>
            </table>
            
          </div>
        
        
    </body>
</html>
