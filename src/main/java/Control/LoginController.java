package Control;

import DAO.ConnectionMVC;
import DAO.ExceptionDAO;
import DAO.UsuarioDAO;
import Model.Usuario;
import View.HomeTutor;
import View.HomeVeterinario;
import View.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LoginController {
    
    public Login view;
    Connection connection;
    UsuarioDAO usuarioAutenticar;
    Usuario usuarioLogado;

    public LoginController(Login view){
        this.view = view;
    }
    public LoginController(){}

    
    
    public void consultaLoginESenha() {
        usuarioAutenticar = new UsuarioDAO();
        
        usuarioAutenticar.usuario.setCpf(view.getjTextFieldUsuario().getText());
        usuarioAutenticar.usuario.setSenha(view.getjPasswordFieldSenha().getText());
        usuarioAutenticar.connect.getConnection();
        
        if(usuarioAutenticar.autenticarUsuarioSenha()){
            view.dispose();
            usuarioAutenticar.buscarUsuario();
            System.out.println(usuarioAutenticar.usuario.getTipoUsuario());
            
            if("1".equals(usuarioAutenticar.usuario.getTipoUsuario())){
                HomeTutor telaMenu = new HomeTutor();
                telaMenu.setVisible(true);
            }else if("0".equals(usuarioAutenticar.usuario.getTipoUsuario())){
                HomeVeterinario telaMenu = new HomeVeterinario();
                telaMenu.setVisible(true);
            }
        }else{
            JOptionPane.showMessageDialog(view, "Senha ou usuário incorreto!");
        }
    }

    public boolean checkLogin(String login, String senha) throws ExceptionDAO, SQLException {
        String sql = " SELECT * FROM usuario WHERE cpf = ? and senha = ?";
        PreparedStatement pStatement = null;
        boolean check = false;

        try {
            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);
            pStatement.setString(1, login);
            pStatement.setString(2, senha);
            pStatement.execute();
           
            
            if (rs != null) {
                
                if (rs.next()) {
                    
                    check = true;
                    
                }
            }
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao consultar item");
        } finally {
            try {
                if (pStatement != null) {
                    pStatement.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar o pStatement" + e);
            }
        }
         try {
                if (pStatement != null) {
                    pStatement.close();
                }
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao fechar conexão" + e);
        }

        return check;
    }
    
}