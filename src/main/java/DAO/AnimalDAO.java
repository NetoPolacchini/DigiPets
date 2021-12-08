package DAO;
import Model.Animal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AnimalDAO {
    
    public void cadastrarAnimal(Animal animal){
        String sql = "INSERT INTO animal(nome, raca, sexo, especie, obs_gerais)";
    
    
    PreparedStatement pStatement = null;
    Connection connection = null;
    
    try(
        connection = new ConnectionMVC().getConnection();
        pStatement = connection.prepareStatement(sql);
        pStatement.setString(1, animal.getNome());
        pStatement.setString(2, animal.getRaca());
        pStatement.setBoolean(3, animal.getSexo());
        pStatement.setString(4, animal.getEspecie());
        pStatement.setString(5, animal.getObsGerais());
        pStatement.execute();
    )catch (SQLException e) {
            throw new ExceptionDAO("Erro ao cadastrar item");
        } finally {
            try {
                if (pStatement != null) {
                    pStatement.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar statement " + e);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar conexão " + e);
            }
        }
    }
}
