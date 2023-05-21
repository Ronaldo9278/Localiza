package Repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entidades.Aluguel;

public class AluguelRepositorio {
    private Connection connection;

    public AluguelRepositorio() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/seu_banco_de_dados", "usuario", "senha");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addAluguel(Aluguel aluguel) {
        String query = "INSERT INTO alugueis (id, ...) VALUES (?, ...)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, aluguel.getId());
            // Defina os valores das outras colunas do aluguel no PreparedStatement
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Aluguel> getAlugueis() {
        List<Aluguel> alugueis = new ArrayList<>();
        String query = "SELECT * FROM alugueis";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Aluguel aluguel = new Aluguel(0, null, null, null, null, 0);
                aluguel.setId(resultSet.getInt("id"));
                // Preencha os outros atributos do aluguel com os valores do ResultSet
                alugueis.add(aluguel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alugueis;
    }

    public Aluguel getAluguelById(int id) {
        String query = "SELECT * FROM alugueis WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Aluguel aluguel = new Aluguel(id, null, null, null, null, id);
                aluguel.setId(resultSet.getInt("id"));
                // Preencha os outros atributos do aluguel com os valores do ResultSet
                return aluguel;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void removeAluguelById(int id) {
        String query = "DELETE FROM alugueis WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
