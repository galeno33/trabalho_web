
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
import packageDAO.InsertDAO;
import packageDAO.InsertUsuarioDAO;

/**
 *
 * @author MRFSolar
 */
@WebServlet(name = "ServletUsuarios", urlPatterns = {"/ServletUsuarios",
                                                     "/ControlerUsuario"})
public class ServletUsuarios extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       // try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
        /*    out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletUsuarios</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletUsuarios at " + request.getContextPath() + "</h1>");
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
        
        if(action.equals("/ControlerUsuario")){
                try {
                        //instancia de objeto da calsse CadastroUsuario
                        CadastroUsuario objCadastroUsuario = new CadastroUsuario();
                        //setando informações do documento html cadastrar
                        objCadastroUsuario.setNome_usuario(request.getParameter("nomeUsuario"));
                        objCadastroUsuario.setFone_usuario(Integer.parseInt(request.getParameter("foneUsuario")));//pesquisar se o get é esse mesmo
                        objCadastroUsuario.setEmail_usuario(request.getParameter("emailUsuario"));
                        objCadastroUsuario.setSenha_usuario(Integer.parseInt(request.getParameter("senhaUsuario")));
                        //objCadastroUsuario.setSenha_confirme(Integer.parseInt(request.getParameter("senhaConfirme")));

                                //instacia do objeto da classe insertDAO 
                                InsertUsuarioDAO objetoInserido = new InsertUsuarioDAO();

                    //enviar a informação obtida pelo getParameter para  a classe insertDAO, e aplicar o metodo insertBD()
                    objetoInserido.insertUsuario(objCadastroUsuario);

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ServletUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ServletUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
                //retornar a pagina Cadastrar.html
                cadastroUsuario(request,response);
                
                               
            }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    protected void cadastroUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.sendRedirect("cadastrar.html");
    }
}
