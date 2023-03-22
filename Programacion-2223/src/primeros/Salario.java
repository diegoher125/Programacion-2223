package primeros;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double precioHoraNormal = 10;
		double precioExtra1 = 13;
		double precioExtra2 = 17.5;
		
		Scanner teclado = new Scanner(System.in);
	    System.out.print("Introducir las horas semanales trabajadas");
		byte numH = teclado.nextByte();
		
		double resultado = 0;
		if (numH <= 40) {
			resultado = (numH * precioHoraNormal);
		} else if (numH > 40 && numH <= 45) {
			resultado = ((numH - 40) * precioExtra1 + 40 * precioHoraNormal);
		} else if (numH > 45) {
			resultado = ((numH - 45) * precioExtra2 + 40 * precioExtra1);
		}
		System.out.print("El sueldo semanal bruto es: " + resultado);
		resultado = resultado * 4;
		System.out.print("El sueldo mensual bruto es: " + resultado);
		
		if (resultado < 1000) {
			resultado = resultado * 0.95;
			System.out.print("El sueldo neto con IRPF del 5% es: " + resultado);
		} else if (resultado >= 1000 && resultado < 1300) {
			resultado = resultado * 0.93;
			System.out.print("El sueldo neto con IRPF del 7% es: " + resultado);
		} else if (resultado >= 1300 && resultado < 1700) {
			resultado = resultado * 0.9;
			System.out.print("El sueldo neto con IRPF del 10% es: " + resultado);
		} else {
			resultado = resultado * 0.85;
			System.out.print("El sueldo neto con IRPF del 15% es: " + resultado);
		} 
		}
	}


