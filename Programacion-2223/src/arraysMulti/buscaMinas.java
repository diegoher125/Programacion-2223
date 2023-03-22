package arraysMulti;

public class buscaMinas {
	
	private static int fila = 0;
	
	private static int columna = 0;
	
	private static void posicion() {
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tablero = new int[5][5];
		int filaMina = (int) (Math.random()*5);
		int colMina = (int) (Math.random()*5);
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero[i].length;j++) {
				if(i == colMina && j == colMina) {
					tablero[i][j] = 1;
				}else {
					tablero[i][j] = 0;
				}
			}
		}
		
	}

}
