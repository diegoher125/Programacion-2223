package Practicas;

import java.util.ArrayList;
import java.util.Scanner;

public class P7_1_HernandezPuga_Diego {
	
	private static boolean esValido(ArrayList<String> nombres, String nNombre) {
		if(nombres.contains(nNombre)) {
			System.out.println("Error!! Ese nombre ya existe");
			return false;
		}else {
			return true;
		}
	}
	
	private static String nuevoNombre(ArrayList<String> nombres) {
		Scanner teclado = new Scanner(System.in);
		String nNombre = "";
		do{
			nNombre = teclado.nextLine();
		}while(!esValido(nombres, nNombre));
		return nNombre;
	}
	
	private static void imprimirPantalla(ArrayList<String> nombres) {
		int contador = 0;
		for(String nombre: nombres) {
			contador++;
			System.out.println("Alumno " + contador + ": " + nombre);
		}
	}
	
	private static String[] largo(ArrayList<String> nombres) {
		String[] mayMen = new String[2];
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		for(String nombre: nombres) {
			if(nombre.length() > mayor) {
				mayor = nombre.length();
				mayMen[0] = nombre;
			}
			if(nombre.length() < menor) {
				menor = nombre.length();
				mayMen[1] = nombre;
			}
		}
		return mayMen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("DAVID");
		nombres.add("MARIA");
		nombres.add("ALFREDO");
		nombres.add("CARLOS");
		nombres.add("ANA");
		nombres.add("SOFIA");
		System.out.println("Bienvenidp!!");
		System.out.println("Nuestros nombres son los siguientes:");
		imprimirPantalla(nombres);
		System.out.println("Introduzca nuevos nombres:");
		boolean cero = false;
		while(!cero) {
			String nombre = nuevoNombre(nombres);
			nombre.toUpperCase();
			if(nombre.equalsIgnoreCase("0")) {
				cero = true;
			}else {
				nombres.add(nombre);
			}
		}
		String[] mayMen = largo(nombres);
		System.out.println("El nombre más largo es " + mayMen[0] + " con " +
		                    mayMen[0].length() + " letras");
		System.out.println("El nombre más corto es " + mayMen[1] + " con " +
                mayMen[1].length() + " letras");
		nombres.removeIf(n -> (n.startsWith("/[aeiouAEIOU]{1}*")));
		imprimirPantalla(nombres);
	}
}