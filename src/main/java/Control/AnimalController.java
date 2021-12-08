package Control;
import DAO.ExceptionDAO;
import Model.Animal;

public class AnimalController {
    public static boolean cadastrarAnimal(String nome, String raca, Boolean sexo, String especie, String obs_gerais) throws ExceptionDAO {
        if (nome != null && nome.length() > 0 && raca != null && raca.length() > 0 && especie != null && especie.length() > 0 && obs_gerais != null && obs_gerais.length() > 0) {
            Animal animal = new Animal(nome, raca, sexo, especie, obs_gerais);
            Animal.cadastrarAnimal(animal);
            return true;
        }
        return false;
    }
    
      
    
};
