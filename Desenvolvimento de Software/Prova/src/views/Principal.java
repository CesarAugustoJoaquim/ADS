package views;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		int opcao;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("=== Projeto - Folha de Pagamaneto === \n"
							+  "=== 1 - Cadastrar funcion�rio \n"
							+  "=== 2 - Cadastrar folha de pagamento \n"
							+  "=== 3 - Consultar folha de pagamento \n"
							+  "=== 4 - Consultar hist�rico de folhas de pagamento do m�s \n"
							+  "=== 0 - Sair ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				FuncionarioCadastrar.renderizar();
				break;
			case 2:
				FolhaPagamentoCadastrar.renderizar();
				break;
			case 3:
				FolhaPagamentoConsultar.renderizar();
				break;
			case 4: 
				FolhaPagamentoHistorico.renderizar();
				break;
			case 0:
				System.out.println("\nSaindo...");
				break;
			default:
				System.out.println("\nOp��o inv�lida!");
				break;
			}
		}while (opcao != 0);
		sc.close();
	}

}
