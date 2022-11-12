<%-- 
    Document   : produtos
    Created on : 12 de nov. de 2022, 17:17:11
    Author     : MRFSolar
--%>

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
                    <a href="index.html">Home</a>
                </li>

                <li>
                    <a href="index.html#orcamento">Faça seu Orçamento</a>
                </li> 
            </ul>
        </div>
        
        <div class="container mt-3 secaoform col-5 col-md-4">
            <h1>Pagina REDIMENCIONADA</h1>
            
            <h3 class="calculocss">CADASTRO</h3>
                        
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
        
        <div class="container" id="tabela" style="margin-top: 60px;">
            <h2>PRODUTOS CADASTRADOS</h2>
            <br>
            <table class="table">
              <thead class="thead-dark">
                <tr>
                  <th>Nome do Produto</th>
                  <th>Capacidade KW/h</th>
                  <th>Quantidade</th>
                  <th>Tamanho</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>Placa solar</td>
                  <td>74.5</td>
                  <td>20</td>
                  <td>1,50</td>
                </tr>
                <tr>
                  <td>Placa solar</td>
                  <td>70.5</td>
                  <td>50</td>
                  <td>1,50</td>
                </tr>
                <tr>
                  <td>Placa solar</td>
                  <td>90</td>
                  <td>10</td>
                  <td>2.00</td>
                </tr>
              </tbody>
            </table>
            
          </div>
        
        <footer>
            <p> Equipe MRF solar<br>
            <a href="#">mrfsolar@email.com</a></p>
        </footer> 
        
    </body>
</html>
