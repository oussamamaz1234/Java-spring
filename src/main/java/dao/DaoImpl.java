package dao;

public class DaoImpl implements IDao1 {
    @Override
    public double getData() {
       // je me connect a bd
      double data=90;
        return data;
    }
    public void init()
    {
        System.out.println("instantiation de dao implementatio");
    }
}
