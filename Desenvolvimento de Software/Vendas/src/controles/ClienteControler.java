package controles;

import java.util.ArrayList;
import models.Cliente;

public class ClienteControler
{
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public void cadastrar() 
	{
		
	}
	
	public static ArrayList<Cliente> retornarClientes()
	{
		return clientes;
	}
}
