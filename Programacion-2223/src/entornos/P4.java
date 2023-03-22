package entornos;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa la memoria");
		int intentos = 0;
		String password = "entornos";
		String pass = "";
		while(intentos < 3 && !pass.equals(password)) {
			pass = teclado.nextLine();
		}
		if(pass.equals(password)) {
			System.out.println("Bienvenido, seguro que apruebas entornos");
		}else {
			System.out.println("Mi mas sincero pesame , vas a suspender seguro entornos");
		}
	}

}
