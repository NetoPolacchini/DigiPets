package Model;

import DAO.AnimalDAO;
import DAO.ExceptionDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class Animal {

    
    private int cod;
    private String nome;
    private String raca;
    private Boolean sexo;
    private String especie;
    private String obsGerais;

    public Animal(String nome, String raca, Boolean sexo, String especie, String obsGerais) {

        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.especie = especie;
        this.obsGerais = obsGerais;
    }

    public Animal() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Boolean getSexo() {
        return sexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

    public String getObsGerais() {
        return obsGerais;
    }

    public void setObsGerais(String obsGerais) {
        this.obsGerais = obsGerais;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public static void cadastrarAnimal(Animal animal) throws ExceptionDAO {
        new AnimalDAO().cadastrarAnimal(animal);
    }

    public ArrayList<Animal> listarAnimal() throws ExceptionDAO, SQLException{
		return new AnimalDAO().listarAnimal();
    }

}
