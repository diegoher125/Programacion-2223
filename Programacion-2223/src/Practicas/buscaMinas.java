package Practicas;

import java.util.Scanner;

public class buscaMinas {
	
	private static void mostrarTablero(int[][] tablero, boolean[][] visible, boolean[][] marcas) {
		System.out.print("\t");
		for(int i=0;i<tablero[0].length;i++) {
			System.out.print("\t" + (i+1) + "\t");
		}
		System.out.println();
		for(int i=0;i<tablero.length;i++) {
			System.out.print("\t" + (i+1) + "\t");
			for(int j=0;j<tablero[0].length;j++) {
				if(marcas[i][j] == true) {
					System.out.print("!\t");
				}else if (visible[i][j] == true) {
					System.out.print(tablero[i][j] + "\t");
				}else{
					System.out.print("-\t");
				}
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int fila = 12;
		int col = 8;
		int minas = 10;
		int[][] tablero = new int[fila][col];
		boolean[][] visible = new boolean[fila][col];
		boolean[][] marcas = new boolean[fila][col];
		int contador = 0;
		int x = (int)(Math.random()*fila);
		int y = (int)(Math.random()*col);
		boolean jugar = false;
		//Pedir coor
		while(marcas[x][y]){
			//Pedir coor otra vez
		}
		marcas[x][y] = true;
		contador++;
		mostrarTablero(tablero, visible, marcas);
		for(int i=0;i<tablero.length;i++) {
			for(int j=0;j<tablero[0].length;j++) {
				if(marcas[i][j] == true && tablero[i][j] == -1) {
					System.out.println("¡HAS GANADO!");
				}else {
					System.out.println("¡HAS PERDIDO!");
				}
			}
		}
		System.out.println("¿Quieres jugar de nuevo?");
		String texto = teclado.nextLine();
		jugar = "Si".equalsIgnoreCase(texto);
	}

}
