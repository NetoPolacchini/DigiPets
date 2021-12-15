
package Model;


public class Usuario {
    
    private String nome;
    private String cpf;
    private String senha;
    private int tipoUsuario;
    private String crm;

    public Usuario(String nome, String cpf, String senha, int tipoUsuario, String crm) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
        this.crm = crm;
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

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    
}
