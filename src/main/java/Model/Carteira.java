package Model;

import DAO.CarteiraDAO;
import DAO.ExceptionDAO;
import java.util.Date;

public class Carteira {
    
    private int idCarteiraAnimal;
    private String nomeVacina;
    private String dataAplicVacina;
    private int idVacina;

    public Carteira(int idCarteiraAnimal, String nomeVacina, String dataAplicVacina) {
       this.idCarteiraAnimal = idCarteiraAnimal;
       this.nomeVacina = nomeVacina;
       this.dataAplicVacina = dataAplicVacina;
    }
    
    public Carteira(){};

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public String getDataAplicVacina() {
        return dataAplicVacina;
    }

    public void setDataAplicVacina(String dataAplicVacina) {
        this.dataAplicVacina = dataAplicVacina;
    }
    
    public int getIdCarteiraAnimal() {
        return idCarteiraAnimal;
    }

    public void setIdCarteiraAnimal(int cod) {
        this.idCarteiraAnimal = cod;
    }

    public int getIdVacina() {
        return idVacina;
    }

    public void setIdVacina(int idVacina) {
        this.idVacina = idVacina;
    }
    
    
    
    
    
    public static void cadastrarCarteira(Carteira carteira) throws ExceptionDAO {
        new CarteiraDAO().cadastrarCarteira(carteira);

    }
    
    
 
    
    
}
