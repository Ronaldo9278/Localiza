package Servicos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entidades.Aluguel;
import Entidades.Carro;
import Entidades.Cliente;

public class AluguelService {
    
    private int id;
    private Date dataInicio;
    private Date dataTermino;
    private Carro carroAlugado;
    private Cliente cliente;
    private double valorTotal;

    public AluguelService(int id, Date dataInicio, Date dataTermino, Carro carroAlugado, Cliente cliente, double valorTotal) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.carroAlugado = carroAlugado;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public Carro getCarroAlugado() {
        return carroAlugado;
    }

    public void setCarroAlugado(Carro carroAlugado) {
        this.carroAlugado = carroAlugado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void create() {
    }

    public Aluguel ceread (int id) {
		return null;
    }

    public void update() {
    }

    public void delete() {
    }
    
    public static List<AluguelService> buscarTodos() {
        return new ArrayList<>();
    }
}