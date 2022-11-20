<%-- 
    Document   : produtos
    Created on : 12 de nov. de 2022, 17:17:11
    Author     : MRFSolar
--%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="packageCRUD.CadastroProdutos"%>
<%@page import="packageDAO.SelectDAO"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <title>Produtos</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
                    <a href="Orcamentos.jsp">Orçamento</a>
                </li>
                <li>
                    <a href="listarProdutos.jsp">Produtos Cadastrados</a>
                </li>
            </ul>
        </div>
        
        <div class="container mt-3 secaoform col-5 col-md-4">
            
            <h3 id="cadastrarProdutos" class="calculocss">CADASTRO</h3>
                        
            <form action="ControlerProduto" method="post">
                    <div class="mb-3">
                        <label class="form-label">Nome do Produto</label>
                        <input type="text" class="form-control" name="nomeProduto" id="nomeProduto">
                              
                    </div>
                    
                    <div class="mb-3">
                        <label class="form-label">Modelo</label>
                        <input type="text" class="form-control" name="modeloProduto" id="modelo">
                              
                    </div>
                    
                    <div>
                        <label class="form-label">Tecnologia</label>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="RadioDefaulttec" id="tecnologia1">
                            <label class="form-check-label" for="tecnologia1">
                              Policristalino
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="RadioDefaulttec" id="tecnologia2" checked>
                            <label class="form-check-label" for="tecnologia2">
                              Monocristalino
                            </label>
                        </div>
                    </div>
                    <br>
                    <div class="mb-3 col-md-4">
                        <label class="form-label">Potência Fotovoltaica </label>
                        <input type="number" class="form-control" placeholder="Ex: 235Watts" name="potenciaPlaca" id="potencia">Watts
                              
                    </div>
                    <div class="mb-3 col-md-4" >
                        <label class="form-label">Quantidade</label>
                        <input type="number" class="form-control" name="qtdProduto" id="qtdade">
                              
                    </div>
                    
                   <div class="mb-3 col-md-4">
                        <label class="form-label">Largura</label>
                        <input type="number" class="form-control" name="larguraPlaca" id="largura">m
                              
                    </div>
                    
                    <div class="mb-3 col-md-4">
                        <label class="form-label">Altura</label>
                        <input type="number" class="form-control" name="alturaPlaca" id="altura">m
                              
                    </div>
                    
                    <div class="mb-3 col-md-4">
                        <label class="form-label">Peso</label>
                        <input type="number" class="form-control" name="pesoPlaca" id="peso">Kg
                              
                    </div>
                                             
                    <button type="submit" class="btn btn-primary">Cadastrar</button>
                        
            </form>
                                   
        </div>
        
       <!--<div class="container" id="tabela" style="margin-top: 60px;">
           <h2 id="cadastrados">PRODUTOS CADASTRADOS</h2>
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
              
              <tbody>------->
                 <%
                  /*  SelectDAO select = new SelectDAO();
                    ArrayList<CadastroProdutos> lista = select.BuscarProduto();
                    
                    Iterator<CadastroProdutos> iterat = lista.iterator();
                    
                    //for(CadastroProdutos p: lista){
                    while(iterat.hasNext()){
                     CadastroProdutos  p = iterat.next();*/
                %>
                 
                      <!--  <tr>
                            <td><%//=p.getId_produto()%></td>
                            <td><%//=p.getNome_produto()%></td>
                            <td><%//=p.getModelo_produto()%></td>
                            <td><%//=p.getTecnologia_produto()%></td>
                            <td><%//=p.getPotência_produto()%></td>
                            <td><%//=p.getQuantidade_produto()%></td>
                            <td><%//=p.getLargura_placa()%></td>
                            <td><%//=p.getAltura_placa()%></td>
                            <td><%//=p.getPeso_placa()%></td>

                        </tr>-------->
                  
                        
                <% 
                  //  }
                %>
                        
           <!----   </tbody>
            </table>
            
          </div>----------->
        
        <footer>
            <p> Equipe MRF solar<br>
            <a href="#">mrfsolar@email.com</a></p>
        </footer> 
        
    </body>
</html>
