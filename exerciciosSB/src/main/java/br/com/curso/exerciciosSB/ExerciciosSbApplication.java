package br.com.curso.exerciciosSB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ExerciciosSbApplication {
	

    public static void main(String[] args) {
        SpringApplication.run(ExerciciosSbApplication.class, args);
    }

}
