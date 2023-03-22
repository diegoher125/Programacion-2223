package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
	
	private static boolean esPrimo(int num) {
		for(int i=2;i<num;i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	private static void generaArchivoPrimos() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("primos.txt"));
		
		int contador = 0;
		int primo = 2;
		while(contador < 50) {
			if(esPrimo(primo)) {
				bw.write(primo + "\n"); 
				contador++;
			}
			primo++;
		}
		
		bw.close();
	}
	
	private static void leerPrimos() throws IOException {
		String nombre = "primos.txt";
		BufferedReader br = new BufferedReader(new FileReader(nombre));
		BufferedWriter bw = new BufferedWriter(new FileWriter("primos2.txt"));
		String linea = "";
		int suma = 0;
		
		while(linea != null) {
			linea = br.readLine();
			if(linea != null) {
				int num = Integer.parseInt(linea);
				suma += num;
				bw.write(linea + "-");
			}
		}
		bw.write("\nTotal = " + suma);
		
		br.close();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		generaArchivoPrimos();
		leerPrimos();
	}
}