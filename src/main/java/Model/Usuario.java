
package Model;


public class Usuario {
    
    private String cpf_usuario;
    private String senha_usuario;
    private String tipo_usuario;

    public Usuario(String cpf_usuario, String senha_usuario, String tipo_usuario) {
        this.cpf_usuario = cpf_usuario;
        this.senha_usuario = senha_usuario;
        this.tipo_usuario = tipo_usuario;
    }
    
    

    public String getCpf_usuario() {
        return cpf_usuario;
    }

    public void setCpf_usuario(String cpf_usuario) {
        this.cpf_usuario = cpf_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
    
    
            
}
