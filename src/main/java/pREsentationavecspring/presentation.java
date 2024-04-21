package pREsentationavecspring;

import Metier.Metier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presentation {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("xmlspring.xml");//en premiere temp lire ce fichier spring
        Metier mt =(Metier) ctx.getBean("metier");//get bean donne un object
        System.out.println(mt.calculer());

    }
}
