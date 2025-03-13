package mondongo;

import java.util.Scanner;
import java.text.DecimalFormat;

public class q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		System.out.print("escreva um ano:");
		double ano = sc.nextInt();
		
		if(ano % 4 ==0) {
			if(ano % 100 == 0 && ano % 400 == 0) {
				System.out.println("é bissexto!!!");
			}
		}else {
			System.out.print("não é bissexto!!!");
		}
		
		
	

	}

}
