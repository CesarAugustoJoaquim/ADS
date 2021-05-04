package models;

import java.util.Date;

public class Produto {
	
	public Produto(String nome) {
		setCriadoEm(new Date());
	}
	
	private String nome;
	private double preco;
	private int quantidade;
	private Date criadoEm;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}	
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " | Preço: " + getPreco() + " | Quantidade: " + getQuantidade() + 
				" | Criado em: " + getCriadoEm();
	}
	
}