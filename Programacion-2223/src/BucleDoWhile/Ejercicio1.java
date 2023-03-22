package BucleDoWhile;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int menu = 5;
		do {
			System.out.print("Elige una opcion: ");
			menu = teclado.nextInt();
			int num1 = 0, num2 = 0;
			if(menu >= 1 && menu <= 4) {
				System.out.println("Dime el primero ");
				num1 = teclado.nextInt();
				System.out.println("Dime el segundo ");
				num2 = teclado.nextInt();
			}
			int resultado = 0;
			switch(menu) {
			    case 1:
			    	resultado = num1 + num2;
			    case 2:
			    	resultado = num1 - num2;
			    case 3:
			    	resultado = num1 * num2;
			    case 4:
			    	resultado = num1 / num2;
			    case 5:
			    	System.out.println("Adios ");
			    break;
			    default:
			    	System.out.println("ERROR ");
			    break;
			}
			System.out.println(" " + resultado);
		}while(menu!=5);
		
	}

}
