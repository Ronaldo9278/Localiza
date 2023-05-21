package Servicos;

import java.util.ArrayList;
import java.util.List;

import Entidades.Cliente;

public class ClienteService {
    private List<Cliente> clientes = new ArrayList<>();

    public void criarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscarClientePorId(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    public List<Cliente> buscarTodosClientes() {
        return clientes;
    }

    public void atualizarCliente(int id, Cliente clienteAtualizado) {
        Cliente clienteAntigo = buscarClientePorId(id);
        if (clienteAntigo != null) {
            clienteAntigo.setNome(clienteAtualizado.getNome());
            clienteAntigo.setEmail(clienteAtualizado.getEmail());
            clienteAntigo.setTelefone(clienteAtualizado.getTelefone());
        }
    }

    public void excluirCliente(int id) {
        Cliente cliente = buscarClientePorId(id);
        if (cliente != null) {
            clientes.remove(cliente);
        }
    }
}