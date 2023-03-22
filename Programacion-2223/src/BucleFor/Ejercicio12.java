package BucleFor;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el numero menor ");
        int rangoMenor=8;
        int rangoMayor=77;
        if(rangoMenor<rangoMayor) {
        	int primerMultiplo=3;
        	int segundoMultiplo=5;
        	int contador =0;
        for(int i=rangoMenor;i<=rangoMayor;i++) {
        	if(i%primerMultiplo == 0 && i%segundoMultiplo == 0) {
        	System.out.println(i);
        	contador++;
        }
        }
        System.out.println("Ha habido " + contador + " numeros");
        }else {
        	System.out.println("ERROR");
        }
	}

}
