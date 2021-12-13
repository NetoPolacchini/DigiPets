
package Model;

import DAO.ExceptionDAO;
import DAO.VeterinarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;


public class Veterinario extends Usuario {
    
    private String crm;

    public Veterinario(String nome, String cpf, String senha, String tipo_usuario, String crm) {
        super(nome, cpf, senha, tipo_usuario);
    }
    
    public Veterinario(){}
    
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

     public static void cadastrarVeterinario(Veterinario veterinario) throws ExceptionDAO, SQLException {
        new VeterinarioDAO().cadastrarVeterinario(veterinario);
    }

    public ArrayList<Veterinario> listarVeterinario() throws ExceptionDAO, SQLException{
		return new VeterinarioDAO().listarVeterinario();
    }


    
    
}
