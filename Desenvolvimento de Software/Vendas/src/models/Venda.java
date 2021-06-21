package models;

import java.util.ArrayList;
import java.util.Date;

public class Venda {
	
	public Venda() {	
		setCriadoEm(new Date());
	}
	
	private Cliente cliente;
	private Vendedor vendedor;
	private ArrayList<ItemVenda> itens;
	private Date criadoEm;
	
	public ArrayList<ItemVenda> getItens() {
		return itens;
	}
	public void setItens(ArrayList<ItemVenda> itens) {
		this.itens = itens;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
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