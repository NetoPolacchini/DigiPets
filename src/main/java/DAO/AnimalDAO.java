package DAO;

import Model.Animal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AnimalDAO  {
    
    public void cadastrarAnimal(Animal animal) throws ExceptionDAO {
        String sql = "INSERT INTO animal(nome, raca, sexo, especie, obsGerais, idTutorAnimal) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pStatement = null;

        try {

            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            pStatement.setString(1, animal.getNome());
            pStatement.setString(2, animal.getRaca());
            pStatement.setString(3, animal.getSexo());
            pStatement.setString(4, animal.getEspecie());
            pStatement.setString(5, animal.getObsGerais());
            pStatement.setInt(6, animal.getCod_dono());
            
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
    
    public void alterarAnimal(Animal animal) throws ExceptionDAO{
        String sql = "UPDATE animal SET nome=?, raca=?, sexo=?, especie=?, obsGerais=? WHERE idAnimal=?";
        PreparedStatement pStatement = null;

        try {

            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            pStatement.setString(1, animal.getNome());
            pStatement.setString(2, animal.getRaca());
            pStatement.setString(3, animal.getSexo());
            pStatement.setString(4, animal.getEspecie());
            pStatement.setString(5, animal.getObsGerais());
            pStatement.setInt(6, animal.getCod());
            pStatement.execute();
            
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao alterar dados de animal");
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
    
    
    
    public void removerAnimal(Animal animal) throws ExceptionDAO{
        String sql = "DELETE FROM animal WHERE idAnimal=?";
        PreparedStatement pStatement = null;

        try {

            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            pStatement.setInt(1, animal.getCod());
            pStatement.execute();
            
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao remover tutor");
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
        String sql = " SELECT * FROM animal";
        PreparedStatement pStatement = null;
        ArrayList<Animal> animais = null;

        try {
            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);

            if (rs != null) {
                
                animais = new ArrayList<Animal>();
                
                while (rs.next()) {
                    
                    Animal anima = new Animal();
                    
                    anima.setCod(rs.getInt("idAnimal"));
                    anima.setNome(rs.getString("nome"));
                    anima.setRaca(rs.getString("raca"));
                    anima.setSexo(rs.getString("sexo"));
                    anima.setEspecie(rs.getString("especie"));
                    anima.setObsGerais(rs.getString("obsGerais"));
                    animais.add(anima);
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

        return animais;
    }
    
     public ArrayList<Animal> listarAnimalTutor(int a) throws ExceptionDAO, SQLException {
        String sql = " SELECT * FROM animal WHERE idTutorAnimal = "+a;
        PreparedStatement pStatement = null;
        ArrayList<Animal> animais = null;

        try {
            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);
               
            if (rs != null) {
                
                animais = new ArrayList<Animal>();
                
                while (rs.next()) {
                    
                    Animal anima = new Animal();
                    
                    anima.setCod(rs.getInt("idAnimal"));
                    anima.setNome(rs.getString("nome"));
                    anima.setRaca(rs.getString("raca"));
                    anima.setSexo(rs.getString("sexo"));
                    anima.setEspecie(rs.getString("especie"));
                    anima.setObsGerais(rs.getString("obsGerais"));
                    animais.add(anima);
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

        return animais;
    }
     
     public ArrayList<Animal> listarAnimalFields(int a) throws ExceptionDAO, SQLException {
        String sql = " SELECT * FROM animal WHERE idAnimal = "+a;
        PreparedStatement pStatement = null;
        ArrayList<Animal> animais = null;

        try {
            pStatement = ConnectionMVC.getConnection().prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);
               
            if (rs != null) {
                
                animais = new ArrayList<Animal>();
                
                while (rs.next()) {
                    
                    Animal anima = new Animal();
                    
                    anima.setCod(rs.getInt("idAnimal"));
                    anima.setNome(rs.getString("nome"));
                    anima.setRaca(rs.getString("raca"));
                    anima.setSexo(rs.getString("sexo"));
                    anima.setEspecie(rs.getString("especie"));
                    anima.setObsGerais(rs.getString("obsGerais"));
                    animais.add(anima);
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

        return animais;
    }
    
    
    
}

   