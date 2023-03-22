package BucleWhile;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int nota=99;
		while(nota < 0 || nota > 10) {
			Scanner teclado = new Scanner(System.in);
			System.out.print("Introduce una nota ");
			nota = teclado.nextInt();
		}
		System.out.print("Tu nota es: " + nota);
	}
}