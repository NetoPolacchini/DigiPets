
package Model;

import java.util.Date;


public class Animal {
    
    private String nome_animal;
    private int cod_animal;
    private Date data_nasc_animal;
    private boolean sexo_animal;
    private String especie_animal;
    private String raca_animal;
    private float peso_animal;
    private String obs_gerais;

    public Animal(String nome_animal, int cod_animal, Date data_nasc_animal, boolean sexo_animal, String especie_animal, String raca_animal, float peso_animal, String obs_gerais) {
        this.nome_animal = nome_animal;
        this.cod_animal = cod_animal;
        this.data_nasc_animal = data_nasc_animal;
        this.sexo_animal = sexo_animal;
        this.especie_animal = especie_animal;
        this.raca_animal = raca_animal;
        this.peso_animal = peso_animal;
        this.obs_gerais = obs_gerais;
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

    public Date getData_nasc_animal() {
        return data_nasc_animal;
    }

    public void setData_nasc_animal(Date data_nasc_animal) {
        this.data_nasc_animal = data_nasc_animal;
    }

    public boolean isSexo_animal() {
        return sexo_animal;
    }

    public void setSexo_animal(boolean sexo_animal) {
        this.sexo_animal = sexo_animal;
    }

    public String getEspecie_animal() {
        return especie_animal;
    }

    public void setEspecie_animal(String especie_animal) {
        this.especie_animal = especie_animal;
    }

    public String getRaca_animal() {
        return raca_animal;
    }

    public void setRaca_animal(String raca_animal) {
        this.raca_animal = raca_animal;
    }

    public float getPeso_animal() {
        return peso_animal;
    }

    public void setPeso_animal(float peso_animal) {
        this.peso_animal = peso_animal;
    }

    public String getObs_gerais() {
        return obs_gerais;
    }

    public void setObs_gerais(String obs_gerais) {
        this.obs_gerais = obs_gerais;
    }
    
    
    
}
