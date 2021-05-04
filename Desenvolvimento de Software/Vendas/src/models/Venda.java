package models;

import java.util.ArrayList;
import java.util.Date;

public class Venda {
	
	public Venda() {	

	}
	
	private Cliente cliente;
	private Vendedor vendedor;
	private ArrayList<ItemVenda> produtos;
	private Date criadoEm;
	
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public ArrayList<ItemVenda> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<ItemVenda> produtos) {
		this.produtos = produtos;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
}