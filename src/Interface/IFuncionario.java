package Interface;

import java.util.List;
import Entidades.Funcionario;

public interface IFuncionario {
    
    public void adicionarFuncionario(Funcionario f);
    
    public List<Funcionario> listarFuncionarios();
    
    public Funcionario buscarFuncionarioPorNome(String nome);
    
    public void atualizarFuncionario(Funcionario f);
    
    public void removerFuncionario(Funcionario f);
}