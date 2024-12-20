package br.com.tomus.spring.escopo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import br.com.tomus.spring.basico.ClasseA;

@SpringBootApplication
public class EscopoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(EscopoApplication.class, args);
		ClasseDAO objetoDAO1 = applicationContext.getBean(ClasseDAO.class);
		ClasseDAO objetoDAO2 = applicationContext.getBean(ClasseDAO.class);
		
		System.out.println(objetoDAO1);
		System.out.println(objetoDAO1.getObjetoJdbc());
		
		System.out.println(objetoDAO2);
		System.out.println(objetoDAO2.getObjetoJdbc());
	}

}
