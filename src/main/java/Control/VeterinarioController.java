package Control;

import DAO.ExceptionDAO;
import Model.Veterinario;
import java.sql.SQLException;
import java.util.ArrayList;

public class VeterinarioController {
    
     public static boolean cadastrarVeterinario(String nome, String cpf, String senha, String crm) throws ExceptionDAO, SQLException, SQLException {
        if (nome != null && nome.length() > 0 && cpf != null && cpf.length() > 0 && senha != null && senha.length() > 0 && crm != null && crm.length() > 0 ) {
            Veterinario veterinario = new Veterinario(nome, cpf, senha, crm);
            Veterinario.cadastrarVeterinario(veterinario);
            return true;
        }
        return false;
    }
    
    public ArrayList<Veterinario> listarVeterinario() throws ExceptionDAO, SQLException {
		return new Veterinario().listarVeterinario();
    }
    
}
