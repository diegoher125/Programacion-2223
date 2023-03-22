package Strings;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introducir un texto");
		String cadena = teclado.nextLine();
		for(int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i) == ' ') {
			}else if(cadena.charAt(i) != ' ') {
				System.out.print(cadena.charAt(i));
			}else {
				
			}
		}
		System.out.println();
		String cadena2 = cadena.replace(" ", "") ;
		System.out.print(cadena2);
	}

}
