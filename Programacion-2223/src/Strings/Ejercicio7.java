package Strings;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introducir un texto");
		String cadena = teclado.nextLine();
		cadena = cadena.substring(0, 1).toUpperCase() + cadena.substring(1);
		System.out.println(cadena);
	}

}
