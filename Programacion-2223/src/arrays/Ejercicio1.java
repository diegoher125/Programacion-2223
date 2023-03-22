package arrays;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] nota = new double[3];
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<nota.length;i++) {
			System.out.println("Introduzca la nota del alumno " + (i+1));
			double notas = teclado.nextDouble();
			if(notas < 5) {
				nota[i] = 5;
			}else {
				nota[i] = notas;
			}
		}
		System.out.println("La primera nota es:" + nota[0]);
		System.out.println("La segunda nota es:" + nota[1]);
		System.out.println("La tercera nota es:" + nota[2]);
	}

}
