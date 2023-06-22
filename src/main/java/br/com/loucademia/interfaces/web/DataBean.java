package br.com.loucademia.interfaces.web;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import br.com.loucademia.domain.aluno.Aluno.Sexo;

@Named
@ApplicationScoped
public class DataBean implements Serializable {
	private static final long serialVersionUID = 1L;
		
	public DataBean() {
		System.out.println("DataBean constructor called");
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("DataBean initialized");
	}
	
	public Sexo[] getSexos() {
		return Sexo.values();
	}
}
