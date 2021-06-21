package views;

import java.util.Scanner;

import controllers.VendedorController;
import models.Vendedor;

public class CadastrarVendedor {
	
	private static Vendedor vendedor;	
	private static Scanner sc = new Scanner(System.in);
	
	public static void renderizar() {
		vendedor = new Vendedor();
		System.out.println("\n".repeat(20));
		System.out.println("\n-- CADASTRAR VENDEDOR --  \n");				
		System.out.println("Digite o nome do vendedor:");	
		vendedor.setNome(sc.next());					
		System.out.println("Digite o CPF do vendedor:");	
		vendedor.setCpf(sc.next());
		if(VendedorController.cadastrar(vendedor)) {
			System.out.println("\nVendedeor cadastrado com sucesso!");
		}else {
			System.out.println("Esse vendedor já existe!");
		}
	}
}
