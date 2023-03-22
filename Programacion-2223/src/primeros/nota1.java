package primeros;
import java.util.Scanner;

public class nota1 {



	public static void main(String[] args){
		// TODO Auto-generated method stub
        
        Scanner teclado = new Scanner(System.in);
	    System.out.print("Introducir la nota");
		
		byte opcion = teclado.nextByte();
        if(opcion <= 4){
			System.out.println("Suspenso");
        }
        else if(opcion == 5){
        	System.out.println("Suficiente");
        }
        else if(opcion == 6){
        	System.out.println("Bien");
        }
        else if(opcion == 7){
        	System.out.println("Notable");
        }
        else if(opcion == 8){
        	System.out.println("Notable");
        }
        else if(opcion == 9){
        	System.out.println("Sobresaliente");
        }
        else if(opcion == 10){
        	System.out.println("Matricula de honor");
        }
        
	}
        
	}
