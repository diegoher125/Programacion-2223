package Strings;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introducir un texto");
		String cadena = teclado.nextLine();
		System.out.print(cadena.toUpperCase());
	}

}
