package DAO;

import Model.Vacina;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VacinaDAO {

    public void cadastrarVacina(Vacina vacina) throws ExceptionDAO, SQLException {
        String sql = "INSERT INTO carteira(nomeVacina, idCarteiraAnimal, dataAplicVacina) VALUES (?, ?, ?)";
        PreparedStatement pStatement = null;

        try {

            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            pStatement.setString(1, vacina.getNome_vacina());
           // pStatement.setInt(2, ());
            pStatement.setDate(3, (Date) vacina.getData_aplic_vacina());
            pStatement.execute();
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao cadastrar vacina");
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

    public void alterarVacina(Vacina vacina) throws ExceptionDAO, SQLException {
        String sql = "UPDATE animal SET nome=?, cod=?, data=?";
        PreparedStatement pStatement = null;

        try {

            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            pStatement.setString(1, vacina.getNome_vacina());
            pStatement.setInt(2, vacina.getCod_vacina());
            pStatement.setDate(3, (Date) vacina.getData_aplic_vacina());
            pStatement.execute();
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao cadastrar vacina");
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
    
    public ArrayList<Vacina> listarVacina() throws ExceptionDAO, SQLException {
        String sql = " select * from vacina";
        PreparedStatement pStatement = null;
        ArrayList<Vacina> vacina = null;

        try {
            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);

            if (rs != null) {
                
                vacina = new ArrayList<Vacina>();
                
                while (rs.next()) {
                    
                    Vacina vac = new Vacina();
                    
                    vac.setCod_vacina(rs.getInt("cod"));
                    vac.setNome_vacina(rs.getString("nome"));
                    vac.setData_aplic_vacina(rs.getDate("data"));
                    vacina.add(vac);
                }
            }
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao consultar vacina");
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

        return vacina;

    }
}
