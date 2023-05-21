package Repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entidades.Cliente;

public class ClienteRepositorio {
    private Connection connection;

    public ClienteRepositorio() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/seu_banco_de_dados", "usuario", "senha");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void adicionarCliente(Cliente cliente) {
        String query = "INSERT INTO clientes (id, ...) VALUES (?, ...)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, cliente.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Cliente buscarCliente(int id) throws SQLException {
        String query = "SELECT * FROM clientes WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            }
        return null;
    }

    public void atualizarCliente(Cliente clienteAtualizado) {
        String query = "UPDATE clientes SET ... WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, clienteAtualizado.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removerCliente(int id) {
        String query = "DELETE FROM clientes WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        String query = "SELECT * FROM clientes";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }
}