package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
	
	private static ArrayList<String> cogerTexto() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("texto.txt"));
		ArrayList<String> texto = new ArrayList<>();
		String linea = br.readLine();
		
		while(linea != null) {
			if(linea != null) {
				texto.add(linea);
			}
			linea = br.readLine();
		}
		br.close();
		return texto;
	}
	
	private static void generaArchivoReverse(ArrayList<String> texto) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("textoDelReves.txt"));
		Collections.reverse(texto);
		
		for(String linea: texto) {
			String lineaReves = "";
			for(int i=linea.length()-1;i>=0;i--) {
				lineaReves = lineaReves + linea.charAt(i);
			}
			bw.write(lineaReves + "\n");
		}
		
		
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> texto = cogerTexto();
		
		generaArchivoReverse(texto);
	}

}
