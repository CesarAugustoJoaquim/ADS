import java.util.Date;

public class Cliente 
{
	public Cliente() 
	{
		setCriadoEm(new Date());
	}
	
	private String nome;
	private String cpf;
	private Date criadoEm;
	
	public String getNome()
	{
		return this.nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getCpf() 
	{
		return this.cpf;
	}
	
	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}
	
	public Date getCriadoEm() 
	{
		return criadoEm;
	}

	public void setCriadoEm(Date criadoEm) 
	{
		this.criadoEm = criadoEm;
	}
	
	@Override
	public String toString() {
		return "Nome: " +getNome() + " CPF: " + getCpf() + " Criado em: " + getCriadoEm();
	}

}
