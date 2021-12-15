package Model;

import DAO.ExceptionDAO;
import DAO.UsuarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;


public class Usuario {
    
    private String nome;
    private String cpf;
    private String senha;
    private int tipoUsuario;
    private int idUsuario;
    private String crm;

    public Usuario(String nome, String cpf, String senha, int tipoUsuario, String crm, int idUsuario) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
        this.crm = crm;
        this.idUsuario = idUsuario;
    }
    
    public Usuario(String nome, String cpf, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    };
    
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

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public ArrayList<Usuario> listarTutor() throws ExceptionDAO, SQLException{
		return new UsuarioDAO().listarTutor();
    }
    
    public static void cadastrarTutor(Usuario usuario) throws ExceptionDAO {
        new UsuarioDAO().cadastrarUsuario(usuario);
    }
}
