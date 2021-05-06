package models;
import java.util.Date;

public class Funcionario {
	
	public Funcionario() {
		
	}
	
	private String nome;
	private String cpf;
	private Date dataNascimento;
	
	public String getNome() {
		return nome;
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
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public boolean equals(Object obj) {
		Funcionario outroFuncionario = (Funcionario) obj;
		return getCpf().equals(outroFuncionario.getCpf());
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + " CPF: " + getCpf() + " Data de nascimento: " + getDataNascimento();
	}
}
