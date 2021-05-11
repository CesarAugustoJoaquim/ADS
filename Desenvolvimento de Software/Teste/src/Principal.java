import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		LocalDate date1;
		LocalDate date2;
		String data;
		date1 = LocalDate.now();
		
		System.out.println("Digite a data");
		
		data = sc.nextLine();
		
		data = data.substring(6, 10) + "-" + data.substring(3, 5) + "-" + data.substring(0, 2);
		System.out.println(data);
		date2 = LocalDate.parse(data);
		
		System.out.println(date1.format(dataFormatter));  
	    System.out.println(date2.format(dataFormatter));  
	    System.out.println(date2.compareTo(date1)); 
		
//		LocalTime l1 = LocalTime.now();
//        LocalTime l2 = LocalTime.now().plusMinutes(5).plusSeconds(30);
//        int segundos =  (int) Duration.between(l1, l2).toSeconds();
//		int restoSegundos = segundos % 60;
//		int minutos = segundos / 60;
//		int restoMinutos = minutos % 60;
//		int horas = minutos / 60;
//		System.out.println(segundos);
//		System.out.println(restoSegundos);
//		System.out.println(minutos);
//		System.out.println(restoMinutos);
//		System.out.println(horas);
//		System.out.println("Tempo trabalhado: " + horas + ":" + restoMinutos + ":" + restoSegundos);
	}
}
