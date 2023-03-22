package primeros;
import java.util.Scanner;

public class SumaRestaMultiplicacionDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        byte num1, num2;
        Scanner teclado = new Scanner(System.in);
	    System.out.print("Introducir el dia");
		num1 = teclado.nextByte();
		System.out.print("Introducir el segundo numero");
		num2 = teclado.nextByte();
		System.out.print("Dime que quieres hacer");
        byte opcion = teclado.nextByte();
        
        int resultado = 0;
        if(opcion == 1){
        	resultado = (num1 + num2);
        }
        else if(opcion == 2){
        	resultado = (num1 - num2);
        }
        else if(opcion == 3){
        	resultado = (num1 * num2);
        }
        else if(opcion == 4){
        	resultado = (num1 / num2);
        }
        System.out.print("el resultado es: " + resultado);
        }
        
	}
