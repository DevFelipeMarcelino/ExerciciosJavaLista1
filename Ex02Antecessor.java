package lista1;

import java.util.Scanner;

public class Ex02Antecessor {
	
public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor;
		int resultado;
		
		System.out.println("Digite um valor");
		valor = sc.nextInt();
		
		resultado = valor - 1;
		
		System.out.println("O sucessor do valor digitado será :"+resultado);
		
		sc.close();
		
	}

}
