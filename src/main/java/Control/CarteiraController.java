package Control;
import DAO.ExceptionDAO;
import Model.Animal;
import Model.Carteira;
import Model.Vacina;
import java.sql.SQLException;
import java.util.ArrayList;

public class CarteiraController {
    
    public static boolean cadastrarCarteira(String nome, String data, int id) throws ExceptionDAO {
        if (nome != null && nome.length() > 0 && data.length() == 10) {
            Carteira carteira = new Carteira(id, nome, data);
            Carteira.cadastrarCarteira(carteira);
            return true;
        }
        return false;
    }
    	

	public ArrayList<Animal> listarAnimal() throws ExceptionDAO, SQLException {
		return new Animal().listarAnimal();
	}
    
      
    
};
