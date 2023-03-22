package arrays;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[100];
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<numeros.length;i++) {
			numeros[i] = (int)(Math.random()*21);
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
		System.out.println("El numero al que quieres cambiar");
		int num1 = teclado.nextInt();
		System.out.println("El numero que quieres cambiar");
		int num2 = teclado.nextInt();
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i] == num2) {
				numeros[i] = num1;
			}
			System.out.print(numeros[i] + " ");
		}
	}

}
