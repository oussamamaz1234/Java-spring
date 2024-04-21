package pREsentationavecspring;

import Metier.Metier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presentation {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext("dao","Metier");
        Metier mt = ctx.getBean(Metier.class);
        System.out.println(mt.calculer());
        

    }
}
