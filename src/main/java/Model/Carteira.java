package Model;

import DAO.CarteiraDAO;
import DAO.ExceptionDAO;

public class Carteira {
    
    private Vacina vacina;
    private Animal animal;
    private int cod;

    public Carteira(Vacina vacina, Animal animal) {
        this.vacina = vacina;
        this.animal = animal;
    }
    
    public Carteira(){};
    

    public Vacina getVacina() {
        return vacina;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
    
    
    public static void cadastrarCarteira(Carteira carteira) throws ExceptionDAO {
        new CarteiraDAO().cadastrarCarteira(carteira);

    }
    
    
 
    
    
}
