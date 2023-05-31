package Practicas;

import java.util.Scanner;

public class P6_HernandezPuga_Diego {
	
	private static double caja = 0;
	
	private static int pedirInt() {
		Scanner teclado = new Scanner(System.in);
		while (!teclado.hasNextInt()) {
			teclado.next();
			System.out.println("Dato no valido");
		}
		return teclado.nextInt();
	}
	
	private static String pedirString() {
		Scanner teclado = new Scanner(System.in);
		while (!teclado.hasNextLine()) {
			teclado.next();
			System.out.println("Dato no valido");
		}
		return teclado.nextLine();
	}
	
	private static String pedirCupon() {
		System.out.println("Digame su cupon de descuento (vacio si no tiene)");
		return pedirString();
	}
	
	private static boolean esCuponValido(String cupon) {
		if(cupon.equals("Navidad22")) {
			return true;
		}else {
			return false;
		}
	}
	
	private static int[] cerrarMesa(int[] numComen, int[] menu, int mesa) {
		if(esCuponValido(pedirCupon())) {
			caja += numComen[mesa] * (precioMenu(menu[mesa]) * 0.8);
		}else {
			caja += numComen[mesa] * precioMenu(menu[mesa]);
		}
		numComen[mesa] = 0;
		return numComen;
	}
	
	private static double precioMenu(int tipoMenu) {
		if(tipoMenu == 1) {
			return 180.0;
		}else {
			return 275.0;
		}
	}
	
	private static int pedirMenu() {
		int tipoMenu = 0;
		System.out.println("Menu corto: 180€ por comensal -- Tipo 1");
		System.out.println("Menu largo: 275€ por comensal -- Tipo 2");
		while(tipoMenu <= 0 || tipoMenu > 2) {
			System.out.println("Elige el tipo de menu");
			tipoMenu = pedirInt();
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
			hacer = pedirInt();
		}
		return hacer;
	}
	
	private static void imprimirMesas(int[] mesas, int[] numComen, int[] menu) {
		System.out.println("Este es el estado de nuestras mesas:");
		System.out.println("----------------------------------------------------");
		System.out.print("| Mesa no | ");
		imprimirArray(mesas);
		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.print("| Ocupacion| ");
		imprimirArray(numComen);
		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.print("| Tipo menu| ");
		imprimirArray(menu);
		System.out.println();
		System.out.println("----------------------------------------------------\n");
	}
	
	private static void imprimirArray(int[] lista) {
		for(int i:lista) {
			System.out.print(i + " | ");
		}
	}
	
	private static int[] agregarComensales(int[] numComen, int primeraMesa) {
		int numero = 0;
		System.out.println("Digame el numero de comensales:");
		do {
			numero = pedirInt();
			if(numero < 1 || numero > 4) {
				System.out.println("Error! Digame el numero de comensales:");
			}
		}while(numero < 1 || numero > 4);
		numComen[primeraMesa] = numero;
		return numComen;
	}
	
	private static int primeraMesaLibre(int[] numComen) {
		int cont = -1;
		boolean primeraEscogida = false;
		do {
			cont++;
			if(numComen[cont] == 0) {
				primeraEscogida = true;
			}
		}while(!primeraEscogida);
		return cont;
	}
	
	private static void menuPrincipal(int[] mesas, int[] numComen, int[] menu) {
		System.out.println("Bienvenido a el restaurante EuropaXO!!");
		int hacer = 0;
		imprimirMesas(mesas, numComen, menu);
		while(hacer != 4) {
			hacer = queHacer();
			switch(hacer) {
				case 1:
					int primeraMesa = primeraMesaLibre(numComen);
					numComen = agregarComensales(numComen,primeraMesa);
					menu[primeraMesa] = pedirMenu();
				break;
				case 2:
					int mesaCerrar = mesaACerrar();
					numComen = cerrarMesa(numComen, menu, mesaCerrar);
					menu[mesaCerrar] = 0;
				break;
				case 3:
					imprimirMesas(mesas, numComen, menu);
				break;
				case 4:
					calcularCaja(numComen, menu);
					numComen = cerrarMesas(numComen);
					menu = cerrarMesas(menu);
					System.out.println("Hemos hecho una caja de: " + caja + "€\nAdios!!");
					break;
			}
		}
	}
	
	private static int[] cerrarMesas(int[] lista) {
		for(int i:lista) {
			i = 0;
		}
		return lista;
	}
	
	private static void calcularCaja(int[] numComen, int[] menu) {
		for(int i=0;i<numComen.length;i++) {
			caja += numComen[i] * precioMenu(menu[i]);
		}
	}
	
	private static int mesaACerrar() {
		int numero = 0;
		do {
			System.out.println("Introduzca la mesa a cerrar");
			numero = pedirInt();
			numero--;
		}while(numero < 0 || numero > 9);
		return numero;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] mesas = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] numComen = {3,2,0,2,4,1,0,2,1,1};
		int[] menu = {1,1,0,2,2,1,0,1,1,1};
		menuPrincipal(mesas, numComen, menu);
	}

}
