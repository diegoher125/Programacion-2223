package primeros;
import java.util.Scanner;

public class LetrasSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char c = '8';
		
		Scanner teclado = new Scanner(System.in);
		char d = teclado.nextLine().charAt(0);
		switch(d) {
		      case 'l':
		    	  System.out.println("Lunes");
		      case 'm':
		    	  System.out.println("Martes");
		      case 'x':
		    	  System.out.println("Miercoles");
		      case 'j':
		    	  System.out.println("Jueves");	  
		      case 'v':
		    	  System.out.println("Viernes");  
		      case 's':
		    	  System.out.println("Sabado");  
		      case 'd':
		    	  System.out.println("Domingo"); 
		      default:
		    	  System.out.println("ERRORRR");
		      break;	
		}

	}

}
