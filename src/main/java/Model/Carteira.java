package Model;

import DAO.CarteiraDAO;
import DAO.ExceptionDAO;
import java.util.Date;

public class Carteira {
    
    private int cod;
    private String nomeVacina;
    private Date dataAplicVacina;
    private int idVacina;

    public Carteira(int cod, String nomeVacina, Date dataAplicVacina) {
       this.cod = cod;
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

    public Date getDataAplicVacina() {
        return dataAplicVacina;
    }

    public void setDataAplicVacina(Date dataAplicVacina) {
        this.dataAplicVacina = dataAplicVacina;
    }
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
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
