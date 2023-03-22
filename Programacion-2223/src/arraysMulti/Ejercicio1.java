package arraysMulti;

public class Ejercicio1 {
	
	private static void imprime(int[][] arrayMulti) {
		int filaTotal = 0;
		int colTotal = 0;
		int total = 0;
		for(int i=0;i<arrayMulti.length;i++) {
			for(int j=0;j<arrayMulti[i].length;j++) {
				System.out.print(arrayMulti[i][j] + " ");
				total += arrayMulti[i][j];
				filaTotal += arrayMulti[i][j];
			}
			System.out.print(" |" + filaTotal);
			filaTotal = 0;
			System.out.println();
		}
		System.out.print("--------");
		System.out.println();
		for(int i=0;i<arrayMulti.length;i++) {
			colTotal = 0;
			for(int j=0;j<arrayMulti[i].length;j++) {
				colTotal += arrayMulti[j][i];
			}
			System.out.print(colTotal + " ");
		}
		System.out.print("|" + total);
	}
	
	private static int aleatorio() {
		return (int) (Math.random()*10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arrayMulti = new int[4][4];
		
		for(int i=0;i<arrayMulti.length;i++) {
			for(int j=0;j<arrayMulti[i].length;j++) {
				arrayMulti[i][j] = aleatorio();				
			}
		}
		imprime(arrayMulti);
	}

}
