package ArrayListEjercicios;

import java.util.ArrayList;
import java.util.Collections;

public class Ej2 {
	
	private static int cantNum() {
		int cantidad = 0;
		while(cantidad < 10 || cantidad > 20) {
			cantidad = (int) (Math.random()*21);
		}
		return cantidad;
	}
	
	private static int random(){
		int num = (int) (Math.random()*51);
		return num;
	}
	
	private static void mostrarPantalla(ArrayList<Integer> numeros) {
		for(int i=0;i<numeros.size();i++) {
			System.out.print(numeros.get(i) + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<>();
		int cantidad = cantNum();
		int contador = 0;
		int aleatorio = -1;
		while(contador <= cantidad) {
			aleatorio = random();
			if(!numeros.contains(aleatorio)) {
				numeros.add(aleatorio);
				contador++;
			}
		}
		mostrarPantalla(numeros);
		System.out.println();
		Collections.sort(numeros);
		mostrarPantalla(numeros);
		System.out.println();
		System.out.println("Menor: " + numeros.get(0) + ". Mayor: " + numeros.get((numeros.size())-1) + ".");
	}

}
