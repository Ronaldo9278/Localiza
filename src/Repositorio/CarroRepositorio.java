package Repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Entidades.Carro;

public class CarroRepositorio {
    private Connection connection;

    public CarroRepositorio() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/seu_banco_de_dados", "usuario", "senha");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void create(Carro carro) {
        String query = "INSERT INTO carros (id, ...) VALUES (?, ...)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, carro.getId());
            // Defina os valores das outras colunas do carro no PreparedStatement
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Carro read(int id) {
        String query = "SELECT * FROM carros WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Carro carro = new Carro(id, query, null, id, id);
                carro.setAno(resultSet.getInt("id"));
                // Preencha os outros atributos do carro com os valores do ResultSet
                return carro;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void update(Carro carroAtualizado) {
        String query = "UPDATE carros SET ... WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            // Defina os valores das colunas atualizadas no PreparedStatement
            statement.setInt(1, carroAtualizado.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String query = "DELETE FROM carros WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}