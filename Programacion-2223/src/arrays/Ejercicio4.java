package arrays;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub ordenar pares-impares
		int[] numeros = new int[10];
		int[] numOrd = new int[10];
		int contador = 0;
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<numeros.length;i++) {
			numeros[i] = (int)(Math.random()*101);
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
		for(int i=0;i<numeros.length;i++) {
			if((numeros[i]%2) == 0) {
				numOrd[contador] = numeros[i];
				contador++;
			}
		}
		for(int i=0;i<numeros.length;i++) {
			if((numeros[i]%2) != 0) {
				numOrd[contador] = numeros[i];
				contador++;
			}
		}
		for(int i=0;i<numeros.length;i++) {
			System.out.print(numOrd[i] + " ");
		}
	}

}
