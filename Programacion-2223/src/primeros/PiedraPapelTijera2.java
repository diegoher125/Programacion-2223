package primeros;
import java.util.Scanner;

public class PiedraPapelTijera2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("J1 te toca");
		String J1 = teclado.nextLine();
		System.out.print("J2 te toca");
		String J2 = teclado.nextLine();
		
		switch(J1.toLowerCase()) {
		      case "piedra":
		    	  switch(J2.toLowerCase()) {
		    	  case "tijera":
		    		  System.out.println("Gana el jugador 1");
		    	  break;  
		    	  case "papel":
		    		  System.out.println("Gana el jugador 2");
		    	  break;
		    	  case "piedra":
		    		  System.out.println("empate");
		    	  break;
		    	  default:
			    	  System.out.println("ERROR");
			      break;
		    	  }
		      break;  
		      case "papel":
		    	  switch(J2.toLowerCase()) {
		    	  case "tijera":
		    		  System.out.println("Gana el jugador 2");
		    	  break;  
		    	  case "papel":
		    		  System.out.println("empate");
		    	  break;
		    	  case "piedra":
		    		  System.out.println("Gana el jugador 1");
		    	  break;
		    	  default:
			    	  System.out.println("ERROR");
			      break;
		    	  }
		      break;
		      case "tijera":
		    	  switch(J2.toLowerCase()) {
		    	  case "tijera":
		    		  System.out.println("empate");
		    	  break;  
		    	  case "papel":
		    		  System.out.println("Gana el jugador 1");
		    	  break;
		    	  case "piedra":
		    		  System.out.println("Gana el jugador 2");
		    	  break;
		    	  default:
			    	  System.out.println("ERROR");
			      break;
		    	  }
		      break;
		} 

	}

}