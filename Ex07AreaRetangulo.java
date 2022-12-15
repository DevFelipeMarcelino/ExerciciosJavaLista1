package lista1;

import java.util.Scanner;

public class Ex07AreaRetangulo {

public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int base;
		int altura;
		int resultado;
		
		System.out.println("Digite a base do retângulo:");
		base = sc.nextInt();
		
		System.out.println("Digite a altura do retângulo:");
		altura = sc.nextInt();
		
		resultado = base * altura;
		
		System.out.println("A área do retângulo equivale a: "+resultado);
		
		sc.close();
		
	}
}
