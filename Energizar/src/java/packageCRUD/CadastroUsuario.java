
package packageCRUD;

public class CadastroUsuario {
    
    private String nome_usuario;
    private int fone_usuario;
    private String email_usuario;
    private int senha_usuario;
    private int senha_confirme;
    
    public int getSenha_confirme() {
        return senha_confirme;
    }

    public void setSenha_confirme(int senha_confirme) {
        this.senha_confirme = senha_confirme;
    }
    

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public int getFone_usuario() {
        return fone_usuario;
    }

    public void setFone_usuario(int fone_usuario) {
        this.fone_usuario = fone_usuario;
    }

    
    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public int getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(int senha_usuario) {
        this.senha_usuario = senha_usuario;
    }
    
    
    
}
