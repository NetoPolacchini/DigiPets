package Control;
import DAO.ExceptionDAO;
import Model.Tutor;
import java.sql.SQLException;
import java.util.ArrayList;

public class TutorController {
    public static boolean cadastrarTutor(String nome, String cpf, String senha) throws ExceptionDAO, SQLException {
        if (nome != null) {
            Tutor tutor = new Tutor( nome, cpf, senha);
            Tutor.cadastrarTutor(tutor);
            return true;
        }
        return false;
    }
    	

	public ArrayList<Tutor> listarTutor() throws ExceptionDAO, SQLException {
		return new Tutor().listarTutor();
	}
    
      
    
};
