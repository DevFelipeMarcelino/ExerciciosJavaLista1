package lista1;

import java.util.Scanner;

public class Ex09AreaQuadrado {

public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int lado;
		int resultado;
		
		System.out.println("Digite as dimens�es do quadrado:");
		lado = sc.nextInt();
		
		resultado = lado * lado;
		
		
		System.out.println("A �rea do quadrado equivale a: "+resultado);	
		
		sc.close();
		
	}
}
