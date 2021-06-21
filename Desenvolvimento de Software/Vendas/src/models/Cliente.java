package models;
import java.util.Date;

//Modificador de acesso -> public, private ou protected
public class Cliente {
	
	//Construtor	
	public Cliente() {
		setCriadoEm(new Date());
	}

	//Caracter�sticas, atributos ou propriedades
	private String nome;
	private String cpf;
	private Date criadoEm;
	
	//Getters and Setters
	//M�todo get do atributo nome
	public String getNome() {
		return this.nome;
	}	
	//M�todo set do atributo nome
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