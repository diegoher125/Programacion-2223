package BucleFor;
import java.util.Scanner;
public class calcularprimobucle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el numero que quieres saber si es primo o no");
		int num = teclado.nextInt();
		int resto=0;
		for (int i=2;i<num;i++) {
			resto = (num%i);
			if (resto==0) {
				System.out.println("No es primo");
				break;
			}
			}
		if (resto!=0) {
			System.out.println("Es primo");
			}
		}
	}