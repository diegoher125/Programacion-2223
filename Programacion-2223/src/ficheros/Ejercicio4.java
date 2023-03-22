package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio4 {
	
	private static ArrayList<String> cogerTexto(String archivo) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(archivo));
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
	
	private static void generaArchivoUnico(ArrayList<String> texto1, ArrayList<String> texto2) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("textoEj4.txt"));
		int cont1 = 0;
		int cont2 = 0;
		
		while(cont1 < texto1.size() && cont2 < texto2.size()) {
			bw.write(texto1.get(cont1) + "\n");
			bw.write(texto2.get(cont2) + "\n");
			cont1++;
			cont2++;
			if(cont1 == texto1.size() && cont2 != texto2.size()) {
				while(cont2 < texto2.size()) {
					bw.write(texto2.get(cont2) + "\n");
					cont2++;
				}
			}
			if(cont2 == texto2.size() && cont1 != texto1.size()) {
				while(cont1 < texto1.size()) {
					bw.write(texto1.get(cont1) + "\n");
					cont1++;
				}
			}
		}
		
		bw.close();
	}
	
	private static void generaArchivoUnico2() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("textoEj4Correc.txt"));
		BufferedReader br1 = new BufferedReader(new FileReader("textoDelReves.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("martes.txt"));
		
		String linea1 = "";
		String linea2 = "";
		
		while(linea1 != null || linea2 != null) {
			linea1 = br1.readLine();
			linea2 = br2.readLine();
			if(linea1 != null) {
				bw.write(linea1 + "\n");
			}
			if(linea2 != null) {
				bw.write(linea2 + "\n");
			}
		}
		
		br1.close();
		br2.close();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ArrayList<String> texto1 = cogerTexto("textoDelReves.txt");
		ArrayList<String> texto2 = cogerTexto("martes.txt");
		generaArchivoUnico(texto1, texto2);
		generaArchivoUnico2();
	}

}
