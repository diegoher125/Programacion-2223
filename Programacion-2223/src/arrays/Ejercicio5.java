package arrays;

import java.util.Scanner;

public class Ejercicio5 {
	
	private static void imprimeArray(int[] numeros) {
		for(int i=0;i<numeros.length;i++) {
			System.out.print(numeros[i] + " ");
		}
	}
	
	private static boolean esPrimo(int num) {
		if(num == 0 || num == 1 || num == 4) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[10];
		int[] numOrd = new int[10];
		int contador = 0;
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<numeros.length;i++) {
			numeros[i] = (int)(Math.random()*101);
		}
		imprimeArray(numeros);
		System.out.println();
		for(int i=0;i<numeros.length;i++) {
			if(esPrimo(numeros[i])) {
				numOrd[contador] = numeros[i];
				contador++;
			}
		}
		for(int i=0;i<numeros.length;i++) {
			if(!esPrimo(numeros[i])) {
				numOrd[contador] = numeros[i];
				contador++;
			}
		}
		imprimeArray(numOrd);
	}

}
