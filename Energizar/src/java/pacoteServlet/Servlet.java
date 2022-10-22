/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pacoteServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fabio
 */
@WebServlet(name = "Servlet", urlPatterns = {"/seuConsumo,"
                                           + " /inicio"
                                            
                                            })
public class Servlet extends HttpServlet {

  


    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String action = request.getServletPath();
            System.out.println(action);
                /*if(action.equals("/seuConsumo")){
                    
                    calcular(request, response);
                    
                }*/
                /*if(action.equals("/inicio")){
                    
                    inicio(request, response);
                    
                }*/


    }
        //chamar a pagina calcularConsulmo.
     protected void calcular(HttpServletRequest request, HttpServletResponse response) throws IOException{
            response.sendRedirect("calcularConsumo.jsp");
    }
    
    /*protected void inicio(HttpServletRequest request, HttpServletResponse response) throws IOException{
            response.sendRedirect("index.html");
    }*/ 
     
}
   


