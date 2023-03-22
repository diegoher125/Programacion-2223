package BucleWhile;

import java.util.Scanner;

public class TablasMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++) {
        	 System.out.print("Esta es la tabla del " + i);
        	 for(int j=1;j<=10;j++) {
        		 System.out.print(i + "*" + j + "=" + (i*j));
        	 }
        }
	}

}
