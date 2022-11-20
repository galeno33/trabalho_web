
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
import packageCRUD.CadastroProdutos;
import packageDAO.InsertDAO;

/**
 *
 * @author MRFSolar
 */
@WebServlet(name = "ServletProdutos", urlPatterns = {"/ServletProdutos",
                                                     "/ControlerProduto"})
public class ServletProdutos extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           /* out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletProdutos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletProdutos at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }*/
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String action = request.getServletPath();
        
        if(action.equals("/Cadastroprodutos")){
                produto(request, response);
            
                //teste de chamada
            //try ( PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
               /* out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet ServletProdutos</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> Deu Certo</h1>");
                out.println("</body>");
                out.println("</html>");
            }*/
                
            }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        String action = request.getServletPath();
        
         if(action.equals("/ControlerProduto")){
                try{
                    CadastroProdutos objProduto = new CadastroProdutos();
                    objProduto.setNome_produto(request.getParameter("nomeProduto"));
                    objProduto.setModelo_produto(request.getParameter("modeloProduto"));
                    objProduto.setTecnologia_produto(request.getParameter("RadioDefaulttec"));
                    objProduto.setPotência_produto(Integer.parseInt(request.getParameter("potenciaPlaca")));
                    objProduto.setQuantidade_produto(Integer.parseInt(request.getParameter("qtdProduto")));
                    objProduto.setLargura_placa(Integer.parseInt(request.getParameter("larguraPlaca")));
                    objProduto.setAltura_placa(Integer.parseInt(request.getParameter("alturaPlaca")));
                    objProduto.setPeso_placa(Integer.parseInt(request.getParameter("pesoPlaca")));

                    InsertDAO produtoInserido = new InsertDAO();
                    produtoInserido.insertProduto(objProduto);

                    produto(request, response);

                }catch(ClassNotFoundException ex){
                  Logger.getLogger(ServletProdutos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ServletProdutos.class.getName()).log(Level.SEVERE, null, ex);
                }
                               
            }
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    protected void produto(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.sendRedirect("produtos.jsp");
        
    }
    

}
