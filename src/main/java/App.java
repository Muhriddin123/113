import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld tree =
                applicationContext.getBean(HelloWorld.class);
        HelloWorld leaf =
                applicationContext.getBean(HelloWorld.class);

        Pojo.Cat one = applicationContext.getBean(Pojo.Cat.class);
        Pojo.Cat two = applicationContext.getBean(Pojo.Cat.class);
        System.out.println("Сравнение бинов helloWorld: " + (tree == leaf));
        System.out.println("Сравнение бинов cat: " + (two == one));

        applicationContext.close();
    }
}
