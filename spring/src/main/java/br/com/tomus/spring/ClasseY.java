package br.com.tomus.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ClasseY implements InterfaceB{
	
	public void metodoInterfaceB() {
		System.out.println("Método na classe Y.");
	}
}
