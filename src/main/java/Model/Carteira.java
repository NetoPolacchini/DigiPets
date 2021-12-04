package Model;
public class Carteira {
    
    private Vacina vacina;
    private Animal animal;

    public Carteira(Vacina vacina, Animal animal) {
        this.vacina = vacina;
        this.animal = animal;
    }
    

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
    
    
    
 
    
    
}
