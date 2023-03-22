package primeros;
import java.util.Scanner;

public class PiedraPapelTijera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Estas en el juego piedra papel tijeras");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Turno J1: \n1: Piedra. \\n2: Papel. \\n3: Tijeras.");
		String J1 = teclado.nextLine();
		System.out.println("Turno J2: \n1: Piedra. \\n2: Papel. \\n3: Tijeras.");
		String J2 = teclado.nextLine();   
		teclado.close();
		
		if (J1.equalsIgnoreCase("Piedra") && J2.equalsIgnoreCase("Piedra")) {
			System.out.println("Empate");
		} else if (J1.equalsIgnoreCase("Piedra") && J2.equalsIgnoreCase("Papel")) {
			System.out.println("Gana el jugador 2");
		} else if (J1.equalsIgnoreCase("Piedra") && J2.equalsIgnoreCase("Tijeras")) {
			System.out.println("Gana el jugador 1");
		} else if (J1.equalsIgnoreCase("Papel") && J2.equalsIgnoreCase("Piedra")) {
			System.out.println("Gana el jugador 1");
		} else if (J1.equalsIgnoreCase("Papel") && J2.equalsIgnoreCase("Papel")) {
			System.out.println("Empate");
		} else if (J1.equalsIgnoreCase("Papel") && J2.equalsIgnoreCase("Tijeras")) {
			System.out.println("Gana el jugador 2");
		} else if (J1.equalsIgnoreCase("Tijeras") && J2.equalsIgnoreCase("Piedra")) {
			System.out.println("Gana el jugador 2");
		} else if (J1.equalsIgnoreCase("Tijeras") && J2.equalsIgnoreCase("Papel")) {
			System.out.println("Gana el jugador 1");
		} else if (J1.equalsIgnoreCase("Tijeras") && J2.equalsIgnoreCase("Tijeras")) {
			System.out.println("Empate");
		} else {
			System.out.println("ERROR");
		}
	}

}

