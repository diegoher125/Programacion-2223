package Strings;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introducir un texto");
		String cadena = teclado.nextLine();	
		for(int i=0;i<cadena.length();i++) {
			System.out.println(cadena.charAt(i));
		}
	}

}
