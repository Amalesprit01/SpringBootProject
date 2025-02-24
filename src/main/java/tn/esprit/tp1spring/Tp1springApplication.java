package tn.esprit.tp1spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Tp1springApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp1springApplication.class, args);
    }

}
