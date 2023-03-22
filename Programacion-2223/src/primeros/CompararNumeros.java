package primeros;


import java.util.Scanner;

public class CompararNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        byte num1, num2;
        Scanner teclado = new Scanner(System.in);
	    System.out.print("Introducir el primer numero");
		num1 = teclado.nextByte();
		System.out.print("Introducir el segundo numero");
		num2 = teclado.nextByte();
		
        if(num1 > num2) {
        	System.out.println("El primer numero es el mayor");
        } else {
        	System.out.println("El segundo numero es el menor");
        }
        
	}

}
