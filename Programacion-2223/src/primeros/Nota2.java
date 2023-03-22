package primeros;
import java.util.Scanner;

public class Nota2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
	    System.out.print("Introducir la nota");
		
		byte opcion= teclado.nextByte();
		switch(opcion) {
		      case 1, 2, 3, 4:
		    	  System.out.println("Suspenso");
		      case 5:
		    	  System.out.println("Suficiente");
		      case 6:
		    	  System.out.println("Bien");
		      case 7, 8:
		    	  System.out.println("Notable");	  
		      case 9:
		    	  System.out.println("Sobresaliente");  
		      case 10:
		    	  System.out.println("Matricula de honor");  
		      default:
		    	  System.out.println("No se puede");
		      break;	
		}

	}

}