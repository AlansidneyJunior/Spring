package br.com.tomus.spring.basico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		ClasseA objetoA = applicationContext.getBean(ClasseA.class);
		objetoA.execute();
	}

}
