package views;

import java.util.Scanner;

import controllers.ClienteController;
import models.Cliente;

public class CadastrarCliente {

	private static Scanner sc = new Scanner(System.in);
	private static Cliente cliente;
	
	public static void renderizar() {
		cliente = new Cliente();
		System.out.println(" ================================= \n Cadastrar clientes. \n ================================= \n");
		cliente.setNome(sc.nextLine());
		System.out.println("Digite o CPF do cliente:");
		cliente.setCpf(sc.nextLine());
		if(ClienteController.cadastrar(cliente)) {
			System.out.println("Cliente cadastrado com sucesso!");
		}else {
			System.out.println("Esse cliente já existe!");
		}
	}
}
