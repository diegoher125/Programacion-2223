package BucleWhile;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroAcertado =7;
		int numeroUser=0;
        while(numeroAcertado != numeroUser) {
    		Scanner teclado = new Scanner(System.in);
        	System.out.println("Dime un numero: ");
        	numeroUser = teclado.nextInt();
        }
        System.out.println("ADIOS");
	}

}
