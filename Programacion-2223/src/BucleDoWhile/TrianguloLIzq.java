package BucleDoWhile;

import java.util.Scanner;

public class TrianguloLIzq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el lado ");
		int size = teclado.nextInt();
        for(int i=0;i<size;i++) {
        	for(int j=0;j<=i;j++) {
        		System.out.print("* ");
        	}
         	System.out.println();
        }
	}

}
