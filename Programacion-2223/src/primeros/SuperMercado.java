package primeros;
import java.util.Scanner;

public class SuperMercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double U = 1.21;
		double D = 1.10;
		double T = 1.04;
		double X = 1;
		double M = 0.5;
		double S = 5;
		double P = 0.95;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce precio base");
		float precioB = Float.parseFloat(teclado.nextLine());
		System.out.print("Introduce tipo de IVA:1:general, 2:reducido, 3:superreducido");
		byte TIVA = teclado.nextByte();
		System.out.print("Introduce codigo promocional:4:nopro, 5:mitad, 6:menos5, 7:cincoporc");
		byte cpro = teclado.nextByte();
		
		double resultado = 0;
		if (TIVA == 1) {
			resultado = (precioB * U);
		} else if(TIVA == 2) {
			resultado = (precioB * D);
		} else if(TIVA == 3) {
			resultado = (precioB * T);
		}
		System.out.print("El precio base es: " + precioB);
		System.out.print("El precio con IVA es: " + resultado);
		resultado = (resultado - precioB);
		System.out.print("Lo que pago de IVA es: " + resultado);
		resultado = (resultado + precioB);
		
		if (cpro == 4) {
			resultado = (resultado * X);
		} else if(cpro == 5) {
			resultado = (resultado * M);
		} else if(cpro == 6) {
			resultado = (resultado - S);
		} else if(cpro == 7) {
			resultado = (resultado * P);
		}
		System.out.print("El precio con codigo promocional es: " + resultado);
		
	}

}
