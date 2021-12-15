package DAO;

import Model.Carteira;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CarteiraDAO {

    public void cadastrarCarteira(Carteira carteira) throws ExceptionDAO {
        String sql = "INSERT INTO carteira(idCarteiraAnimal) VALUES (?)";
        PreparedStatement pStatement = null;

        try {

            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            pStatement.setInt(1, carteira.getAnimal().getCod());
            pStatement.execute();
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao cadastrar carteira");
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

    public void alterarCarteira(Carteira carteira) throws ExceptionDAO {
        String sql = "UPDATE carteira SET nomeVacinal=?, dataAplicVacina=? WHERE idCarteiraAnimal=?";
        PreparedStatement pStatement = null;

        try {

            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            pStatement.setString(1, carteira.getVacina().getNome_vacina());
            pStatement.setString(2, carteira.getAnimal().getNome());
            pStatement.setInt(3, carteira.getCod());
            pStatement.execute();
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao alterar carteira");
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

    public void removerCarteira(Carteira carteira) throws ExceptionDAO {
        String sql = "DELETE carteira WHERE idCarteiraAnimal=?";
        PreparedStatement pStatement = null;

        try {

            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            pStatement.setInt(1, carteira.getCod());
            pStatement.execute();
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao apagar carteira");
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
