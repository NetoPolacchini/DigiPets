package Model;

import DAO.ExceptionDAO;
import DAO.TutorDAO;
import java.sql.SQLException;
import java.util.ArrayList;


public class Tutor extends Usuario {
    
    private int cod_tutor;

    public Tutor(int cod_tutor, String nome, String cpf, String senha, String tipo_usuario) {
        super(nome, cpf, senha, tipo_usuario);
        this.cod_tutor = cod_tutor;
    }   

    public int getCod_tutor() {
        return cod_tutor;
    }

    public void setCod_tutor(int cod_tutor) {
        this.cod_tutor = cod_tutor;
    }
    
    public static void cadastrarTutor(Tutor tutor) throws ExceptionDAO, SQLException {
        new TutorDAO().cadastrarTutor(tutor);
    }
    
    public ArrayList<Tutor> listarTutor() throws ExceptionDAO, SQLException{
		return new TutorDAO().listarTutor();
    }

    public void add(Tutor tuto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
