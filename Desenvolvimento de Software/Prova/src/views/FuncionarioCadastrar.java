package views;

import java.util.Scanner;
import controllers.FuncionarioController;
import models.Funcionario;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class FuncionarioCadastrar {
	
	private static Scanner sc = new Scanner(System.in);
	private static Funcionario funcionario;
	
	public static void renderizar() {
		funcionario = new Funcionario();
		System.out.println("=== Cadastrar Funcionário ===");
		System.out.println(" Nome do funcionario: ");
		funcionario.setNome(sc.nextLine());
		System.out.println(" CPF do funcionario: ");
		funcionario.setCpf(sc.nextLine());
		System.out.println(" Data de nascimento do funcionario (dd/mm/aaaa): ");
			try {
				String dataRecebida = sc.nextLine();
				DateFormat dataFormatacao = new SimpleDateFormat("dd/MM/yyyy");
				Date dataFinal = dataFormatacao.parse(dataRecebida);
				funcionario.setDataNascimento(dataFinal);	
			} catch (Exception e) {
				e.printStackTrace();
			}
		if(FuncionarioController.cadastrar(funcionario)) {
			System.out.println("Funcionário cadastrado com sucesso!");
		} else {
			System.out.println("CPF informado já esta cadastrado!");
		}
	}
	
}
