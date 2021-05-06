package views;

import java.util.Scanner;
import controllers.FolhaPagamentoController;
import controllers.FuncionarioController;
import models.FolhaDePagamento;
import models.Funcionario;

public class FolhaPagamentoCadastrar {
	
	private static Scanner sc = new Scanner(System.in);
	private static FolhaDePagamento folhaPagamento;
	private static String cpfFuncionario;
	private static Funcionario funcionario;
	
	public static void renderizar() {
		folhaPagamento = new FolhaDePagamento();
		System.out.println("=== Cadastrar Folha de Pagamento ===");
		System.out.println(" Digite o CPF do funcionario: ");
		cpfFuncionario = sc.next();
		funcionario = FuncionarioController.buscarPorCpf(cpfFuncionario);
		if(funcionario != null) {
			folhaPagamento.setFuncionario(funcionario);
			System.out.println("Mês da folha de pagamento");
			folhaPagamento.setMes(sc.nextInt());
			System.out.println("Ano da folha de pagamento");
			folhaPagamento.setAno(sc.nextInt());
			System.out.println("Número de horas trabalhadas");
			folhaPagamento.setHorasTrabalhada(sc.nextInt());
			System.out.println("Valor da hora");
			folhaPagamento.setValorHora(sc.nextDouble());
			if(FolhaPagamentoController.cadastrar(folhaPagamento)) {
				System.out.println("Folha de pagamento cadastrada com sucesso!");
			} else {
				System.out.println("Folha de pagamento não pode ser cadastrada");
			}
		} else {
			System.out.println("CPF não encontrado!");
		}
	}
	
}
