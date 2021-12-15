/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.ExceptionDAO;
import Model.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Vitão
 */
public class UsuarioController {
    
    public static boolean cadastrarTutor(String nome, String cpf, String senha) throws ExceptionDAO {
        
        if (nome != null && nome.length() > 0 && cpf != null && cpf.length() > 0 && senha != null && senha.length() > 0) {
            Usuario tutor = new Usuario(nome, cpf, senha);
            Usuario.cadastrarTutor(tutor);
            return true;
        }
        return false;
    }
    
    public ArrayList<Usuario> listarTutor() throws ExceptionDAO, SQLException {
		return new Usuario().listarTutor();
    }
    
}
