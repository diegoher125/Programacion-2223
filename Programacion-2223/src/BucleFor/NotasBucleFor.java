package BucleFor;

import java.util.Scanner;

public class NotasBucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el numero de alumnos ");
		int numAlumnos = teclado.nextInt();
		int aprobados = 0;
		int total = 0;
		int maxima = 0;
		int minima = 10;
		for(int i=0;i<numAlumnos;i++) {
			System.out.println("Dime la nota del alumno " + (i+1));
			int nota = teclado.nextInt();
			if(nota>=5) {
				aprobados++;
			}
			if(nota>maxima) {
				maxima=nota;
			}
			if(nota<minima) {
				minima=nota;
			}
			total+=nota;
		}
		System.out.println("La nota mas alta es " + maxima);
		System.out.println("La nota mas baja es " + minima);
		System.out.println("Los aprobados son " + aprobados);
		System.out.println("La media es " + (total/numAlumnos));
	}

}
