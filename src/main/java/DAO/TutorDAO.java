package DAO;

import Model.Tutor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TutorDAO {

    public void cadastrarTutor(Tutor tutor) throws ExceptionDAO, SQLException {
        String sql = "INSERT INTO tutor(nome, cpf, senha, tipo_usuario)";
        PreparedStatement pStatement = null;

        try {

            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            pStatement.setString(1, tutor.getNome());
            pStatement.setString(2, tutor.getCpf());
            pStatement.setString(3, tutor.getSenha());
            pStatement.setString(4, tutor.getTipo_usuario());
            pStatement.execute();
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao cadastrar tutor");
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

    public ArrayList<Tutor> listarTutor() throws ExceptionDAO, SQLException {
        String sql = " select * from tutor";
        PreparedStatement pStatement = null;
        ArrayList<Tutor> tutor = null;

        try {
            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);

            if (rs != null) {
                
                tutor = new ArrayList<Tutor>();
                
                while (rs.next()) {
                    
                    Tutor tuto = new Tutor();
                    
                    tuto.setCod_tutor(rs.getInt("cod"));
                    tuto.setNome(rs.getString("nome"));
                    tuto.setCpf(rs.getString("cpf"));
                    tuto.add(tuto);
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

        return tutor;
    }
    
}
