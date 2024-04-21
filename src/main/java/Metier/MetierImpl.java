package Metier;

import dao.IDao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")
//@Component("metier") //au lieu d'utiliser component dans inteligi on utilise @service
public class MetierImpl implements Metier {
    //Autowired n'est pas recomende car il ne respect pas en quelque sort le principe de encapsulation puisque il inject des attribut prive en dehore de la classe ( c'est le role seulement des geter et seters)
    //@Autowired//spring cherche les objet qui implemente IDAO1 et l'affect a cette autowired
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
//au lieu d'utiliser autowired on peut remplacer elle dans le constructeur avec parametre il faut qu'une seul constructeur pour faire ca  au moment de creation de objet on inject automatiquement l'objet beans au parametre du constructeur
    public MetierImpl(@Qualifier("dao1") IDao1 dao) {// qualifier si ila plusieur extention de la class-interface idao1
        this.dao = dao;
        System.out.println("declaration de constructeur");;
    }
    //tout extention de interface dao est de formpat et type dao c'est un polymorphisme
}
