package arraysMulti;

import java.text.DecimalFormat;

public class Ejercicio2 {
	
	private static int aleatorio() {
		return (int) (Math.random()*101);
	}
	
	private static void arrayAleatorio(int[][] arrayMulti) {
		for(int i=0;i<arrayMulti.length;i++) {
			for(int j=0;j<arrayMulti[i].length;j++) {
				arrayMulti[i][j] = aleatorio();		
				
			}
		}
	}
	
	private static void imprime(int[][] arrayMulti) {
		for(int i=0;i<arrayMulti.length;i++) {
			for(int j=0;j<arrayMulti[i].length;j++) {
				System.out.print(arrayMulti[i][j] + " ");				
			}
			System.out.println();
		}
	}
	
	private static void mayor(int[][] arrayMulti) {
		int mayor = Integer.MIN_VALUE;
		int x = 0;
		int y = 0;
		for(int i=0;i<arrayMulti.length;i++) {
			for(int j=0;j<arrayMulti[i].length;j++) {
				if(arrayMulti[i][j] > mayor) {
					mayor = arrayMulti[i][j];
					x = i;
					y = j;
				}
			}
		}
		System.out.println("El numero mayor es " + mayor + " en la posicion " + (x+1) + "-" + (y+1));
	}
	
	private static void menor(int[][] arrayMulti) {
		int menor = Integer.MAX_VALUE;
		int x = 0;
		int y = 0;
		for(int i=0;i<arrayMulti.length;i++) {
			for(int j=0;j<arrayMulti[i].length;j++) {
				if(arrayMulti[i][j] < menor) {
					menor = arrayMulti[i][j];
					x = i;
					y = j;
				}			
			}
		}
		System.out.println("El numero menor es " + menor + " en la posicion " + (x+1) + "-" + (y+1));
	}
	
	private static void cambio(int[][] arrayMulti) {
		for(int i=0;i<arrayMulti.length;i++) {
			for(int j=0;j<arrayMulti[i].length;j++) {
				if(arrayMulti[i][j] >= 21 && arrayMulti[i][j] <= 40) {
					arrayMulti[i][j] = arrayMulti[i][j] - (arrayMulti[i][j]*2);
				}
			}
		}
	}
	
	private static void media(int[][] arrayMulti) {
		DecimalFormat df = new DecimalFormat("#0.00");
		double media = 0;
		String numMasMedia = "";
		int contador = 0;
		for(int i=0;i<arrayMulti.length;i++) {
			for(int j=0;j<arrayMulti[i].length;j++) {
				media += arrayMulti[i][j];
				contador++;
			}
		}
		media = media / contador;
		for(int i=0;i<arrayMulti.length;i++) {
			for(int j=0;j<arrayMulti[i].length;j++) {
				if(arrayMulti[i][j] >= media) {
					numMasMedia += " " + arrayMulti[i][j];
				}
			}
		}
		System.out.println("La media es " + df.format(media));
		System.out.println("Los numeros por encima de la media son " + numMasMedia);
	}
	
	private static void multiplos(int[][] arrayMulti) {
		String multiplo = "";
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrayMulti = new int[6][7];
		arrayAleatorio(arrayMulti);
		imprime(arrayMulti);
		mayor(arrayMulti);
		menor(arrayMulti);
		media(arrayMulti);
		cambio(arrayMulti);
		imprime(arrayMulti);
	}

}
