package primeros;
import java.util.Scanner;

public class Semana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "adrian";
		
		Scanner teclado = new Scanner(System.in);
		String cadena2 = teclado.nextLine();
		if (cadena.equalsIgnoreCase("lunes")) {
			System.out.println("Tengo FOL");
		} else if (cadena.equalsIgnoreCase("martes")) {
			System.out.println("Tengo base de datos");
		} else if (cadena.equalsIgnoreCase("miercoles")) {
			System.out.println("Tengo sistemas informaticos");
		} else if (cadena.equalsIgnoreCase("jueves")) {
			System.out.println("Tengo sistemas informaticos");
		} else if (cadena.equalsIgnoreCase("viernes")) {
			System.out.println("Tengo base de datos");
		} else if (cadena.equalsIgnoreCase("sabado")) {
			System.out.println("Tomamos unas cervezas");
		} else if (cadena.equalsIgnoreCase("domingo")) {
			System.out.println("Tengo resaca");
		} else {
			System.out.println("ERROR");
		} 
	}

}
