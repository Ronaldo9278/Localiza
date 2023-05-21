package Servicos;

import java.util.ArrayList;
import java.util.List;

import Entidades.Carro;

public class CarroService {

    private List<Carro> carros = new ArrayList<>();

    public void cadastrar(Carro carro) {
        for (Carro c : carros) {
            if (c.getId() == carro.getId()) {
                throw new RuntimeException("Já existe um carro cadastrado com o ID " + carro.getId());
            }
        }
        
        // Adiciona o novo carro à lista
        carros.add(carro);
    }
    
    public Carro buscar(int id) {
        for (Carro carro : carros) {
            if (carro.getId() == id) {
                return carro;
            }
        }
        
        return null;
    }
    
    public void atualizar(Carro carro) {
        for (int i = 0; i < carros.size(); i++) {
            if (carros.get(i).getId() == carro.getId()) {
                carros.set(i, carro);
                return;
            }
        }
        
        throw new RuntimeException("Não foi encontrado nenhum carro com o ID " + carro.getId());
    }
    
    public void excluir(int id) {
        for (int i = 0; i < carros.size(); i++) {
            if (carros.get(i).getId() == id) {
                carros.remove(i);
                return;
            }
        }
        
        throw new RuntimeException("Não foi encontrado nenhum carro com o ID " + id);
    }
}