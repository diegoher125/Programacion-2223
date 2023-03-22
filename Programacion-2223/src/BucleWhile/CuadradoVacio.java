package BucleWhile;

import java.util.Scanner;

public class CuadradoVacio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el lado del cuadrado ");
		int size = teclado.nextInt();
        for(int i=0;i<size;i++) {
        	for(int j=0;j<size;j++) {
        		if(i>0 && i<(size-1) && j>0 && j<(size-1) ) {
        			System.out.print("  ");
        		}else {
        			System.out.print("* ");
        		}
        		
        	}
         	System.out.println();
        }
        System.out.println();
        System.out.println("Introduce el ancho del rectangulo ");
        int ancho = teclado.nextInt();
        System.out.println("Introduce el alto del rectangulo ");
        int alto = teclado.nextInt();
        for(int i=0;i<alto;i++) {
        	for(int j=0;j<ancho;j++) {
        		if(i>0 && i<(alto-1) && j>0 && j<(ancho-1) ) {
        			System.out.print("  ");
        		}else {
        			System.out.print("* ");
        		}	
        		
        }
        	System.out.println();
	}
	}
}
