package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao1")
//@Component //AU Lieu d'utiliser component on utilise repository c'est pour la couche dao
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
