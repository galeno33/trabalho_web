    <%-- 
    Document   : calcularConsumo
    Created on : 6 de out. de 2022, 00:16:11
    Author     : Fabio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style.css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet"><!--ferramenta usada do bootstrap -->
    </head>
    <body>
        
        <a href="inicio"></a>
        <ul>
            <li>
                <a href="#top">Home</a>
            </li>
            <li>
                <a href="#quemsomos">Quem somos</a>
            </li>
            <li>
                <a href="#oquefazemos">O que fazemos</a>
            </li>
            <li>
                <a href="#orcamento">Orçamento</a>
            </li>
            
        </ul>
        
       
        
        <div class="row">
            <div id="orcamento">
                <h3 class="section-title" id="orcameno">Orçamento</h3>
                
                    <div class="container mt-3 secaoform">
                        <h3 class="calculocss">Seu orçamento</h3>
                        <section>
                            
                                <form action="#">
                                    <div class="mb-3 col-md-2">
                                      <label for="seuConsumo" class="form-grup">Seu consumo</label>
                                      <input type="number" class="form-control" id="seuConsumo" placeholder="Digite seu Kwh" name="seuConsum">
                                    </div>
                                    
                                    <label for="#" class="form-grup">Deseja adicionar aparelhos futuramente?</label>
                                   <!--<div class="form-check">-->
                                    <input type="radio" class="form-check-input" id="radio1" name="optradio" value="option1" checked>Sim
                                    <label class="form-check-label" for="radio1"></label>
                                  <!--</div>-->
                                  <!--<div class="form-check">-->
                                    <input type="radio" class="form-check-input" id="radio2" name="optradio" value="option2">Não
                                    <label class="form-check-label" for="radio2"></label>
                                  <!--</div>-->
                                    
                                  <br>
                                    <!--<div class="mb-3 col-md-3">
                                      <label for="fone" class="form-grup">Telefone:</label>
                                      <input type="tel" class="form-control" id="phone" name="fone" placeholder="910101010" size="9" required>
                                    </div>
                                    <div class="mb-3 col-md-6">
                                      <label for="email" class="form-grup">E-mail:</label>
                                      <input type="email" class="form-control" id="phone" name="email" placeholder="fulanodetal@fulandodetal.com" required>
                                    </div>-->

                                        <button type="submit" class="btn btn-primary">Calcular</button>
                                        <a href="seuConsumo" type="button" class="btn btn-primary">Calculando</a>
                                </form>
                            
                        </section>
                      </div>

            </div>
            
        </div>
        
    </body>
</html>
