/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pacoteServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import packageCRUD.CadastroUsuario;
import packageDAO.SelectUsuarioDAO;

@WebServlet(name = "ServletLogin", urlPatterns = {"/ServletLogin",
                                                   "/acessLogin"})
public class ServletLogin extends HttpServlet {

    
    CadastroUsuario usuario = new CadastroUsuario();
    SelectUsuarioDAO selectdao = new SelectUsuarioDAO();
    int retorn;
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       /* try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            /*out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletLogin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletLogin at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }*/
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
         String action = request.getServletPath();
         //chamando o metodo login 
        if(action.equals("/acessLogin")){
            try {
                //chamar o metodo login
                login(request, response);   
                
            } catch (SQLException ex){
                
                Logger.getLogger(ServletLogin.class.getName()).log(Level.SEVERE, null, ex);
                
            }   
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
   //metodo responsavel por enviar lista de dados do banco de dados
    protected void login(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException, SQLException{
     
        
        String email = request.getParameter("email");
        int password = Integer.parseInt(request.getParameter("password"));
        
        usuario.setEmail_usuario(email);
        usuario.setSenha_usuario(password);
        
            retorn = selectdao.BuscaUsuario(usuario);
            System.out.println("retorno da busca"+ "  "+ retorn);
            
             //condicional para direcionar para a pagina funcionario
             if(retorn == 1){
                 request.getRequestDispatcher("funcionario.html").forward(request, response);
             }else{ 
                 request.getRequestDispatcher("cadastrar.html").forward(request, response);
             }
    } 

}

  