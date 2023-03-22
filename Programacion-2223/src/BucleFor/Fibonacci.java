package BucleFor;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner teclado = new Scanner(System.in);
        System.out.print("Los numeros de la sucesion de Fibonacci ");
        int num = teclado.nextInt();
        int fibo1 = 0;
        int fibo2 = 1;
        System.out.println("0 " + "1 " +"1 "+"2 ");
        for(int i=0;i<num-4;i++) {
        	fibo1 = fibo1 + fibo2;
        	fibo2 = fibo1 + fibo2;
        	System.out.print(" " + fibo1 + fibo2);
        }
	}

}
