package models;

import java.util.Date;

public class Vendedor {
	
	public Vendedor() {
		setCriadoEm(new Date());
	}

	private String nome;
	private String cpf;
	private Date criadoEm;
	
	public String getNome() {
		return this.nome;
	}	
	public void setNome(String nome) {
		this.nome = nome;
	}	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@Override
	public boolean equals(Object obj) {
		Cliente outroCliente = (Cliente) obj;
		return getCpf().equals(outroCliente.getCpf());
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " | CPF: " + getCpf() + " | Criado em: " + getCriadoEm();
	}
}