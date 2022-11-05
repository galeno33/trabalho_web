/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pacoteServlet;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import packageCRUD.CadastroUsuario;
import packageDAO.InsertDAO;

/**
 *
 * @author Fabio
 */
@WebServlet(name = "ServletControler", urlPatterns = {"/ServletControler"})
public class ServletControler extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletControler</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletControler at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        //teste do retorno do doPOST
        /*try ( PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletControler</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Deu certo!</h1>");
            out.println("</body>");
            out.println("</html>");
        }*/
        
        try {
                //instancia de objeto da calsse CadastroUsuario
                CadastroUsuario objCadastroUsuario = new CadastroUsuario();
                //setando informações do documento html cadastrar
                objCadastroUsuario.setNome_usuario(request.getParameter("nomeUsuario"));
                objCadastroUsuario.setFone_usuario(Integer.parseInt(request.getParameter("foneUsuario")));//pesquisar se o get é esse mesmo
                objCadastroUsuario.setEmail_usuario(request.getParameter("emailUsuario"));
                objCadastroUsuario.setSenha_usuario(Integer.parseInt(request.getParameter("senhaUsuario")));
                //objCadastroUsuario.setSenha_confirme(Integer.parseInt(request.getParameter("senhaConfirme")));

                //condicional de confirmação se a senha digitada é igual a senha de confirmação
                //if(objCadastroUsuario.setSenha_usuario(int senha_usuario) == objCadastroUsuario.setSenha_confirme(int senha_confirme)){

                        //instacia do objeto da classe insertDAO 
                        InsertDAO objetoInserido = new InsertDAO();
                        
            //enviar a informação obtida pelo getParameter para  a classe insertDAO, e aplicar o metodo insertBD()
            objetoInserido.insertUsuario(objCadastroUsuario);
            
            //--------------------- A IMPLEMENTAR --------------------//
            //confirmação do cadastramento com sucesso
            out.println("<h2>usuario cadastrado com sucesso!</h2>");
            
            //}
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServletControler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServletControler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
