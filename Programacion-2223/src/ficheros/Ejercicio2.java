package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2 {
	
	private static void generaArchivoJueves() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("texto.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("jueves.txt"));
		String linea = br.readLine();
		String palabra = "jueves";
		int contador = 0;
		
		while(linea != null) {
			if(linea.contains(palabra)) {
				bw.write(linea + "\n");
				contador++;
			}
			linea = br.readLine();
		}
		
		bw.write("Jueves aparece " + contador + " veces");
		br.close();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		generaArchivoJueves();
	}

}
