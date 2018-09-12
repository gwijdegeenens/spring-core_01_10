package eu.noelvaes.spel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExpressionApp {

   public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
      MyBean myBean = ctx.getBean("myBean", MyBean.class);
      System.out.println(myBean);
      ctx.close();
   }
}
