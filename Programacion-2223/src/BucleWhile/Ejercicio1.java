package BucleWhile;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = -1;
		while(numero <= 0) {
			Scanner teclado = new Scanner(System.in);
			System.out.print("Introduce un numero ");
			numero = teclado.nextInt();
		}
		System.out.print("Es positivo");
	}

}
