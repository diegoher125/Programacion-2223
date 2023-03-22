package primeros;
import java.util.Scanner;

public class Caracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c = '8';
		String cadena = "adrian";
		
		Scanner teclado = new Scanner(System.in);
		String cadena2 = teclado.nextLine();
		System.out.println("Has introducido: " + cadena2);
		char d = teclado.nextLine().charAt(0);
		System.out.println("El caracter fue " + d);
		
		
		if(c == '8') {
			System.out.println("Es el numero de la suerte chino");
		
		}else {
			System.out.println("No se que es eso");
		}
		
		if(cadena.equalsIgnoreCase("adrian")) {
				System.out.println("Ese es mi nombre");
	    } else {
	    	System.out.println("Vete a tu casa");
	    }
		

	}

}
