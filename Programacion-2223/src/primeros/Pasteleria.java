package primeros;
import java.util.Scanner;

public class Pasteleria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Que sabor de tarta quieres: manzana, fresa, chocolate negro, chocolate blanco");
		String sabor = teclado.nextLine();
		
		double precio = 0;
		byte s = 0;
		
		switch(sabor) {
		case "manzana":
			s = 18;
	    break;
		case "fresa":
			s= 16;
		break;
		case "chocolate negro":
			s= 14;
		break;
		case "chocolate blanco":
			s= 15;
		break;
		}
		precio = precio + s;
		System.out.print("La tarta de sabor " + sabor + " son " + precio);
		
		System.out.print("Quieres nata: con, sin");
		String nata = teclado.nextLine();
		
		double n = 0;
		switch(nata) {
		case "con":
			n = 2.5;
		break;
		case "sin":
			n= 0;
		break;
		}
		precio = precio + n;
		System.out.print("La tarta " + nata + " nata son " + precio);
		
		System.out.print("Quieres nombre: con, sin");
		String nombre = teclado.nextLine();
		
		double m = 0;
		switch(nombre) {
		case "con":
			m = 2.75;
		break;
		case "sin":
			m= 0;
		break;
		}
		precio = precio + m;
	    
		byte NyN = 4;
		
		if(nata.equals("con") && nombre.equals("con")) {
			precio = precio - ((n + m) - NyN);
		} else {
			precio = precio + 0;
		}
		System.out.print("La tarta " + nombre + " nombre son " + precio);
		
		System.out.print("De que tamaño la quieres: pequeña, mediana, grande");
		String tamano = teclado.nextLine();
		
		double t = 0;
		switch(tamano) {
		case "pequeña":
			t = 0.6;
		break;
		case "mediana":
			t= 0.75;
		break;
		case "grande":
			t= 1;
		break;
		}
		precio = precio * t;
		System.out.print("La tarta de " + sabor + nata +" nata, " + nombre + " nombre, de tamaño " + tamano + " son " + precio);
	}

}
