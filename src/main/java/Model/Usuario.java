
package Model;


public class Usuario {
    
    private String nome;
    private String cpf;
    private String senha;
    private String tipo_usuario;

    public Usuario(String nome, String cpf, String senha, String tipo_usuario) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.tipo_usuario = tipo_usuario;
    }
    
    public Usuario(){}
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
    
    
    
    
            
}
