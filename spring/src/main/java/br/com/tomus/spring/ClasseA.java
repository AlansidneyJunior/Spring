package br.com.tomus.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ClasseA {
	
	@Autowired
	private InterfaceB interfaceB;
	
	public void execute() {
		interfaceB.metodoInterfaceB();
	}
}
