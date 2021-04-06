import java.util.Scanner;

public class Exe03 
{
	
	public static void main(String[] args) 
	{
		
		int numero1, numero2;
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		numero1 = sc.nextInt();
		System.out.println("Informe o segundo número: ");
		numero2 = sc.nextInt();
		
		if(numero1 > numero2)
		{
			System.out.println("O  primeiro número é maior: " + numero1);
			System.out.println("O  segundo número é menor: " + numero2);
		}
		else if(numero2 > numero1)
		{
			System.out.println("O segundo número é maior: " + numero2);
			System.out.println("O primeiro número é menor: " + numero1);
		}
		else
		{
			System.out.println("Os dois números são iguais");
		}
	}
}
