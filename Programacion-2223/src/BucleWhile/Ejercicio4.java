package BucleWhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int numAcertado = (int)(Math.random()*10+1);
        System.out.println("El numero es " + numAcertado);
        
        int veces = 1;
        int numero = 0;
        while(numero != numAcertado && veces <=3) {
        	Scanner teclado = new Scanner(System.in);
			System.out.print("Introduce un numero entre 1 y 10. ");
			numero = teclado.nextInt();
			
			if(numero<numAcertado  && veces<=3) {
				System.out.print("El numero que buscas es mayor al que has puesto. ");
			}else if(numero>numAcertado  && veces<=3) {
				System.out.print("El numero que buscas es menor al que has puesto. ");
			}else if(numero==numAcertado && veces<=4){
				System.out.print("Has acertado. ");
            }else{
			    
		    }
			veces++;
        }
        System.out.print("Adios. ");
	}
}
