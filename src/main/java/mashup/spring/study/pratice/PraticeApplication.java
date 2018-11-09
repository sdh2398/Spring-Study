package mashup.spring.study.pratice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class PraticeApplication {

    public static final String APPLICATION_LOCATIONS = "spring.config.location="
            +"classpath:application.yml,"
            +"/app/config/dj-dh-spring/real-application.yml";

    public static void main(String[] args) {
            new SpringApplicationBuilder(PraticeApplication.class)
                    .properties(APPLICATION_LOCATIONS)
                    .run();
        }
}
