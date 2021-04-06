import java.util.Scanner;

public class Exe01 
{
	
	public static void main(String[] args) 
	{
		
		double altura, largura, area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a altura: ");
		altura = sc.nextDouble();
		System.out.println("Digite a largura: ");
		largura = sc.nextDouble();
		area = altura * largura;
		System.out.println("Área: " + area + "m2");		
		
	}
	
}
