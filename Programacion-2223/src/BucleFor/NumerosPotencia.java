package BucleFor;

import java.util.Scanner;

public class NumerosPotencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el numero de la base ");
		int num1 = teclado.nextInt();
		System.out.print("Introduce el numero de la potencia ");
		int num2 = teclado.nextInt();
		int resultado = 1;
		for(int i=1;i<=num2;i++) {
			resultado = resultado * num1;
		}
		System.out.print("El resultado es: " + resultado);
	}
}