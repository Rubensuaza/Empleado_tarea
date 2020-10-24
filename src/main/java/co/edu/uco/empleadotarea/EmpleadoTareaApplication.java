package co.edu.uco.empleadotarea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class EmpleadoTareaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpleadoTareaApplication.class, args);
    }

}
