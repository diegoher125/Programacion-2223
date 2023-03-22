package Strings;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introducir un texto");
		String cadena = teclado.nextLine();
		cadena = cadena.substring(cadena.indexOf("a") + 1, cadena.lastIndexOf("a"));
		System.out.println(cadena);
	}

}
