package controllers;

import java.util.ArrayList;
import models.FolhaDePagamento;

public class FolhaPagamentoController {
	
	private static ArrayList<FolhaDePagamento> folhasPagamento = new ArrayList<FolhaDePagamento>();
	static double salarioBruto, impostoRenda, inss, fgts, salarioLiquido;
	
	public static boolean cadastrar(FolhaDePagamento folhaPagamento) {
		for (FolhaDePagamento folhaCadastrada : folhasPagamento) {
			if(	folhaCadastrada.getFuncionario().equals(folhaPagamento.getFuncionario()) 
			&&  folhaCadastrada.getAno() == folhaPagamento.getAno() 
			&&  folhaCadastrada.getMes() == folhaPagamento.getMes()) {
				return false;
			}
		}
		folhasPagamento.add(folhaPagamento);
		return true;
	}
	
	public static FolhaDePagamento buscarFolhaPorFuncionario(FolhaDePagamento folhaPagamento) {
		for (FolhaDePagamento folhaCadastrada : folhasPagamento) {
			if(	folhaCadastrada.getFuncionario().equals(folhaPagamento.getFuncionario()) 
			&&  folhaCadastrada.getAno() == folhaPagamento.getAno() 
			&&  folhaCadastrada.getMes() == folhaPagamento.getMes()) {
				return folhaCadastrada;
			}
		}
		return null;
	}
	
	public static String calcular(FolhaDePagamento folhaPagamento) {
		
		salarioBruto = folhaPagamento.getHorasTrabalhada() * folhaPagamento.getValorHora();
		
		if(salarioBruto <= 1903.98) {
			impostoRenda = 0;
		} else if (salarioBruto <= 2826.65) {
			impostoRenda = (salarioBruto * 0.075) - 142.80;
		} else if (salarioBruto <= 3751.05) {
			impostoRenda = (salarioBruto * 0.15) - 354.80;
		} else if (salarioBruto <= 4664.68) {
			impostoRenda = (salarioBruto * 0.225) - 636.13;
		} else {
			impostoRenda = (salarioBruto * 0.275) - 869.36;
		}
		
		if(salarioBruto <= 1693.72) {
			inss = salarioBruto * 0.08;
		} else if (salarioBruto <= 2822.90) {
			inss = salarioBruto * 0.09;	
		} else if (salarioBruto <= 5645.80) {
			inss = salarioBruto * 0.11;
		} else {
			inss = 621.03;
		}
		
		fgts = salarioBruto * 0.08;
		
		salarioLiquido = salarioBruto - impostoRenda - inss;
		
		return  "\nSalário bruto: " + salarioBruto +
				"\nImposto de renda: " + impostoRenda +
				"\nINSS: " + inss +
				"\nFGTS: " + fgts +
				"\nSalário Liquido: " + salarioLiquido +"\n";
	}

	public static ArrayList<FolhaDePagamento> listar() {
		return folhasPagamento;
	}
}
