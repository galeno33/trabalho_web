/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package pacoteServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import packageCRUD.CadastroProdutos;
import packageCRUD.CadastroUsuario;
import packageDAO.InsertDAO;
import packageDAO.SelectDAO;
import packageDAO.conexaoDAO;


@WebServlet(name = "ServletControler", urlPatterns = {"/ServletControler",
                                                      "/ControlerProduto",
                                                      "/ControlerUsuario",
                                                      "/produtos"})
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
    
   
    
    
    
    conexaoDAO daoConn = new conexaoDAO();
    SelectDAO dao = new SelectDAO();
    
    
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
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*try {
            //processRequest(request, response);
            
            listarProdutos(request, response);*/
            String action = request.getServletPath(); 
            
            if(action.equals("/produtos")){
            produto(request, response);
            }
       /* } catch (SQLException ex) {
            Logger.getLogger(ServletControler.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

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
        
        String action = request.getServletPath();
        
            //executar a inserção dos dados da pagina produtos.html para o banco de dados
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
                                InsertDAO objetoInserido = new InsertDAO();

                    //enviar a informação obtida pelo getParameter para  a classe insertDAO, e aplicar o metodo insertBD()
                    objetoInserido.insertUsuario(objCadastroUsuario);

                    

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ServletControler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ServletControler.class.getName()).log(Level.SEVERE, null, ex);
                }
                //retornar a pagina Cadastrar.html
                cadastroUsuario(request,response);
                
                               
            }
       
            //executar a inserção dos dados da pagina cadastrar.html no banco de dados
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
                  Logger.getLogger(ServletControler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ServletControler.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                //teste de retorno da condicional 
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
                
            }
            
                    
    }
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
    protected void produto(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.sendRedirect("produtos.jsp");
    }
    
    protected void cadastroUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.sendRedirect("cadastrar.html");
    }
    
    //metodo responsavel por enviar lista de dados do banco de dados
    protected void listarProdutos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException{
        
        
        //ArrayList<CadastroProdutos> lista = (ArrayList<CadastroProdutos>) dao.BuscarProduto();
        //encaminhar a lista
        //request.setAttribute("lista", lista);
        //RequestDispatcher requis = request.getRequestDispatcher("produtos.jsp");
        
        //requis.forward(request, response);
        
    }
    
}
