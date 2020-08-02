import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat catBean1 = (Cat) applicationContext.getBean("cat");
        catBean1.catVoice();

        Cat catBean2 = (Cat) applicationContext.getBean("cat");

        System.out.println("Сравнение пары бинов \"helloworld\": " +
                (bean == bean2));
        System.out.println("Сравнение пары бинов \"cat\": " +
                (catBean1 == catBean2));
    }
}