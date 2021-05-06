package views;

import java.util.Scanner;
import controllers.FolhaPagamentoController;
import models.FolhaDePagamento;
import models.Funcionario;

public class FolhaPagamentoHistorico {
	
	private static Scanner sc = new Scanner(System.in);
	private static int ano, mes;
	
	public static void renderizar() {
		System.out.println("Mês da folha de pagamento");
		mes = sc.nextInt();
		System.out.println("Ano da folha de pagamento");
		ano = sc.nextInt();
		for (FolhaDePagamento folhaCadastrada : FolhaPagamentoController.listar()) {
			if(	folhaCadastrada.getAno() == ano 
			&&  folhaCadastrada.getMes() == mes) {
				Funcionario funcionario = folhaCadastrada.getFuncionario();
				System.out.println("Nome: " + funcionario.getNome());
				System.out.println("Mês: " + folhaCadastrada.getMes());
				System.out.println("Ano: " + folhaCadastrada.getAno());
				System.out.println(FolhaPagamentoController.calcular(folhaCadastrada));
			}
		}
	}
}
