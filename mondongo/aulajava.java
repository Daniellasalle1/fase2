package mondongo;

import java.util.Scanner;
import java.text.DecimalFormat;

public class aulajava {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		System.out.print("escreva um numero: ");
		double numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("o numero é par");
		}
		
		else {
			System.out.println("o numero é impar");
		}
	

	}
}





