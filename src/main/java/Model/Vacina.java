
package Model;

import java.util.Date;

public class Vacina {
    
    private String nome_vacina;
    private int cod_vacina;
    private Date data_aplic_vacina;

    public Vacina(String nome_vacina, int cod_vacina, Date data_aplic_vacina, String lote_vacina, Date data_fab_vacina) {
        this.nome_vacina = nome_vacina;
        this.cod_vacina = cod_vacina;
        this.data_aplic_vacina = data_aplic_vacina;
    }
    
    

    public String getNome_vacina() {
        return nome_vacina;
    }

    public void setNome_vacina(String nome_vacina) {
        this.nome_vacina = nome_vacina;
    }

    public int getCod_vacina() {
        return cod_vacina;
    }

    public void setCod_vacina(int cod_vacina) {
        this.cod_vacina = cod_vacina;
    }

    public Date getData_aplic_vacina() {
        return data_aplic_vacina;
    }

    public void setData_aplic_vacina(Date data_aplic_vacina) {
        this.data_aplic_vacina = data_aplic_vacina;
    }

    
}
