package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao2") //pour la couche dao
//@Component("dao2")
public class DaoImpl2 implements IDao1 {
    @Override
    public double getData() {
        // je me connect a bd
        double data=100;
        return data;
    }

    public void init()
    {
        System.out.println("instantiation de dao implementatio 2");
    }
}
