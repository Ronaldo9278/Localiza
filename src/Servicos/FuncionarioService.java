package Servicos;

import java.util.ArrayList;
import java.util.List;

import Entidades.Funcionario;

public class FuncionarioService {
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void atualizarFuncionario(Funcionario funcionario) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getNome().equals(funcionario.getNome())) {
                funcionarios.set(i, funcionario);
                break;
            }
        }
    }

    public void excluirFuncionario(String nome) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getNome().equals(nome)) {
                funcionarios.remove(i);
                break;
            }
        }
    }

    public Funcionario consultarFuncionario(String nome) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getNome().equals(nome)) {
                return funcionarios.get(i);
            }
        }
        return null;
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }
}