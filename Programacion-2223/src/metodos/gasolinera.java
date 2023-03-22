package metodos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class gasolinera {
	
	private static double diesel = 1.897;
	
	private static double gasolina = 1.667;
	
	private static DecimalFormat df = new DecimalFormat("#0.000");
	
	private static void llenarDep(int tipo) {
		double total = 0;
		double litros = 50;
		if(tipo==1) {
			total = (50/diesel) * 0.8 ;
			
		}else if(tipo==2) {
			total = (50/gasolina) * 0.8;
		}
		
		System.out.println("Has rellenado " + df.format(litros) + " litros por " + df.format(total) + "$");
	}
	
	private static void veinteEuros(int tipo) {
		double total = 20;
		double litros = 0;
		if(tipo==1) {
			litros = 20/diesel + (((20/diesel)*0.2)/diesel);
			
		}else if(tipo==2) {
			litros = 20/gasolina + (((20/gasolina)*0.2)/gasolina);
		}
		
		System.out.println("Has rellenado " + df.format(litros) + " litros por " + df.format(total) + "$");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca: 1.llenar deposito'50L'; 2.llenar 20 $; 3.cambiar precios");
		int num = teclado.nextInt();
		int tipo = 0;
		if(num == 1 || num == 2) {
			System.out.println("introduzca: 1.diesel; 2.gasolina");
			tipo = teclado.nextInt();
		}
		if(num == 1) {
			llenarDep(tipo);
		}else if(num == 2) {
			veinteEuros(tipo);
		}
		
	}
  
}
