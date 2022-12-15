package lista1;

import java.util.Scanner;

public class Ex08AreaTriangulo {
	
public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		float base;
		float altura;
		float resultado;
		
		System.out.println("Digite a base do triângulo:");
		base = sc.nextInt();
		
		System.out.println("Digite a altura do triângulo:");
		altura = sc.nextInt();
		
		resultado = base * altura / 2;
		
		
		System.out.println("A área do triângulo equivale a: "+resultado);
		
		sc.close();
		
	}

}
