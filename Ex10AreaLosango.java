package lista1;

import java.util.Scanner;

public class Ex10AreaLosango {
	
public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		float DiagonalMaior;
		float DiagonalMenor;
		float resultado;
		
		System.out.println("Sobre as dimensões do losango. Digite a diagonal maior:");
		DiagonalMaior = sc.nextFloat();
		
		System.out.println("Sobre as dimensões do losango. Digite a diagonal menor:");
		DiagonalMenor = sc.nextFloat();
		
		resultado = DiagonalMaior * DiagonalMenor / 2;
		
		
		System.out.println("A área do losango equivale a: "+resultado);
		
		sc.close();
		
	}

}
