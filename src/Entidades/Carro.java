package Entidades;

import Enum.MarcaCarro;
import Interface.ICarro;

public class Carro implements ICarro {
    private int id;
    private String modelo;
    private MarcaCarro marca;
    private int ano;
    private double precoAluguel;

    public Carro(int id, String modelo, MarcaCarro marca, int ano, double precoAluguel) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.precoAluguel = precoAluguel;
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public MarcaCarro getMarca() {
        return marca;
    }

    public void setMarca(MarcaCarro marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPrecoAluguel() {
        return precoAluguel;
    }

    public void setPrecoAluguel(double precoAluguel) {
        this.precoAluguel = precoAluguel;
    }

    public void create() {
    }

    public Carro read(int id) {
        return null;
    }

    public void update() {
    }

    public void delete(int id) {
    }
}