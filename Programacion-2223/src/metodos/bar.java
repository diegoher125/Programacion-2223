package metodos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class bar {
	private static double total = 0;
	private static double precio = 0;
	private static int leer(String texto) {
		Scanner teclado = new Scanner(System.in);
	    System.out.println(texto);
		return teclado.nextInt();
	}
	private static double precio(int anadir) {
		switch(anadir) {
		    case 1:
			       precio = 1.10;
		    break;
		    case 2:
			       precio = 2.35;
			break;
		    case 3:
			       precio = 1.50;
			break;
		}
		return precio;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#0.00");
		int anadir = 0;
		int hacer = 0;
		do {
		anadir = leer("Elige que añadir: 1.refresco;2.bocata;3.cerveza;4.fin");
		if(anadir != 4) {
		hacer = leer("Elige que hacer: 1.añadir1; 2.añadir2; 3.quitar1; 4.borrar");
		}
		if(hacer == 1){
			total = total + precio(anadir);
		}else if(hacer == 2) {
			total = total + precio(anadir) + precio(anadir);
		}else if(hacer == 3) {
			total = total - precio(anadir);
		}else if(hacer == 4) {
			total = 0;
		}
		if(total >= 15) {
			total = total*0.95;
		}
		}while(anadir != 4);
		System.out.println("La cuenta es " + df.format(total) + "$");
	}

}
