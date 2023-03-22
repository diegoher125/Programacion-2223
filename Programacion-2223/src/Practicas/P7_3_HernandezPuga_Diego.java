package Practicas;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class P7_3_HernandezPuga_Diego {
	
	private static boolean esValido(HashMap<String, Double> sm, String cadena) {
		if(sm.containsKey(cadena)) {
			return false;
		}else {
			return true;
		}
	}
	
	private static String introducirProducto(HashMap<String, Double> sm){
		Scanner teclado = new Scanner(System.in);
		String nProduc = "";
		boolean valido;
		System.out.println("Introduzca un producto:");
		do{
			nProduc = teclado.nextLine();
			valido = esValido(sm, nProduc);
			if(!valido) {
				System.out.println("Error!!");
			}
		}while(!valido);
		return nProduc;
	}
	
	private static double introducirPrecio(HashMap<String, Double> sm) {
		Scanner teclado = new Scanner(System.in);
		double precio = 0;
		System.out.println("Introduzca un precio:");
		while(!teclado.hasNext()) {
			precio = teclado.nextDouble();
		}
		return precio;
	}
	
	private static String introducirProductoBorrar(HashMap<String, Double> sm){
		Scanner teclado = new Scanner(System.in);
		String borrar = "";
		boolean valido;
		System.out.println("Introduzca el producto a borrar:");
		do{
			borrar = teclado.nextLine();
			valido = esValido(sm, borrar);
			if(valido) {
				System.out.println("Error!!");
			}
		}while(valido);
		return borrar;
	}
	
	private static int cantidadProducMasPrecio(HashMap<String, Double> sm, double precio) {
		int cantidad = 0;
		for(double precioProduc: sm.values()) {
			if(precioProduc > precio) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#0.00");
		Scanner teclado = new Scanner(System.in);
		HashMap<String, Double> sm = new HashMap<String, Double>();
		sm.put("vino" , 7.89);
		sm.put("donuts" , 2.25);
		sm.put("alcachofa" , 2.39);
		System.out.println("Bienvenidp!!");
		boolean cero = false;
		while(!cero) {
			String produc = introducirProducto(sm);
			produc.toLowerCase();
			
			if(produc.equalsIgnoreCase("0")) {
				cero = true;
			}else {
				double precio = introducirPrecio(sm);
				sm.put(produc, precio);
			}
		}
		cero = false;
		while(!cero) {
			String producBorrar = introducirProductoBorrar(sm);
			producBorrar.toLowerCase();
			if(producBorrar.equalsIgnoreCase("0")) {
				cero = true;
			}else {
				sm.remove(producBorrar);
			}
		}
		cero = false;
		while(!cero) {
			double precio = 0;
			System.out.println("Introduzca la prcio para mirar productos con precio superior");
			while(!teclado.hasNext()) {
				precio = teclado.nextDouble();
			}
			int mirarPrecio = cantidadProducMasPrecio(sm, precio);
			if(mirarPrecio == -1) {
				cero = true;
			}else {
				System.out.println("La cantidad de productos de mas de " + df.format(precio) + "€ es " + mirarPrecio);
			}
		}
	}
}