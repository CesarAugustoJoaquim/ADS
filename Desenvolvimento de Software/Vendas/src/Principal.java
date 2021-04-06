import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal 
{

	public static void main(String[] args) 
	{
		
		int opcao;
		Scanner sc = new Scanner(System.in);
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		do
		{
			
			System.out.println("===================================="
							+ "\n| 1 - Cadastrar cliente.           |"
							+ "\n| 2 - Lista de clientes.           |"
							+ "\n| 3 - Cadastrar vendedor.          |"
							+ "\n| 4 - Lista de vendedores.         |"
							+ "\n| 5 - Cadastrar produto.           |"
							+ "\n| 6 - Lista de produtos.           |"
							+ "\n| 7 - Registrar venda.             |"
							+ "\n| 8 - Lista de vendas.             |"
							+ "\n| 9 - Lista de vendas por cliente. |"
							+ "\n| 0 - Sair.                        |"
							+ "\n==================================== \n"
							+ "\n Digite a opção dejeda: ");
			
			opcao = sc.nextInt();
			
			switch (opcao) 
			{
			
				case 1: 
				{
					Cliente cliente = new Cliente();
					System.out.println(" ================================= \n Cadastrar clientes. \n ================================= \n");
					System.out.println("Digite o nome do cliente: ");
					cliente.setNome(sc.nextLine());
					System.out.println("Digite o CPF do cliente");
					cliente.setCpf(sc.nextLine());
//					for (int i = 0; i < clientes.size(); i++) 
//					{
//						if(cliente.getCpf() == clientes.set(i, cliente.getCpf()))
//						{
//							System.out.println("O CPF já foi cadastrado");
//							break;
//						}
//					}
					clientes.add(cliente);
					System.out.println("Cliente cadastrado com sucesso!");
					break;
				}
				case 2:
				{
					System.out.println(" ================================= \n Lista de clientes. \n ================================= \n");
//					System.out.println(clientes);
					for (int i = 0; i < clientes.size(); i++) 
					{
						System.out.println(clientes.get(i));
					}
					break;
				}
				case 3:
				{
					System.out.println(" ================================= \n Cadastrar vendedores. \n ================================= \n");
					break;
				}
				case 4:
				{
					System.out.println(" ================================= \n Lista de vendedores. \n ================================= \n");
					break;
				}
				case 5:
				{
					System.out.println(" ================================= \n Cadastrar produto. \n ================================= \n");
					break;
				}
				case 6:
				{
					System.out.println(" ================================= \n Lista de produtos. \n ================================= \n");
					break;
				}
				case 7:
				{
					System.out.println(" ================================= \n Registrar venda. \n ================================= \n");
					break;
				}
				case 8:
				{
					System.out.println(" ================================= \n Lista de vendas. \n ================================= \n");
					break;
				}
				case 9:
				{
					System.out.println(" ================================= \n Lista de vendas por cliente. \n ================================= \n");
					break;
				}
				case 0:
				{
					System.out.println(" ================================= \n Saindo...  \n ================================= \n");
					break;
				}
				default:
				{
					System.out.println(" ================================= \n Opção invalida. \n ================================= \n");
					break;
				}
			
			}
			
		}while(opcao != 0);

	}

}
