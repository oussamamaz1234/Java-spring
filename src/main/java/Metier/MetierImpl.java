package Metier;

import dao.IDao1;

public class MetierImpl implements Metier {
    private IDao1 dao;//il est null maintenant ne pas faire new car il est maintenant une interface et on doit n3emroha par une extension
    @Override
    public double  calculer() {
        double d=dao.getData();
        double res = d*20;

        return res;
    }
    public void init()
    {
        System.out.println("instantiation de dao metier implementation");
    }
    public void setDao(IDao1 dao) {
        this.dao = dao;
        System.out.println("injection de dependance set done");
    }
    //cette seter est utiliser pour faire l'injection de dependance injecter une class qui implement cette interface au attribut dao

    public MetierImpl() {
        System.out.println("declaration de constructeur");;
    }
    //tout extention de interface dao est de formpat et type dao c'est un polymorphisme
}
