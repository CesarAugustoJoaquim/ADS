package views;

import java.util.Scanner;
import controllers.FolhaPagamentoController;
import controllers.FuncionarioController;
import models.FolhaDePagamento;
import models.Funcionario;

public class FolhaPagamentoConsultar {
	
	private static Scanner sc = new Scanner(System.in);
	private static FolhaDePagamento folhaPagamento;
	private static String cpfFuncionario, msg;
	private static Funcionario funcionario;
	
	public static void renderizar() {
		
		folhaPagamento = new FolhaDePagamento();
		System.out.println("=== Consultar folha de pagamento ===");
		System.out.println(" Digite o CPF do funcionario: ");
		cpfFuncionario = sc.next();
		funcionario = FuncionarioController.buscarPorCpf(cpfFuncionario);
		if(funcionario != null) {
			folhaPagamento.setFuncionario(funcionario);
			System.out.println("Mês da folha de pagamento");
			folhaPagamento.setMes(sc.nextInt());
			System.out.println("Ano da folha de pagamento");
			folhaPagamento.setAno(sc.nextInt());
			folhaPagamento = FolhaPagamentoController.buscarFolhaPorFuncionario(folhaPagamento);
			if(folhaPagamento != null) {
				msg = FolhaPagamentoController.calcular(folhaPagamento);
				System.out.println(msg);
			} else {
				System.out.println("Folha de pagamento não encontrada");
			}
		} else {
			System.out.println("CPF não encontrado!");
		}
		
		
	}

}
