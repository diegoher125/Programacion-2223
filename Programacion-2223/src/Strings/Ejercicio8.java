package Strings;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introducir un texto");
		String cadena = teclado.nextLine();
		cadena = cadena.substring(cadena.lastIndexOf(" ") + 1) + cadena.substring(cadena.indexOf(" "), cadena.lastIndexOf(" ") +1) + cadena.substring(0, cadena.indexOf(" ") + 1);
		System.out.println(cadena);
	}

}
