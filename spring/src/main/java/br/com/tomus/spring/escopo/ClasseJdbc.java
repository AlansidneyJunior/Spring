package br.com.tomus.spring.escopo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ClasseJdbc {

	public ClasseJdbc() {
		System.out.println("Conexão JDBC");
	}
}
