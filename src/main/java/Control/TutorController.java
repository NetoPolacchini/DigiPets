package Control;
import DAO.ExceptionDAO;
import Model.Tutor;
import java.sql.SQLException;
import java.util.ArrayList;

public class TutorController {
    public static boolean cadastrarTutor(String nome, String cpf, String senha, String tipo_usuario, int cod_tutor) throws ExceptionDAO, SQLException {
        if (nome != null) {
            Tutor tutor = new Tutor(cod_tutor, nome, cpf, senha, tipo_usuario);
            Tutor.cadastrarTutor(tutor);
            return true;
        }
        return false;
    }
    	

	public ArrayList<Tutor> listarTutor() throws ExceptionDAO, SQLException {
		return new Tutor().listarTutor();
	}
    
      
    
};
