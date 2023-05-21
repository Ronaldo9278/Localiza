package Interface;

import Entidades.Carro;
import Enum.MarcaCarro;

public interface ICarro {
    int getId();
    String getModelo();
    void setModelo(String modelo);
    MarcaCarro getMarca();
    void setMarca(MarcaCarro marca);
    int getAno();
    void setAno(int ano);
    double getPrecoAluguel();
    void setPrecoAluguel(double precoAluguel);
    void create();
    Carro read(int id);
    void update();
    void delete(int id);
}