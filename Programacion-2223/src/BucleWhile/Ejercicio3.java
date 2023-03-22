package BucleWhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int numeros =0;
        int total = 0;
        int veces=0;
        int media=0;
        while(total<= 10000) {
        	Scanner teclado = new Scanner(System.in);
			System.out.print("Introduce un numero ");
			numeros = teclado.nextInt();
			total += numeros;
			veces++;
        }
        System.out.print("El total es " + total + " ");
        System.out.print("El total de numeros sumados es " + veces + " ");
        media = total/veces;
        System.out.print("La media es " + media);
	}

}
