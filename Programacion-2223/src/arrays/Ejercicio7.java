package arrays;

import java.util.Scanner;

public class Ejercicio7 {
	
	private static int fallos = 0;
	
	private static Scanner teclado = new Scanner(System.in);
	
	private static void imprimeArray(String[] palabra) {
		for(int i=0;i<palabra.length;i++) {
			System.out.print(palabra[i] + " ");
		}
		System.out.println();
	}
	
	private static void ahorcado(String palabra, String[] palabraAcertada) {
		String letra = "";
		while(letra == "" || letra.length() > 1) {
			System.out.println("Escribe una letra");
			letra = teclado.nextLine();
		}
		if(palabra.contains(letra)) {
			for(int i=0;i<palabra.length();i++) {
				if(palabra.charAt(i) == letra.charAt(0)) {
					palabraAcertada[i] = "" + palabra.charAt(i);
				}
			}
		}else {
			fallos++;
			intentos();
		}
		
	}
	
	private static void intentos() {
		if(fallos == 1) {
			System.out.println("     ____________    ");
			System.out.println("     ||        ||    ");
			System.out.println("     ||              ");
			System.out.println("     ||              ");
			System.out.println("     ||              ");
		    System.out.println("     ||              ");
			System.out.println("     ||              ");
			System.out.println("     ||              ");
			System.out.println("     ||              ");
			System.out.println("_____||_________     ");
		}else if(fallos == 2) {
			System.out.println("     ____________    ");
			System.out.println("     ||        ||    ");
			System.out.println("     ||       (··)   ");
			System.out.println("     ||              ");
			System.out.println("     ||              ");
		    System.out.println("     ||              ");
			System.out.println("     ||        	     ");
			System.out.println("     ||              ");
			System.out.println("     ||              ");
			System.out.println("_____||_________     ");
		}else if(fallos == 3) {
			System.out.println("     ____________    ");
			System.out.println("     ||        ||    ");
			System.out.println("     ||       (··)   ");
			System.out.println("     ||       //\\\\ ");
			System.out.println("     ||      //  \\\\");
		    System.out.println("     ||              ");
			System.out.println("     ||              ");
			System.out.println("     ||              ");
			System.out.println("     ||              ");
			System.out.println("_____||_________     ");
		}else if(fallos == 4) {
			System.out.println("     ____________    ");
			System.out.println("     ||        ||    ");
			System.out.println("     ||       (··)   ");
			System.out.println("     ||       //\\\\ ");
			System.out.println("     ||      //||\\\\");
		    System.out.println("     ||        ||    ");
			System.out.println("     ||              ");
			System.out.println("     ||              ");
			System.out.println("     ||              ");
			System.out.println("_____||_________     ");
		}else if(fallos == 5) {
			System.out.println("     ____________    ");
			System.out.println("     ||        ||    ");
			System.out.println("     ||       (··)   ");
			System.out.println("     ||       //\\\\ ");
			System.out.println("     ||      //||\\\\");
		    System.out.println("     ||        ||    ");
			System.out.println("     ||       //\\\\ ");
			System.out.println("     ||      //  \\\\");
			System.out.println("     ||              ");
			System.out.println("_____||_________     ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Escriba la palabra a adivinar");
		String palabra = teclado.nextLine();
		String[] palabraAcertada = new String[palabra.length()];
		for(int i=0;i<palabra.length();i++) {
			palabraAcertada[i] = "_";
		}
		while(fallos < 5) {
			ahorcado(palabra, palabraAcertada);
			imprimeArray(palabraAcertada);
		}
		System.out.println("LA palabra era: " + palabra);
	}

}
