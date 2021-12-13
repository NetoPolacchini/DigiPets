package Control;
import DAO.ExceptionDAO;
import Model.Animal;
import Model.Carteira;
import Model.Vacina;
import java.sql.SQLException;
import java.util.ArrayList;

public class CarteiraController {
    public static boolean cadastrarCarteira(Vacina vacina, Animal animal ) throws ExceptionDAO {
        if (vacina.getNome_vacina() != null && vacina.getNome_vacina().length() > 0 && animal.getNome() != null && animal.getNome().length() > 0) {
            Carteira carteira = new Carteira();
            Carteira.cadastrarCarteira(carteira);
            return true;
        }
        return false;
    }
    	

	public ArrayList<Animal> listarAnimal() throws ExceptionDAO, SQLException {
		return new Animal().listarAnimal();
	}
    
      
    
};
