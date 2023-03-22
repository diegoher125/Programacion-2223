package arrays;

import java.util.Scanner;
import java.io.IOException;

public class Ejercicio9 {
	
	private static int dni = 0;
	
	private static char dniLetra = ' ';
	
	private static Scanner teclado = new Scanner(System.in);
	
	private static void pedirDni() throws IOException {
		while(dni >= 100000000 || dni < 1) {
			System.out.println("Introduzca el numero de su DNI");
			dni = teclado.nextInt();
		}
		while(!Character.isLetter(dniLetra)) {
			System.out.println("Introduzca la letra de su DNI");
			dniLetra = (char)System.in.read();
		}
	}
	
	private static void letraCorrecta() {
		int resto = dni % 23;
		char[] letraCorrecDni = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		if(letraCorrecDni[resto] == dniLetra) {
			System.out.println("¡Ese DNI es correcto!");
		}else {
			System.out.println("¡Ese DNI no es correcto!");
			System.out.println("La letra corecta seria " + letraCorrecDni[resto]);
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char seguir = ' ';
		System.out.println("Bienvenido!!");
		pedirDni();
		letraCorrecta();
		do {
			while(seguir != 's' || seguir != 'n' || seguir != 'S' || seguir != 'N') {
				System.out.println("¿Desea introducir otro DNI? S/N");
				seguir = (char)System.in.read();
			}
			pedirDni();
			letraCorrecta();
		}while(seguir != 'n' || seguir != 'N');
	}

}
