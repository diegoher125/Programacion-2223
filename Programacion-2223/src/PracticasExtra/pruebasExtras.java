package PracticasExtra;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class pruebasExtras {
	
	private static ArrayList<String> ficheroALista(String nombreFichero) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
		String linea = "";
		ArrayList<String> prac = new ArrayList<>();
		while(linea != null) {
			linea = br.readLine();
			if(linea != null) {
				prac.add(linea);
			}
		}
		br.close();
		return prac;
	}
	
	private static int sacarClave(String nombreFichero) throws IOException {
		
		ArrayList<String> prac = ficheroALista(nombreFichero);
		ArrayList<String> listaLetras = new ArrayList<>();
		int masApariciones = 0;
		int apariciones = 0;
		
		for(String linea: prac) {
			for(int i=0;i<linea.length();i++) {
				listaLetras.add(Character.toString(linea.charAt(i)));
			}
		}
		for(String linea: listaLetras) {
			apariciones = Collections.frequency(listaLetras, linea);
			if(apariciones > masApariciones) {
				masApariciones = apariciones;
			}
		}
		return masApariciones;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(sacarClave("fatal.txt"));
		
	}

}
