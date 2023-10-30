package andreademasi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@Slf4j
public class U2W1D1EexercisesApplication {

    public static void main(String[] args) {
        SpringApplication.run(U2W1D1EexercisesApplication.class, args);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U2W1D1EexercisesApplication.class);
        //log.info(ctx.getBean("getMargherita").toString());
        //log.info(ctx.getBean("getLemonade").toString());
        //log.info(ctx.getBean("getSalami").toString());

        System.out.println(ctx.getBean("getMenu"));
    }

}
