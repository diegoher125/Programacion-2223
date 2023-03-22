package ArrayListEjercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej1 {
	
	private static int suma(ArrayList<Integer> numeros) {
		int total = 0;
		for(int i=0;i<numeros.size();i++) {
			total += numeros.get(i);
		}
		return total;
	}
	
	private static int[] pares(ArrayList<Integer> numeros) {
		int contPares = 0;
		int contImpares = 0;
		for(int i=0;i<numeros.size();i++) {
			if((numeros.get(i)%2) == 0) {
				contPares++;
			}else {
				contImpares++;
			}
		}
		int[] parImpar = {contPares, contImpares};
		return parImpar;
	}
	
	private static int[] mayorMenor(ArrayList<Integer> numeros) {
		int[] mayMen = new int[2];
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		for(int i=0;i<numeros.size();i++) {
			if((numeros.get(i)) > mayor) {
				mayor = numeros.get(i);
				mayMen[0] = numeros.get(i);
			}
			if((numeros.get(i)) < menor) {
				menor = numeros.get(i);
				mayMen[1] = numeros.get(i);
			}
		}
		return mayMen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		do {
			System.out.println("Introduzca un numero");
			numeros.add(teclado.nextInt());
		}while(!numeros.contains(-1));
		int total = suma(numeros);
		System.out.println(total);
		int[] parImpar = pares(numeros);
		System.out.println("Pares: " + parImpar[0] + ". Impares: " + parImpar[1] + ".");
		int[] mayMen = mayorMenor(numeros);
		System.out.println("Mayor: " + mayMen[0] + ". Menor: " + mayMen[1] + ".");
	}

}
