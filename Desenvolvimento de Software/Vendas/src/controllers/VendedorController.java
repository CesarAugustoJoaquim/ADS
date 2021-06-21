package controllers;

import java.util.ArrayList;

import models.Vendedor;

public class VendedorController {

	private static ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>(); 

	public static ArrayList<Vendedor> listar() {
		return vendedores;
	}

	public static boolean cadastrar(Vendedor vendedor) {
		if(buscarPorCpf(vendedor.getCpf()) == null) {
			vendedores.add(vendedor);
			return true;
		}
		return false;
	}	

	public static Vendedor buscarPorCpf(String cpf) {
		for(Vendedor vendedorCadastrado : vendedores) {
			if(vendedorCadastrado.getCpf().equals(cpf)) {
				return vendedorCadastrado;
			}
		}
		return null;
	}
}
