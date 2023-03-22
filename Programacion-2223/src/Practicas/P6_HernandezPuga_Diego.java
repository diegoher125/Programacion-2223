package Practicas;

import java.util.Scanner;

public class P6_HernandezPuga_Diego {
	
	private static Scanner teclado = new Scanner(System.in);
	
	private static double caja = 0;
	
	private static int pedirMenu() {
		int tipoMenu = 0;
		System.out.println("Menu corto: 180€ por comensal -- Tipo 1");
		System.out.println("Menu largo: 275€ por comensal -- Tipo 2");
		while(tipoMenu <= 0 || tipoMenu > 2) {
			System.out.println("Elige el tipo de menu");
			tipoMenu = teclado.nextInt();
		}
		return tipoMenu;
	}
	
	private static int queHacer() {
		int hacer = 0;
		System.out.println("Indique que desea hacer:");
		System.out.println("1. Agregar comensales");
		System.out.println("2. Terminar mesa");
		System.out.println("3. Ver restaurante");
		System.out.println("4. Cerrarrestaurante");
		while(hacer < 1 || hacer > 4) {
			hacer = teclado.nextInt();
		}
		return hacer;
	}
	
	private static void imprimirMesas(int[] mesas, int[] numComen, int[] menu) {
		System.out.println("Este es el estado de nuestras mesas:");
		System.out.println("----------------------------------------------------");
		System.out.print("| Mesa no | ");
		for(int i=0;i<mesas.length;i++) {
			System.out.print(mesas[i] + " | ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.print("| Ocupacion| ");
		for(int i=0;i<mesas.length;i++) {
			System.out.print(numComen[i] + " | ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.print("| Tipo menu| ");
		for(int i=0;i<mesas.length;i++) {
			System.out.print(menu[i] + " | ");
		}
		System.out.println();
		System.out.println("----------------------------------------------------");
	}
	
	private static int[] agregarComensales(int[] mesas, int[] numComen, int[] menu) {
		int numero = 0;
		System.out.println("Digame el numero de comensales:");
		numero = teclado.nextInt();
		while(numero < 1 || numero > 4) {
			System.out.println("Error! Digame el numero de comensales:");
			numero = teclado.nextInt();
		}
		for(int i=0;i<mesas.length;i++) {
			
		}
		return numComen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido a el restaurante EuropaXO!!");
		int[] mesas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] numComen = new int[10];
		int[] menu = new int[10];
		int hacer = 0;
		imprimirMesas(mesas, numComen, menu);
		System.out.println();
		while(hacer != 4) {
			hacer = queHacer();
			switch(hacer) {
				case 1:
					numComen = agregarComensales(mesas, numComen, menu);
					
				break;
				case 2:
				break;
				case 3:
					imprimirMesas(mesas, numComen, menu);
				break;
			}
		}
	}

}
