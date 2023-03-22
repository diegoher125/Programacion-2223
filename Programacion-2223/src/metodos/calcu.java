package metodos;

import java.util.Scanner;

public class calcu {
	
	
	
	private static int sumar(int num1, int num2) {
		return num1 + num2;
	}	
	private static int restar(int num1, int num2) {
		return num1 - num2;
	}	
	private static int mult(int num1, int num2) {
		return num1 * num2;
	}	
	private static int dividir(int num1, int num2) {
		return num1 / num2;
	}	
	private static int leer(String texto) {
		Scanner teclado = new Scanner(System.in);
	    System.out.println(texto);
		return teclado.nextInt();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num1 = leer("Introducir el primer número");
		int num2 = leer("Introducir el segundo número");
        int opcion = leer("Dime que quieres hacer: sumar 1;restar 2; multiplicar 3; dividir 4");
        
        int resultado = 0; 
        switch(opcion) {
        case 1:
        	resultado = sumar(num1, num2);
        	break;
        case 2:
        	resultado = restar(num1, num2);
        	break;
        case 3:
        	resultado = mult(num1, num2);
        	break;
        case 4:
        	resultado = dividir(num1, num2);
        	break;
        }
        System.out.println("el resultado es: " + resultado);        
	}
}