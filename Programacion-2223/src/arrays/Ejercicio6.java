package arrays;

import java.util.Scanner;

public class Ejercicio6 {
	
	private static void imprimeArray(String[] nombres) {
		for(int i=0;i<nombres.length;i++) {
			System.out.print(nombres[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres = new String[9];
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<nombres.length;i++) {
			System.out.println("Escribe un nombre");
			nombres[i] = teclado.nextLine();
		}
		imprimeArray(nombres);
		
	}

}
