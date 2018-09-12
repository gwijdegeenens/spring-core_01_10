package eu.noelvaes.hardware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerApp {
   public static void main(String[] args) {
      try (
         ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(
            AppConfig.class)) {
         Computer computer = ctx.getBean("computer",
            Computer.class);
         System.out.println(computer);
      }
   }
}
