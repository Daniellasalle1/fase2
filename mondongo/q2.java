package mondongo;


import java.util.Scanner;
import java.text.DecimalFormat;


public class q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");

		System.out.print("escreva sua idade: ");
		double idade = sc.nextInt();
		
		if(idade < 18) {
			System.out.println("MENOR DE IDADE!!!!");
		}else if(idade >= 18 && idade < 60) {
			System.out.println("ADULTO!!!");
		}else {
			System.out.println("IDOSO!!!");
		}
		
		
	

	}

}
