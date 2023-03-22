package PracticasExtra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class P8_E_HernandezPuga_Diego {

	private static ArrayList<String> cambiarTexto(String nombreFichero) throws IOException {
		ArrayList<String> pracCambiada = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
		String linea = "";
		while (linea != null) {
			linea = br.readLine();
			if (linea != null) {
				String nuevaLinea = "";
				for (int i = 0; i < linea.length(); i++) {

					if (linea.charAt(i) >= 'a' && linea.charAt(i) <= 'z') {
						nuevaLinea += Character.toUpperCase(linea.charAt(i));
					} else if (linea.charAt(i) >= 'A' && linea.charAt(i) <= 'Z') {
						nuevaLinea += Character.toLowerCase(linea.charAt(i));
					} else {
						nuevaLinea += linea.charAt(i);
					}
				}
				pracCambiada.add(nuevaLinea);
			}
		}
		br.close();
		return pracCambiada;
	}

	private static boolean esVocal(String letra) {
		String letras = "aeiou";
		if (letras.contains(letra)) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean esVocalX(String letra, String vocal) {
		if (vocal.equalsIgnoreCase(letra)) {
			return true;
		} else {
			return false;
		}
	}

	private static double[] comprobarVocales(String vocalesTexto) {
		String vocales = "aeiou";
		double[] numVocales = new double[5];
		for (int i = 0; i < vocales.length(); i++) {
			for (int j = 0; j < vocalesTexto.length(); j++) {
				if (esVocalX(Character.toString(vocalesTexto.charAt(j)), Character.toString(vocales.charAt(i)))) {
					numVocales[i]++;
				}
			}
		}
		return numVocales;
	}

	private static void sacarResultado(String nombreFichero) throws IOException {
		DecimalFormat df = new DecimalFormat("#0.00");
		int lineas = 0;
		BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
		int contCons = 0;
		int contVoc = 0;
		int contNum = 0;
		int contVacio = 0;
		String vocalesTexto = "";
		String linea = "";
		while (linea != null) {
			linea = br.readLine();
			if (linea != null) {
				lineas++;
				if (linea.isEmpty()) {
					contVacio++;
				} else {
					for (int i = 0; i < linea.length(); i++) {
						if (Character.isDigit(linea.charAt(i))) {
							contNum++;
						} else if (Character.isAlphabetic(linea.charAt(i))) {
							if (esVocal(Character.toString(linea.charAt(i)).toLowerCase())) {
								contVoc++;
								vocalesTexto += linea.charAt(i);
							} else {
								contCons++;
							}
						}
					}
				}
			}
		}
		br.close();
		double[] porcVocales = comprobarVocales(vocalesTexto);
		for (int i = 0; i < porcVocales.length; i++) {
			porcVocales[i] = ((porcVocales[i] * 100) / contVoc);
		}
		ArrayList<String> pracCambiada = cambiarTexto(nombreFichero);
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
		bw.write("Hay " + lineas + " lineas\n");
		bw.write("Hay " + contVacio + " lineas en blanco\n");
		bw.write("Hay " + contNum + " numeros\n");
		bw.write("-----------------------------------------------------------------\n");
		bw.newLine();
		bw.write("El texto cambiado es:\n");
		for (String line : pracCambiada) {
			bw.write(line + "\n");
		}
		bw.newLine();
		bw.write("-----------------------------------------------------------------");
		bw.close();
	}

	private static void encriptar(int clave, String nombre) throws IOException {
		String enc = "";
		BufferedReader br = new BufferedReader(new FileReader(nombre));
		String linea = "";
		while (linea != null) {
			linea = br.readLine();
			if (linea != null) {
				String lineaEnc = "";
				for (int i = 0; i < linea.length(); i++) {
					int letraASCII = (int) linea.charAt(i);
					letraASCII += clave;
					while (letraASCII > 256) {
						letraASCII -= 256;
					}
					char letraEnc = (char) letraASCII;
					lineaEnc += letraEnc;
				}
				enc += lineaEnc + "\n";
			}
		}
		br.close();

		BufferedWriter bw = new BufferedWriter(new FileWriter(nombre.substring(0, nombre.lastIndexOf(".")) + ".enc"));

		bw.write(enc);

		bw.close();
	}

	private static void desencriptar(int clave, String nombre) throws IOException {
		String des = "";
		BufferedReader br = new BufferedReader(new FileReader(nombre));
		String linea = "";
		while (linea != null) {
			linea = br.readLine();
			if (linea != null) {
				String lineaDes = "";
				for (int i = 0; i < linea.length(); i++) {
					int letraASCII = (int) linea.charAt(i);
					letraASCII -= clave;
					while (letraASCII < 0) {
						letraASCII += 256;
					}
					char letraDes = (char) letraASCII;
					lineaDes += letraDes;
				}
				des += lineaDes;
			}
		}
		br.close();

		BufferedWriter bw = new BufferedWriter(new FileWriter(nombre.substring(0, nombre.lastIndexOf(".")) + ".enc"));

		bw.write(des);

		bw.close();
	}

	private static int sacarClave(String nombreFichero) throws IOException {
		int masApariciones = 0;
		int apariciones = 0;
		int actual = 0;
		int mirando = 0;
		String fichero = "";
		BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
		String linea = "";
		while (linea != null) {
			linea = br.readLine();
			if (linea != null) {
				fichero += linea + "\n";
			}
		}
		br.close();
		for (int i = 0; i < fichero.length(); i++) {
			mirando = (int) fichero.charAt(i);
			for (int j = 0; j < fichero.length(); i++) {
				actual = (int) fichero.charAt(j);
				if (actual == mirando)
					apariciones++;
			}
			if (apariciones > masApariciones)
				masApariciones = apariciones;
		}
		return masApariciones;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		System.out.println("Bienvenido!!");
		String nombreFichero = "";
		String terminacion = "";
		String inicio = "";
		ArrayList<String> ficheros = new ArrayList<>();
		System.out.println("Escriba el nombre de los ficheros");
		do {
			do {
				nombreFichero = teclado.nextLine();
				File f = new File(nombreFichero);
				while (!f.exists() && !nombreFichero.equals("0")) {
					System.out.println("Error!! No existe el fichero, escriba de nuevo el nombre del fichero");
					nombreFichero = teclado.nextLine();
					f = new File(nombreFichero);
				}
			} while (nombreFichero.length() > 11 || nombreFichero.length() < 1);

			if (!nombreFichero.equals("0")) {
				terminacion = nombreFichero.substring(nombreFichero.lastIndexOf("."));
				inicio = nombreFichero.substring(0, nombreFichero.lastIndexOf("."));
				if (inicio.length() <= 8 || terminacion.length() == 4)
					ficheros.add(nombreFichero);
			}

		} while (!nombreFichero.equals("0"));

		for (String nombre : ficheros) {
			sacarResultado(nombre);
		}

		ArrayList<Integer> opciones = new ArrayList<>();
		System.out.println("Elija la opcion deseada: 0 Encriptar, 1 Desencriptar, -1 para terminar");

		int opcion = 0;
		while (opcion != -1) {
			while (!teclado.hasNext()) {
				opcion = teclado.nextInt();
			}
			if (opcion == 0 || opcion == 1)
				opciones.add(opcion);

		}
		System.out.println("aaaa");
		HashMap<String, Integer> nomOpFicClave = new HashMap<>();
		int contador = 0;
		for (String nombre : ficheros) {
			switch (opciones.get(contador)) {
			case 0:
				if (!nombre.endsWith(".enc"))
					encriptar(sacarClave(nombre), nombre);
				contador++;
				break;
			case 1:
				if (nombre.endsWith(".enc"))
					desencriptar(sacarClave(nombre), nombre);
				contador++;
				break;
			}
		}

	}

}
