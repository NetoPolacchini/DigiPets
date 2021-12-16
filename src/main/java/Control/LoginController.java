package Control;

import DAO.UsuarioDAO;
import Model.Usuario;
import View.HomeTutor;
import View.HomeVeterinario;
import View.Login;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class LoginController {
    
    public Login view;
    Connection connection;
    UsuarioDAO usuarioAutenticar;
    Usuario usuarioLogado;

    public LoginController(Login view){
        this.view = view;
    }

    
    
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

}