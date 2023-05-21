package Interface;

import java.util.Date;

import Entidades.Aluguel;
import Entidades.Carro;
import Entidades.Cliente;

public interface IAluguel {
	
    public int getId();

    public void setId(int id);

    public Date getDataInicio();

    public void setDataInicio(Date dataInicio);

    public Date getDataTermino();

    public void setDataTermino(Date dataTermino);

    public Carro getCarroAlugado();

    public void setCarroAlugado(Carro carroAlugado);

    public Cliente getCliente();

    public void setCliente(Cliente cliente);

    public double getValorTotal();

    public void setValorTotal(double valorTotal);

    public void create();

    public Aluguel read(int id);

    public void update();

    public void delete();
}