package views;

import controles.ClienteControler;
import models.Cliente;

public class ListarCliente {

	public static void renderizar()
	{
		System.out.println(" ================================= \n Lista de clientes. \n ================================= \n");
		for (Cliente clienteCadastrado : ClienteControler.retornarClientes()) 
		{
			System.out.println(clienteCadastrado);
		}
	}
}
