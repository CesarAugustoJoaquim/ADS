import java.util.Scanner;

public class Exe03 
{
	
	public static void main(String[] args) 
	{
		
		int numero1, numero2;
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero: ");
		numero1 = sc.nextInt();
		System.out.println("Informe o segundo n�mero: ");
		numero2 = sc.nextInt();
		
		if(numero1 > numero2)
		{
			System.out.println("O  primeiro n�mero � maior: " + numero1);
			System.out.println("O  segundo n�mero � menor: " + numero2);
		}
		else if(numero2 > numero1)
		{
			System.out.println("O segundo n�mero � maior: " + numero2);
			System.out.println("O primeiro n�mero � menor: " + numero1);
		}
		else
		{
			System.out.println("Os dois n�meros s�o iguais");
		}
	}
}
