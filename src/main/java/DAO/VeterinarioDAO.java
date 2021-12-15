package DAO;

import Model.Veterinario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class VeterinarioDAO {

    public void cadastrarVeterinario(Veterinario veterinario) throws ExceptionDAO, SQLException {
        String sql = "INSERT INTO veterinario(nome, cpf, senha, crm) VALUES (?, ?, ?, ?)";
        PreparedStatement pStatement = null;

        try {

            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            pStatement.setString(1, veterinario.getNome());
            pStatement.setString(2, veterinario.getCpf());
            pStatement.setString(3, veterinario.getSenha());
            pStatement.setString(4, veterinario.getCrm());
            pStatement.execute();
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao cadastrar veterinario");
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

    public void alterarVeterinario(Veterinario veterinario) throws ExceptionDAO, SQLException {
        String sql = "UPDATE veterinario SET nome=?, cpf=?, crm=?";
        PreparedStatement pStatement = null;

        try {

            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            pStatement.setString(1, veterinario.getNome());
            pStatement.setString(2, veterinario.getCpf());
            pStatement.setString(3, veterinario.getCrm());
            pStatement.execute();
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao alterar veterinario");
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
    
    public void removerVeterinario(Veterinario veterinario) throws ExceptionDAO, SQLException {
        String sql = "DELETE veterinario WHERE crm=?";
        PreparedStatement pStatement = null;

        try {

            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            pStatement.setString(1, veterinario.getCrm());
            pStatement.execute();
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao apagar veterinario");
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
    
    public ArrayList<Veterinario> listarVeterinario() throws ExceptionDAO, SQLException {
        String sql = " select * from animal";
        PreparedStatement pStatement = null;
        ArrayList<Veterinario> veterinario = null;

        try {
            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);

            if (rs != null) {
                
                veterinario = new ArrayList<Veterinario>();
                
                while (rs.next()) {
                    
                    Veterinario vet = new Veterinario();
                             
                    vet.setNome(rs.getString("nome"));
                    vet.setCpf(rs.getString("cpf"));
                    vet.setSenha(rs.getString("senha"));
                    vet.setCrm(rs.getString("crm"));
                    veterinario.add(vet);
                }
            }
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao consultar veterinario");
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

        return veterinario;

    }
}
