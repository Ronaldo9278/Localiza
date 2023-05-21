package Repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entidades.Filial;

public class FilialRepositorio {
    private Connection connection;

    public FilialRepositorio() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/seu_banco_de_dados", "usuario", "senha");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void adicionarFilial(Filial filial) {
        String query = "INSERT INTO filiais (nome) VALUES (?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, filial.getNome());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removerFilial(Filial filial) {
        String query = "DELETE FROM filiais WHERE nome = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, filial.getNome());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Filial buscarPorNome(String nome) {
        String query = "SELECT * FROM filiais WHERE nome = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, nome);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Filial filial = new Filial(query, query, query);
                filial.setNome(resultSet.getString("nome"));
                return filial;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Filial> listarFiliais() {
        List<Filial> filiais = new ArrayList<>();
        String query = "SELECT * FROM filiais";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Filial filial = new Filial(query, query, query);
                filial.setNome(resultSet.getString("nome"));
                filiais.add(filial);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filiais;
    }
}