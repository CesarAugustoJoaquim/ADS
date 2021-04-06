import java.util.Scanner;

public class Exe04 
{
	
	public static void main(String[] args) 
	{
		
		int idade;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		idade = sc.nextInt();
		
		if(idade <= 13)
		{
			System.out.println("Criança!");
		}
		else if (idade <= 18)
		{
			System.out.println("Adolescente!");
		}
		else if (idade <= 60)
		{
			System.out.println("Adulto!");
		}
		else
		{
			System.out.println("Idoso!");
		}
	}
}
