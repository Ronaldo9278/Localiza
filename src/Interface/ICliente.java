package Interface;

public interface ICliente {
    public void create(ICliente cliente);
    public ICliente read(int id);
    public void update(ICliente cliente);
    public void delete(int id);
}