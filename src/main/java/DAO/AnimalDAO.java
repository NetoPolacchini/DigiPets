package DAO;

import Model.Animal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AnimalDAO {

    public void cadastrarAnimal(Animal animal) throws ExceptionDAO {
        String sql = "INSERT INTO animal(nome, raca, sexo, especie, obs_gerais)";
        PreparedStatement pStatement = null;

        try {

            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            pStatement.setString(1, animal.getNome());
            pStatement.setString(2, animal.getRaca());
            pStatement.setBoolean(3, animal.getSexo());
            pStatement.setString(4, animal.getEspecie());
            pStatement.setString(5, animal.getObsGerais());
            pStatement.execute();
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao cadastrar animal");
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

    public ArrayList<Animal> listarAnimal() throws ExceptionDAO, SQLException {
        String sql = " select * from animal";
        PreparedStatement pStatement = null;
        ArrayList<Animal> animal = null;

        try {
            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);

            if (rs != null) {
                
                animal = new ArrayList<Animal>();
                
                while (rs.next()) {
                    
                    Animal anima = new Animal();
                    
                    anima.setCod(rs.getInt("cod"));
                    anima.setNome(rs.getString("nome"));
                    anima.setRaca(rs.getString("raca"));
                    anima.setSexo(rs.getBoolean("sexo"));
                    anima.setEspecie(rs.getString("especie"));
                    anima.setObsGerais(rs.getString("obsGerais"));
                    animal.add(anima);
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

        return animal;

    }
}