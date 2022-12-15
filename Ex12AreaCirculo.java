package lista1;

import java.util.Scanner;

public class Ex12AreaCirculo {
	
public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		float raio;
		float pi = 3.14f;
		float resultado;
		
		System.out.println("Digite o raio do circulo:");
		raio = sc.nextFloat();
		
		resultado = pi * (raio * raio);
		
		System.out.println("A área do circulo equivale a: "+resultado);
		
		sc.close();
		
	}

}
