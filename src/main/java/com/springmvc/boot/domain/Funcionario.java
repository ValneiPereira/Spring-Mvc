package com.springmvc.boot.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="FUNCIONARIOS")
public abstract class Funcionario extends AbstractEntity<Long> {
	
	@Column(nullable= false, unique=true)
	private String name;
	
	@Column(nullable= false, columnDefinition="DECIMAL(7,2)	DEFAULT 0.00")
	private BigDecimal salario;
	
	@Column(name="data_entrada",nullable= false, columnDefinition ="DATE") 
	private LocalDate dataEntrada;
	
	@Column(name="data_saida", columnDefinition ="DATE") 
	private LocalDate dataSaida;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="endereco_id_fk")
	private Endereco endereco;
	
	@ManyToOne
	@JoinColumn(name="cargo_id_fk")
	private Cargo cargo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
}
