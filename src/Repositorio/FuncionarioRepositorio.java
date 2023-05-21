package Repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entidades.Funcionario;

public class FuncionarioRepositorio {
    private Connection connection;

    public FuncionarioRepositorio() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/seu_banco_de_dados", "usuario", "senha");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        String query = "INSERT INTO funcionarios (nome, endereco, telefone, email, cargo) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, funcionario.getNome());
            statement.setString(2, funcionario.getEndereco());
            statement.setString(3, funcionario.getTelefone());
            statement.setString(4, funcionario.getEmail());
            statement.setString(5, funcionario.getCargo());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removerFuncionario(Funcionario funcionario) {
    }

    public List<Funcionario> listarFuncionarios() {
        List<Funcionario> funcionarios = new ArrayList<>();
        String query = "SELECT * FROM funcionarios";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return funcionarios;
    }

    public Funcionario buscarFuncionarioPorNome(String nome) {
        String query = "SELECT * FROM funcionarios WHERE nome = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, nome);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {}
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Funcionario buscarFuncionarioPorEndereco(String endereco) {
        String query = "SELECT * FROM funcionarios WHERE endereco = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, endereco);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Funcionario buscarFuncionarioPorTelefone(String telefone) {
        String query = "SELECT * FROM funcionarios WHERE telefone = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, telefone);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Funcionario buscarFuncionarioPorEmail(String email) {
        String query = "SELECT * FROM funcionarios WHERE email = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, email);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Funcionario buscarFuncionarioPorCargo(String cargo) {
        String query = "SELECT * FROM funcionarios WHERE cargo = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, cargo);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
