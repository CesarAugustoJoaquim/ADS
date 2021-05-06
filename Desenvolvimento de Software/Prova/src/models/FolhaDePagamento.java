package models;

public class FolhaDePagamento {
	
	private Funcionario funcionario;
	private int mes;
	private int ano;
	private int horasTrabalhada;
	private double valorHora;
	
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getHorasTrabalhada() {
		return horasTrabalhada;
	}
	public void setHorasTrabalhada(int horasTrabalhada) {
		this.horasTrabalhada = horasTrabalhada;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	@Override
	public boolean equals(Object obj) {
		FolhaDePagamento outraFolha = (FolhaDePagamento) obj;
		return getFuncionario().equals(outraFolha.getFuncionario());
	}
	
}
