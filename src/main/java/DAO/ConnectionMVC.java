package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMVC {
static Connection connection = null;

    public static Connection getConnection() {
  
       try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/digipets", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }

  if (connection == null){
   try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/digipets", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        } 
  }
        return connection;
    }
    
    public void close() {
        try {
            connection.close();
            System.out.println("Desconectou");
        } catch (SQLException erro) {
        }
    }
    
}