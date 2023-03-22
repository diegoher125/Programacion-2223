package Practicas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P4_Examen_HernandezPuga_Diego {
	
	private static int tipCuenta = 0;
	
	private static double saldo = 2000.00;
	
	private static DecimalFormat df = new DecimalFormat("#0.00");
	
	private static Scanner teclado = new Scanner(System.in);
	
	private static int opcion = 0;
	
	private static double cambio = 1.08;
	
	private static double aPagar = 0;
	
	private static double pagadoHoy = 0;
	
	private static void tipoCuenta() {
		System.out.println("Indique su tipo de cuenta:");
		System.out.println("1.Cuenta joven");
		System.out.println("2.Cuenta sin nomina");
		System.out.println("3.Cuenta nomina");
		System.out.println("Indique su seleccion:");
		tipCuenta = teclado.nextInt();
	}
	
	private static void tipoCambio() {
		int opcionCambio = 0;
		System.out.println("El tipo de cambio que hay es " + df.format(cambio) + "$-1€");
		System.out.println("Introduzca 1 para cambiar el tipo de cambio €-$, 0 si no desea modificar");
		opcionCambio = teclado.nextInt();
	    if(opcionCambio == 1) {
	    	System.out.println("Indique el tipo de cambio €-$");
	    	cambio = teclado.nextDouble();
	    }
	    System.out.println("El tipo de cambio que hay es " + df.format(cambio) + "$-1€");
	}
	
	private static void hacerUno() {
		System.out.println("1.Sacar dinero");
		System.out.println("2.Ingreso de dinero");
		if(tipCuenta != 1) {
			System.out.println("3.Pago con tarjeta");
		}
		System.out.println("4.Consultar saldo");
		if(tipCuenta == 1) {
			System.out.println("5.Consultar beneficios");
		}
		System.out.println("6.Salir");
		System.out.println("Indique su seleccion:");
		opcion = teclado.nextInt();
	}
	
	private static void sacarDinero() {
		double cantidad = 0;
		System.out.println("Introduzca la cantidad:");
		cantidad = teclado.nextDouble();
		if((pagadoHoy += cantidad) >= 6000) {
			opcion = 6;
		}else {
			if(cantidad > saldo) {
				System.out.println("Introduzca la cantidad:");
				cantidad = teclado.nextDouble();
			}
			System.out.println("Saldo anterior: " + df.format(saldo) + "€");
			saldo = saldo - cantidad;
			pagadoHoy += cantidad;
			System.out.println("Saldo actual: " + df.format(saldo) + "€");
		}
		
	}
	
	private static void ingresarDinero() {
		double cantidad = 0;
		System.out.println("Introduzca la cantidad:");
		cantidad = teclado.nextDouble();
		if((pagadoHoy += cantidad) >= 6000) {
			opcion = 6;
		}else {
			System.out.println("Saldo anterior: " + df.format(saldo) + "€");
			saldo = saldo + cantidad;
			pagadoHoy += cantidad;
			System.out.println("Saldo actual: " + df.format(saldo) + "€");
		}
	}
	
	private static void consultarSaldo() {
		System.out.println("Su saldo en € es: " + df.format(saldo));
		System.out.println("Su saldo en $ es: " + df.format(saldo*cambio));
	}
	
	private static void pagoConTarjeta() {
		double saldoDec = saldo*0.25;
		String contra = "" + (int)(Math.random()*10) + ((int)(Math.random()*10)) + ((int)(Math.random()*10)) + ((int)(Math.random()*10));
		String contrasena = "";
		int intentos = 0;
		while(!contrasena.equals(contra) && intentos < 3) {
			System.out.println("Introduzca la contraseña tienes " + (3-intentos) + " intentos");
			contrasena = teclado.nextLine();
			if(!contrasena.equals(contra) && contrasena.length() == 4) {
				if(intentos == 0) {
					System.out.println("Una pista de la contraseña es *" + contra.charAt(1) + "**");
				}else if(intentos == 1) {
					System.out.println("Una pista de la contraseña es ***" + contra.charAt(3));
				}else if(intentos == 2) {
					System.out.println("Una pista de la contraseña es " + contra.charAt(0) + "***");
				}
			}else if(contrasena.length() != 4) {
				System.out.println("La contraseña tiene 4 números");
			}
			intentos++;
		}
		if(intentos == 3) {
			opcion = 6;
		}
		double resultado = 6000 - pagadoHoy;
		System.out.println("Su saldo es: " + df.format(saldo) + "€");
		System.out.println("La cantidad que todavia puedes mover hoy es " + df.format(resultado) + "€");
		if(pagadoHoy < 6000) {
			System.out.println("Introduzca lo que va a pagar");
			aPagar = teclado.nextDouble();
			if(aPagar > saldo) {
				System.out.println("Introduzca lo que va a pagar");
				aPagar = teclado.nextDouble();
			}
		}else {
			System.out.println("Ya has movido 6000€, no puedes hacer mas movimientos hoy");
			opcion = 6;
		}
		if(tipCuenta == 2) {
			saldo = saldo - (aPagar * 1.03);
			System.out.println("Su saldo es: " + df.format(saldo) + "€");
			pagadoHoy += aPagar;
		}else if(tipCuenta == 3) {
			if(aPagar >= saldoDec) {
				saldo = saldo - (aPagar * 0.98);
				System.out.println("Su saldo es: " + df.format(saldo) + "€");
				pagadoHoy += aPagar;
			}else {
				saldo = saldo - aPagar;
				System.out.println("Su saldo es: " + df.format(saldo) + "€");
				pagadoHoy += aPagar;
			}
		}
	}
	
	private static void calcularBeneficios() {
		double saldo5Anos = saldo;
		saldo5Anos = saldo5Anos * 1.05;
		saldo5Anos = saldo5Anos * 1.05;
		saldo5Anos = saldo5Anos * 1.05;
		saldo5Anos = saldo5Anos * 1.05;
		saldo5Anos = saldo5Anos * 1.05;
		System.out.println("Con su saldo actual de " + df.format(saldo) + "€ los beneficios en 5 años serian: " + df.format(saldo5Anos));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido!!");
		tipoCuenta();
		tipoCambio();
		do {
			hacerUno();
			switch(opcion) {
				case 1:
					sacarDinero();
				break;
				case 2:
					ingresarDinero();
				break;
				case 4:
					consultarSaldo();
				break;
		    }
			if(tipCuenta == 1 && opcion == 5) {
				calcularBeneficios();
			}else if(tipCuenta != 1 && opcion == 3) {
				pagoConTarjeta();
			}
		}while(opcion != 6);
		System.out.println("¡Hasta la próxima!");
	}	

}