package primeros;
import java.util.Scanner;

public class MayorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner teclado = new Scanner(System.in);
	    System.out.print("Introducir el num1");
		int num1 = teclado.nextByte();
		System.out.print("Introducir el num2");
		int num2 = teclado.nextByte();
		System.out.print("Introducir el num3");
		int num3 = teclado.nextByte();
		
		if (num1>num2 && num1>num3) {
		    System.out.println("El mayor es el 1");
		} else if (num2>num3) {
			System.out.println("El mayor es el 2");
		} else {
			System.out.println("El mayor es el 3");
		} 
		if (num1<num2 && num1<num3) {
		    System.out.println("El menor es el 1");
		} else if (num2<num3) {
			System.out.println("El menor es el 2");
		} else {
			System.out.println("El menor es el 3");
		}
 	}

}
