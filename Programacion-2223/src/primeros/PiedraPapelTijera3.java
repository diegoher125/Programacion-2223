package primeros;
import java.util.Scanner;

public class PiedraPapelTijera3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("J1 te toca");
		String J1 = teclado.nextLine();
		System.out.print("J2 te toca");
		String J2 = teclado.nextLine();
		
		if(J1.equals(J2)) {
			System.out.println("EMPATE");
		} else {
			int ganador = 2;
			switch(J1) {
			case "piedra":
				if(J2.equals("tijera")) {
					ganador = 1;
				}
			break;
			case "papel":
				if(J2.equals("piedra")) {
					ganador = 1;
				}
		    break;
			case "tijera":
				if(J2.equals("papel")) {
					ganador = 1;
				}
		    break;
		}
		System.out.println("El ganador es" + ganador);
		} 

	}

}