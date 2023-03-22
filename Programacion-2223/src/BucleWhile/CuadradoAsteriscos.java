package BucleWhile;

import java.util.Scanner;

public class CuadradoAsteriscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el lado ");
		int size = teclado.nextInt();
        for(int i=0;i<size;i++) {
        	for(int j=0;j<size;j++) {
        		System.out.print("* ");
        	}
         	System.out.println();
        }
		System.out.println();
		System.out.println("Introduce el ancho ");
        int ancho = teclado.nextInt();
        System.out.println("Introduce el alto ");
        int alto = teclado.nextInt();
        for(int i=0;i<alto;i++) {
        	for(int j=0;j<ancho;j++) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }
	}

}
