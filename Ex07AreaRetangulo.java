package lista1;

import java.util.Scanner;

public class Ex07AreaRetangulo {

public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int base;
		int altura;
		int resultado;
		
		System.out.println("Digite a base do ret�ngulo:");
		base = sc.nextInt();
		
		System.out.println("Digite a altura do ret�ngulo:");
		altura = sc.nextInt();
		
		resultado = base * altura;
		
		System.out.println("A �rea do ret�ngulo equivale a: "+resultado);
		
		sc.close();
		
	}
}
