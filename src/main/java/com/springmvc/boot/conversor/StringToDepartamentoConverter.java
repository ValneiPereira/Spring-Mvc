package com.springmvc.boot.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.springmvc.boot.domain.Departamento;
import com.springmvc.boot.service.DepartamentoService;

@Component
public class StringToDepartamentoConverter implements Converter<String, Departamento>{
	
	@Autowired
	private DepartamentoService service;
	
	/*Metado de conversao String para um departamento, conversao de dados*/	
	@Override
	public Departamento convert(String text) {
		if(text.isEmpty()) {
		return null;
		/*variavel vazia nao seja convertida*/
		}
		/*Conversao*/
		Long id= Long.valueOf(text);
		return service.buscarPorId(id);
	}

}
