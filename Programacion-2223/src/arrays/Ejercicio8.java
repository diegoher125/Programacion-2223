package arrays;

import java.util.Scanner;

public class Ejercicio8 {
	
	private static int numero = 0;
	
	private static Scanner teclado = new Scanner(System.in);
	
	private static void pedirNumero() {
		System.out.println("Introduzca un numero entre el 1 y el 26 o 30 para parar");
		numero = teclado.nextInt();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] abecedario = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		String palabra = ""; 
		String palabraCodificada = "";
		numero = 0;
		int cod2 = 0;
		int cod = (int)(Math.random()*27);
		do {
			pedirNumero();
			palabra += abecedario[numero - 1];
			
			if(((numero - 1) + cod) >= 27) {
				cod2 = ((numero - 1) + cod) - 26;
				palabraCodificada += abecedario[cod2];
			}else {
				palabraCodificada += abecedario[(numero - 1) + cod];
			}
			
		}while(numero != 30);
		System.out.println("La palabra es " + palabra);
		System.out.println("La palabra codificada es " + palabraCodificada);
	}

}
