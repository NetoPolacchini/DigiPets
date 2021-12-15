package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    public Usuario usuario;
    public ConnectionMVC connect;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private String sql;

    public UsuarioDAO() {
        connect = new ConnectionMVC();
        usuario = new Usuario();
    }
    
    
    public boolean autenticarUsuarioSenha() {
        sql = "SELECT * FROM usuario WHERE cpf = ? AND senha = ?";
        try {
            statement = connect.connection.prepareStatement(sql);
            statement.setString(1, usuario.getCpf());
            statement.setString(2, usuario.getSenha());
            resultSet = statement.executeQuery();
            resultSet.next();
            usuario.setCpf(resultSet.getString(3));
            usuario.setSenha(resultSet.getString(4));
            return true;
        } catch (SQLException erro) {
            return false;
        } finally {
            connect.close();
        }
    }
    
    public boolean cadastrarUsuario(Usuario usuario){
        String sql = "INSERT INTO usuario (cpf, nome, senha, tipoUsuario) VALUES (?,?,?,1)";
        try{
            connect.getConnection();
            statement = connect.connection.prepareStatement(sql);
            statement.setString(1, usuario.getCpf());
            statement.setString(2, usuario.getNome());
            statement.setString(3, usuario.getSenha());
            statement.execute();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar!");
            return false;
        } finally {
            connect.close();
        }
    }
    
    /*public boolean buscarUsuario() {
        sql = "SELECT * FROM usuario WHERE cpf = ? AND senha = ?";
        try {
            connect.getConnection();
            statement = connect.connection.prepareStatement(sql);
            statement.setString(1, usuario.getCpf());
            statement.setString(2, usuario.getSenha());
            resultSet = statement.executeQuery();
            resultSet.next();
            usuario.setTipo(resultSet.getString(2));
            usuario.setCpf(resultSet.getString(3));
            usuario.setSenha(resultSet.getString(4));
            usuario.setNome(resultSet.getString(5));
            usuario.setCpf(resultSet.getString(6));
            usuario.setDataDeNascimento(resultSet.getString(9));
            usuario.setEmail(resultSet.getString(7));
            usuario.setEndereco(resultSet.getString(8));
            return true;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar!");
            return false;
        } finally {
            connect.close();
        }
    }*/
    
    
    public ArrayList<Usuario> listarTutor() throws ExceptionDAO, SQLException {
        String sql = " SELECT * FROM usuario WHERE tipoUsuario = 1";
        PreparedStatement pStatement = null;
        ArrayList<Usuario> tutores = null;

        try {
            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);

            if (rs != null) {
                
                tutores = new ArrayList<Usuario>();
                
                while (rs.next()) {
                    
                    Usuario tutor = new Usuario();
                    
                    tutor.setIdUsuario(rs.getInt("idUsuario"));
                    tutor.setCpf(rs.getString("cpf"));
                    tutor.setNome(rs.getString("nome"));
                    tutores.add(tutor);
                }
            }
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao consultar tutor");
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

        return tutores;
    }
    
    public void alterarTutor(Usuario usuario) throws ExceptionDAO{
        String sql = "UPDATE usuario SET nome=?, cpf=? WHERE idUsuario=?";
        PreparedStatement pStatement = null;

        try {

            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            
            pStatement.setString(1, usuario.getNome());
            pStatement.setString(2, usuario.getCpf());
            pStatement.setInt(3, usuario.getIdUsuario());
            
            pStatement.execute();
            
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao alterar dados de tutor");
        } finally {
            try {
                if (pStatement != null) {
                    pStatement.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar statement " + e);
            }
            try {
                ConnectionMVC.getConnection().close();
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar conexão " + e);
            }
        }
    }

 
}