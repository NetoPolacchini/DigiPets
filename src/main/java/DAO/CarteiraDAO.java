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
        String sql = "INSERT INTO carteira(idCarteiraAnimal, nomeVacina, dataAplicVacina) VALUES (?, ?, ?)";
        PreparedStatement pStatement = null;

        try {

            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            
            pStatement.setInt(1, carteira.getCod());
            pStatement.setString(2, carteira.getNomeVacina());
            pStatement.setDate(3, (Date) carteira.getDataAplicVacina());
            
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
            
            pStatement.setString(1, carteira.getNomeVacina());
            pStatement.setDate(2, (Date) carteira.getDataAplicVacina());
            
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
        String sql = "DELETE carteira WHERE idVacina=?";
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
    
    public ArrayList<Carteira> listarCarteira(int a) throws ExceptionDAO, SQLException {
        String sql = " SELECT * FROM carteira WHERE idCarteiraAnimal = a";
        PreparedStatement pStatement = null;
        ArrayList<Carteira> carteira = null;

        try {
            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);

            if (rs != null) {
                
                carteira = new ArrayList<Carteira>();
                
                while (rs.next()) {
                    
                    Carteira card = new Carteira();
                    
                    card.setCod(rs.getInt("idCarteiraAnimal"));
                    card.setNomeVacina(rs.getString("nomeVacina"));
                    
                    carteira.add(card);
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

        return carteira;
    }
    
}

