package BucleDoWhile;

import java.util.Scanner;

public class TrianguloLDrcInvertido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el lado ");
		int size = teclado.nextInt();
        for(int i=0;i<size;i++) {
        	for(int k=0;k<size-i;k++) {
        		System.out.print("  ");
        	}
        	for(int j=0;j<size-(size-i-1);j++) {
        		System.out.print("* ");
        	}
         	System.out.println();
        }
	}

}
