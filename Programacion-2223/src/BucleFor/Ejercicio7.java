package BucleFor;
import java.util.Scanner;
public class Ejercicio7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int contadorPositivos = 0, contadorNegativos = 0;
		int total=0;
		for (int i=0;i<10;i++) {
			System.out.println("Por favor, introduce un numero: ");
			int numero = teclado.nextInt();
			if(numero > 0) {
				contadorPositivos++;
			} else if(numero<0) {
				contadorNegativos++;
			}
			total += numero;
		}
		System.out.println("Hay " + contadorPositivos + " numeros positivos");
		System.out.println("Hay " + contadorNegativos + " numeros positivos");
		System.out.println("El total ha sido " + total);
	}
}