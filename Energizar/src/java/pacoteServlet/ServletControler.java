
package pacoteServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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


@WebServlet(name = "ServletControler", urlPatterns = {"/ServletControler"})
                                                      
public class ServletControler extends HttpServlet {   
  
    CadastroUsuario usuario = new CadastroUsuario();
    SelectDAO selectdao = new SelectDAO();
    int retorn;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            /*out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletControler</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletControler at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }*/
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            //processRequest(request, response);
            //listarProdutos(request, response);
                 
            
            //String action = request.getServletPath(); 
            
            
            
           /* if(action.equals("/Cadastroprodutos")){
                produto(request, response);
            }*/
             
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        String action = request.getServletPath();
    //=============================================================================================================================
        //chamando o metodo login 
        /*if(action.equals("/acessLogin")){
            try {
                //chamar o metodo login
                login(request, response);   
                
            } catch (SQLException ex){
                
                Logger.getLogger(ServletControler.class.getName()).log(Level.SEVERE, null, ex);
                
            }   
        }*/
        
        
       //=========================================================================================================================================== 
            //executar a inser????o dos dados da pagina produtos.html para o banco de dados
           /* if(action.equals("/ControlerUsuario")){
                try {
                        //instancia de objeto da calsse CadastroUsuario
                        CadastroUsuario objCadastroUsuario = new CadastroUsuario();
                        //setando informa????es do documento html cadastrar
                        objCadastroUsuario.setNome_usuario(request.getParameter("nomeUsuario"));
                        objCadastroUsuario.setFone_usuario(Integer.parseInt(request.getParameter("foneUsuario")));//pesquisar se o get ?? esse mesmo
                        objCadastroUsuario.setEmail_usuario(request.getParameter("emailUsuario"));
                        objCadastroUsuario.setSenha_usuario(Integer.parseInt(request.getParameter("senhaUsuario")));
                        //objCadastroUsuario.setSenha_confirme(Integer.parseInt(request.getParameter("senhaConfirme")));

                                //instacia do objeto da classe insertDAO 
                                InsertDAO objetoInserido = new InsertDAO();

                    //enviar a informa????o obtida pelo getParameter para  a classe insertDAO, e aplicar o metodo insertBD()
                    objetoInserido.insertUsuario(objCadastroUsuario);

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ServletControler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ServletControler.class.getName()).log(Level.SEVERE, null, ex);
                }
                //retornar a pagina Cadastrar.html
                cadastroUsuario(request,response);
                
                               
            }*/
       //==================================================================================================================================
            //executar a inser????o dos dados da pagina cadastrar.html no banco de dados
            /*if(action.equals("/ControlerProduto")){
                try{
                    CadastroProdutos objProduto = new CadastroProdutos();
                    objProduto.setNome_produto(request.getParameter("nomeProduto"));
                    objProduto.setModelo_produto(request.getParameter("modeloProduto"));
                    objProduto.setTecnologia_produto(request.getParameter("RadioDefaulttec"));
                    objProduto.setPot??ncia_produto(Integer.parseInt(request.getParameter("potenciaPlaca")));
                    objProduto.setQuantidade_produto(Integer.parseInt(request.getParameter("qtdProduto")));
                    objProduto.setLargura_placa(Integer.parseInt(request.getParameter("larguraPlaca")));
                    objProduto.setAltura_placa(Integer.parseInt(request.getParameter("alturaPlaca")));
                    objProduto.setPeso_placa(Integer.parseInt(request.getParameter("pesoPlaca")));

                    InsertDAO produtoInserido = new InsertDAO();
                    produtoInserido.insertProduto(objProduto);

                    //produto(request, response);

                }catch(ClassNotFoundException ex){
                  Logger.getLogger(ServletControler.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ServletControler.class.getName()).log(Level.SEVERE, null, ex);
                }
                               
            }*/
              
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    /*protected void produto(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.sendRedirect("produtos.jsp");
    }*/
    
    /*protected void cadastroUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.sendRedirect("cadastrar.html");
    }*/
    
    //metodo responsavel por enviar lista de dados do banco de dados
    /*protected void login(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException, SQLException{
     
        
        String email = request.getParameter("email");
        int password = Integer.parseInt(request.getParameter("password"));
        
        usuario.setEmail_usuario(email);
        usuario.setSenha_usuario(password);
        
        
            retorn = 1; //selectdao.BuscaUsuario(usuario);
            System.out.println("retorno da busca"+ retorn);
             //condicional para direcionar para a pagina funcionario
             if(retorn == 1){
                 request.getRequestDispatcher("funcionario.html").forward(request, response);
             }else{ 
                 request.getRequestDispatcher("cadastrar.html").forward(request, response);
             }
    }*/
    
}
