package Servicos;

import java.util.ArrayList;
import java.util.List;

import Entidades.Filial;

public class FilialService {

    private List<Filial> filiais;

    public FilialService() {
        filiais = new ArrayList<>();
    }

    public void adicionarFilial(Filial filial) {
        filiais.add(filial);
    }

    public void removerFilial(Filial filial) {
        filiais.remove(filial);
    }

    public void atualizarFilial(Filial filialAntiga, Filial filialNova) {
        int index = filiais.indexOf(filialAntiga);
        if (index != -1) {
            filiais.set(index, filialNova);
        }
    }

    public List<Filial> listarFiliais() {
        return filiais;
    }

    public Filial buscarFilialPorNome(String nome) {
        for (Filial filial : filiais) {
            if (filial.getNome().equals(nome)) {
                return filial;
            }
        }
        return null;
    }
}