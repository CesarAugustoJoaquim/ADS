package views;

import java.util.Scanner;

import controllers.ProdutoController;
import models.Produto;

public class CadastrarProduto {
	
	private static Produto produto;	
	private static Scanner sc = new Scanner(System.in);
	
	public static void renderizar() {
		produto = new Produto();
		System.out.println("\n".repeat(20));
		System.out.println("\n-- CADASTRAR PRODUTO --  \n");				
		System.out.println("Digite o nome do produto:");	
		produto.setNome(sc.next());					
		System.out.println("Digite o preço do produto:");	
		produto.setPreco(sc.nextDouble());			
		System.out.println("Digite a quantidade do produto:");	
		produto.setQuantidade(sc.nextInt());
		if(ProdutoController.cadastrar(produto)) {
			System.out.println("\nProduto cadastrado com sucesso!");
		}else {
			System.out.println("Esse produto já existe!");
		}
	}
}
