package BucleWhile;

public class PrimosW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int numero = 42572;
        
        int i=2;
        int divisores=0;
        while(i<numero && divisores==0) {
        	if(numero % i ==0) {
        		divisores++;
        	}
        	i++;
        }
        if(divisores == 0) {
        	 System.out.print("Es primo ");
        }else {
        	 System.out.print("No es primo");
        }
	}

}
