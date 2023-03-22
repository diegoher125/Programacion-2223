package metodos;

import java.util.Scanner;

public class primoSiNo {
	
	
	private static boolean esPrimo(int numero) {
		
		for (int i=2;i<numero;i++) {
			if (numero%i==0) {
				return false;
			}
		  }
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el numero que quieres saber si es primo o no");
		int num = teclado.nextInt();
		if (esPrimo(num)) {
		System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}
		for (int i=3;i<=3000;i++) {
			if (esPrimo(i)) {
				System.out.println(i + " es primo");
			}
		}
	}

}
