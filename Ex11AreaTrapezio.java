package lista1;

import java.util.Scanner;

public class Ex11AreaTrapezio {
	
public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		float BaseMaior;
		float BaseMenor;
		float altura;
		float resultado;
		
		System.out.println("Sobre as dimensões do losango. Digite a base maior:");
		BaseMaior = sc.nextFloat();
		
		System.out.println("Sobre as dimensões do losango. Digite a base menor:");
		BaseMenor = sc.nextFloat();
		
		System.out.println("Sobre as dimensões do losango. Digite a altura:");
		altura = sc.nextFloat();
		
		resultado = BaseMaior + BaseMenor * altura / 2;
		
		
		System.out.println("A área do losango equivale a: "+resultado);
		
		sc.close();
		
	}

}
