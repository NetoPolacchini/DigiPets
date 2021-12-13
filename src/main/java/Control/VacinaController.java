package Control;

import DAO.ExceptionDAO;
import Model.Vacina;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;


public class VacinaController {
    public static boolean cadastrarVacina(String nome, int cod, Date data) throws ExceptionDAO, SQLException {
        if (nome != null && nome.length() > 0 && cod != 0 && data != null) {
            Vacina vacina = new Vacina(nome, cod, data);
            Vacina.cadastrarVacina(vacina);
            return true;
        }
        return false;
    }
    
    public ArrayList<Vacina> listarVacina() throws ExceptionDAO, SQLException {
		return new Vacina().listarVacina();
    }
        
};
