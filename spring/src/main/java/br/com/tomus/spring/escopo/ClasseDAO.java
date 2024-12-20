package br.com.tomus.spring.escopo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ClasseDAO {
	
	@Autowired
	ClasseJdbc objetoJdbc;

	public ClasseJdbc getObjetoJdbc() {
		return objetoJdbc;
	}

	public void setObjetoJdbc(ClasseJdbc objetoJdbc) {
		this.objetoJdbc = objetoJdbc;
	}
	
	
}
