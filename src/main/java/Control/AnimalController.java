package Control;
import DAO.ExceptionDAO;
import Model.Animal;
import java.sql.SQLException;
import java.util.ArrayList;

public class AnimalController {
    
    public static boolean cadastrarAnimal(String nome, String raca, String sexo, String especie, String obs_gerais, int cod_dono) throws ExceptionDAO {
        
        if (nome != null && nome.length() > 0 && raca != null && raca.length() > 0 && especie != null && especie.length() > 0 && obs_gerais != null && obs_gerais.length() > 0 && sexo != null && sexo.length() > 0 && cod_dono != 0) {
            Animal animal = new Animal(nome, raca, sexo, especie, obs_gerais, cod_dono);
            Animal.cadastrarAnimal(animal);
            return true;
        }
        return false;
    }
    
    public ArrayList<Animal> listarAnimal() throws ExceptionDAO, SQLException {
		return new Animal().listarAnimal();
    }
        
};
