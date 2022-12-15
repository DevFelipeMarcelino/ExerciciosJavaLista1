package lista1;

import java.util.Scanner;

public class Ex06Divisao {
	
public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1;
		int valor2;
		int resultado;
		
		System.out.println("Digite um valor");
		valor1 = sc.nextInt();
		
		System.out.println("Digite outro valor");
		valor2 = sc.nextInt();
		
		resultado = valor1 / valor2;
		
		System.out.println("A divisão entre esses valores equivale a: "+resultado);
		
		sc.close();
		
	}

}
