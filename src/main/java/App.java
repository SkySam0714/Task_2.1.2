import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld helloWorld1 = applicationContext.getBean(HelloWorld.class);
        HelloWorld helloWorld2 = applicationContext.getBean(HelloWorld.class);
        Cat cat1 = applicationContext.getBean(Cat.class);
        Cat cat2 = applicationContext.getBean(Cat.class);
        System.out.println(HelloWorld.class + " - " + (helloWorld1 == helloWorld2));
        System.out.println(Cat.class + " - " + (cat1 == cat2));

    }
}