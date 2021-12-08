
package Model;

import java.util.Date;


public class Animal {
    
    private String nome_animal;
    private int cod_animal;
    private String raca_animal;
    private String sexo_animal;

    public Animal(String nome_animal, int cod_animal, String sexo_animal, String raca_animal) {
        this.nome_animal = nome_animal;
        this.cod_animal = cod_animal;
        this.sexo_animal = sexo_animal;
    }
    
    

    public String getNome_animal() {
        return nome_animal;
    }

    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }

    public int getCod_animal() {
        return cod_animal;
    }

    public void setCod_animal(int cod_animal) {
        this.cod_animal = cod_animal;
    }

    public String getSexo_animal() {
        return sexo_animal;
    }

    public void setSexo_animal(String sexo_animal) {
        this.sexo_animal = sexo_animal;
    }

    public String getRaca_animal() {
        return raca_animal;
    }

    public void setRaca_animal(String raca_animal) {
        this.raca_animal = raca_animal;
    }

    
    public void cadastrarAnimal(Animal animal){};
    
}
