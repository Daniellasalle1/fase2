package mondongo;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		System.out.print("escreva um primeiro numero: ");
		double n1 = sc.nextInt();
		
		System.out.print("escreva um segundo numero: ");
		double n2 = sc.nextInt();
		
		System.out.print("escolha uma operação: (+ , - , * , /)");
		char op = sc.next().charAt(0);
		
		switch(op) {
		case '+':
			System.out.println("o resultado é: " + (n1 + n2));
			break;
		case '-':
			System.out.println("o resultado é: " + (n1 - n2));
			break;
		case '*':
			System.out.println("o resultado é: " + (n1 * n2));
			break;
		case '/':
			if(n2 == 0) {
				System.out.println("erro, não se divide por 0");
			}else {
				System.out.println("o resultado é: " + (n1 / n2));
			}
			
			default:
				System.out.println("voce deve se matar agora");
			
		}
		
		
		
		
		
	

	}

}
