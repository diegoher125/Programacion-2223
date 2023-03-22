package Practicas;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

public class P7_2_HernandezPuga_Diego {
	
	private static int cantNum() {
		int cantidad = 0;
		while(cantidad < 5 || cantidad > 30) {
			cantidad = (int) (Math.random()*31);
		}
		return cantidad;
	}
	
	private static int random(){
		int num = (int) (Math.random()*101);
		return num;
	}
	
	private static void mostrarPantalla(ArrayList<Integer> numeros) {
		for(int i=0;i<numeros.size();i++) {
			System.out.print(numeros.get(i) + " ");
		}
	}
	
	private static int suma(ArrayList<Integer> numeros) {
		int total = 0;
		for(int numero: numeros) {
			total += numero;
		}
		return total;
	}
	
	private static double calcMedia(ArrayList<Integer> numeros) {
		return (suma(numeros)/numeros.size());
	}
	
	private static int calcMediana(ArrayList<Integer> numeros) {
		Collections.sort(numeros);
		int mediana;
		int mitad = numeros.size() / 2;
		if (numeros.size() % 2 == 0) {
		    mediana = (numeros.get(mitad - 1) + numeros.get(mitad)) / 2;
		} else {
		    mediana = numeros.get(mitad);
		}
		return mediana;
	}
	
	private static int[] paresImpares(ArrayList<Integer> numeros) {
		int contPares = 0;
		int contImpares = 0;
		for(int i=0;i<numeros.size();i++) {
			if((numeros.get(i)%2) == 0) {
				contPares++;
			}else {
				contImpares++;
			}
		}
		int[] parImpar = {contPares, contImpares};
		return parImpar;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#0.0");
		ArrayList<Integer> numeros = new ArrayList<>();
		int cantidad = cantNum();
		int contador = 0;
		int aleatorio = -1;
		while(contador < cantidad) {
			aleatorio = random();
			if(!numeros.contains(aleatorio)) {
				numeros.add(aleatorio);
				contador++;
			}
		}
		System.out.println("Se ha generado " + numeros.size() + " numeros");
		System.out.println("Los números generados son los siguientes:");
		mostrarPantalla(numeros);
		System.out.println();
		System.out.println("La suma es " + suma(numeros));
		System.out.println("La media es " + df.format(calcMedia(numeros)));
		System.out.println("El maximo es " + Collections.max(numeros));
		System.out.println("El minimo es " + Collections.min(numeros));
		System.out.println("La mediana es " + calcMediana(numeros));
		int[] parImpar = paresImpares(numeros);
		System.out.println("Hay " + parImpar[0] + " numeros pares");
		System.out.println("Hay " + parImpar[1] + " numeros impares");
		Collections.sort(numeros);
		Collections.reverse(numeros);
		mostrarPantalla(numeros);
		System.out.println();
		numeros.removeIf(n -> (n > 75) && (n%2)!=0);
		mostrarPantalla(numeros);
	}
}