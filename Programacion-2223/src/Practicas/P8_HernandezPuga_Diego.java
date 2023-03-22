package Practicas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class P8_HernandezPuga_Diego {
	
	private static ArrayList<String> cambiarTexto(ArrayList<String> prac){
		ArrayList<String> pracCambiada = new ArrayList<>();
		for(String line: prac) {
			String nuevaLinea = "";
			for(int i=0;i<line.length();i++) {
				
				if(line.charAt(i) >= 'a' && line.charAt(i) <= 'z') {
					nuevaLinea += Character.toUpperCase(line.charAt(i));
				}else if(line.charAt(i) >= 'A' && line.charAt(i) <= 'Z') {
					nuevaLinea += Character.toLowerCase(line.charAt(i));
				}else {
					nuevaLinea += line.charAt(i);
				}
			}
			pracCambiada.add(nuevaLinea);
		}
		return pracCambiada;
	}
	
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
	
	private static boolean esVocal(String letra) {
		String letras = "aeiou";
		if(letras.contains(letra)) {
			return true;
		}else {
			return false;
		}
	}
	
	private static boolean esVocalX(String letra, String vocal) {
		if(vocal.equalsIgnoreCase(letra)) {
			return true;
		}else {
			return false;
		}
	}
	
	private static double[] comprobarVocales(String vocalesTexto) {
		String vocales = "aeiou";
		double[] numVocales = new double[5];
		for(int i=0;i<vocales.length();i++) {
			for(int j=0;j<vocalesTexto.length();j++) {
				if(esVocalX(Character.toString(vocalesTexto.charAt(j)), Character.toString(vocales.charAt(i)))) {
					numVocales[i]++;
				}
			}
		}
		return numVocales;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		System.out.println("Bienvenido!!");
		String nombreFichero = "";
		while(!nombreFichero.endsWith(".txt")) {
			System.out.println("Escriba el nombre del fichero");
			nombreFichero = teclado.nextLine();
			File f = new File(nombreFichero);
			while(!f.exists()) {
				System.out.println("Error!! Escriba el nombre del fichero");
				nombreFichero = teclado.nextLine();
				f = new File(nombreFichero);
			}
			if(f.exists() && !nombreFichero.endsWith(".txt")) {
				System.out.println("Error!! El fichero no acaba en .txt");
			}
		}
		ArrayList<String> prac = ficheroALista(nombreFichero);
		int contCons = 0;
		int contVoc = 0;
		int contNum = 0;
		int contVacio = 0;
		String vocalesTexto = "";
		for(String linea: prac) {
			if(linea.isEmpty()) {
				contVacio++;
			}else {
				for(int i=0;i<linea.length();i++) {
					if(Character.isDigit(linea.charAt(i))) {
						contNum++;
					}else if(Character.isAlphabetic(linea.charAt(i))) {
						if(esVocal(Character.toString(linea.charAt(i)).toLowerCase())) {
							contVoc++;
							vocalesTexto += linea.charAt(i);
						}else {
							contCons++;
						}
					}
				}
			}
			
		}
		double[] porcVocales = comprobarVocales(vocalesTexto);
		for(int i=0;i<porcVocales.length;i++) {
			porcVocales[i] = ((porcVocales[i]*100)/contVoc);
		}
		ArrayList<String> pracCambiada = cambiarTexto(prac);
		BufferedWriter bw = new BufferedWriter(new FileWriter("resultado-" + nombreFichero));
		bw.write("Numero de consonantes = " + contCons + "\n");
		bw.write("-----------------------------------------------------------------\n");
		bw.write("Numero de vocales = " + contVoc + "\n");
		bw.write("Hay " + df.format(porcVocales[0]) + "% de a\n");
		bw.write("Hay " + df.format(porcVocales[1]) + "% de e\n");
		bw.write("Hay " + df.format(porcVocales[2]) + "% de i\n");
		bw.write("Hay " + df.format(porcVocales[3]) + "% de o\n");
		bw.write("Hay " + df.format(porcVocales[4]) + "% de u\n");
		bw.write("-----------------------------------------------------------------\n");
		bw.write("Hay " + prac.size() + " lineas\n");
		bw.write("Hay " + contVacio + " lineas en blanco\n");
		bw.write("Hay " + contNum + " numeros\n");
		bw.write("-----------------------------------------------------------------\n");
		bw.newLine();
		bw.write("El texto cambiado es:\n");
		for(String linea: pracCambiada) {
			bw.write(linea + "\n");
		}
		bw.newLine();
		bw.write("-----------------------------------------------------------------");
		bw.close();
	}
}
