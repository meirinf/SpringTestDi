package programa;

import entidades.Vehiculo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 53638138e on 06/04/17.
 */
public class Programa {

    public static void main(String[] args) {

        //Creamos el nuevo objeto con la base xml
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        Vehiculo vehiculo = ctx.getBean("vehiculo",Vehiculo.class);
        System.out.println(vehiculo.getMatricula());
    }
}
