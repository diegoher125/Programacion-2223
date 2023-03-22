package primeros;
import java.util.Scanner;

public class LetraSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = '8';
		
		Scanner teclado = new Scanner(System.in);
		char d = teclado.nextLine().charAt(0);
		if (d == 'l') {
			System.out.println("Es lunes");
		} else if (d == 'm') {
			System.out.println("Es martes");
		} else if (d == 'x') {
			System.out.println("Es miercoles");
		} else if (d == 'j') {
			System.out.println("Es jueves");
		} else if (d == 'v') {
			System.out.println("Es viernes");
		} else if (d == 's') {
			System.out.println("Es sabado");
		} else if (d == 'd') {
			System.out.println("Es domingo");
		} else {
			System.out.println("ERROR");
		} 
		
		
		
	}

}
