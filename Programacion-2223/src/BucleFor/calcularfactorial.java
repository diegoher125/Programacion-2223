package BucleFor;

import java.util.Scanner;

public class calcularfactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un numero");
		int num = teclado.nextInt();
		
		int factorial = 1;
		for(int i=1;i<=num;i++) {
			factorial = factorial * i;
		}
		System.out.println("El factorial de " + num + " es: " + factorial);
	}

}
