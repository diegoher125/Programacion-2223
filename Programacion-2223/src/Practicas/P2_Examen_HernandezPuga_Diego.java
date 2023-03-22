package Practicas;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringTokenizer;


public class P2_Examen_HernandezPuga_Diego {
	
	private static String texto = "";
	
	private static Scanner teclado = new Scanner(System.in);
	
	private static void cambiarPriUlt() {
		String textoCambiado = texto.substring(texto.lastIndexOf(" ")) + texto.substring(texto.indexOf(" "), texto.lastIndexOf(" ")) + texto.substring(0, texto.indexOf(" "));
		System.out.println("El texto cambiando la primera y la ultima palabra es. " + textoCambiado);
	}
	
	private static void vecesUnaPalabra() {
		System.out.println("Introduzca una palabra para ver cuantas veces esta en el texto");
		String palabra = teclado.nextLine();
		int contador = 0;
		String textoComprobar = texto;
		if(texto.contains(palabra)) {
			while(!textoComprobar.equalsIgnoreCase("")) {
				textoComprobar = textoComprobar.substring(textoComprobar.indexOf(" "));
				contador++;
			}
			System.out.println("La palabra " + palabra + " aparece " + contador + " veces");
		}else {
			System.out.println("La palabra que has escrito no esta en el texto");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#0.00");
		System.out.println("Bienvenido!!");
		System.out.println("Por favor, introduzca un texto");
		texto = teclado.nextLine();
		int numPalabras = 0;
		int numChar = 0;
		int numNum = 0;
		int numA = 0;
		int numE = 0;
		int numI = 0;
		int numO = 0;
		int numU = 0;
		String letrasAbecedario = "";
		String letrasNo = "";
		String letrasSi = "";
		String textoAlReves = "";
		String textoSusE = "";
		String textoSusEOI = "";
		for(int i=0;i<texto.length();i++) {
			String texto2 = texto;
			if(texto2.charAt(i) == ' ') {
				if(texto2.charAt(i+1) == ' ') {
					texto2 = texto2.substring(texto2.indexOf(" "));
					texto2 = texto2.substring(texto2.indexOf(" "));
				}else if(texto2.charAt(i+1) != ' ') {
					texto2 = texto2.substring(texto2.indexOf(" "));
			        numPalabras++;
				}
			}
			if(Character.isLetter(texto.charAt(i))) {
				numChar++;
			}
			if(Character.isDigit(texto.charAt(i))) {
				numNum++;
			}
			
			if(texto.charAt(i) == 'a' || texto.charAt(i) == 'á' || texto.charAt(i) == 'A') {
				numA++;
			}else if(texto.charAt(i) == 'e' || texto.charAt(i) == 'é' || texto.charAt(i) == 'E') {
				numE++;
			}else if(texto.charAt(i) == 'i' || texto.charAt(i) == 'í' || texto.charAt(i) == 'I') {
				numI++;
			}else if(texto.charAt(i) == 'o' || texto.charAt(i) == 'ó' || texto.charAt(i) == 'O') {
				numO++;
			}else if(texto.charAt(i) == 'u' || texto.charAt(i) == 'u' || texto.charAt(i) == 'U') {
				numU++;
			}
		}
		String letrasSolo = "";
		String textLet = texto;
		textLet = textLet.replace(',', '1');
		textLet = textLet.replace('.', '1');
		for(int i=0;i<textLet.length();i++) {
			if(Character.isLetter(i)) {
				letrasSolo = letrasSolo + textLet.charAt(i);
			}
		}
		
		letrasSolo = letrasSolo.toLowerCase();
		for(int i=0;i<letrasSolo.length();i++) {
			letrasSolo = letrasSolo.toLowerCase();
			for(char letra='a';letra<='z';letra++) {
				String letras = "" + letrasSolo.charAt(i);
				if(letrasSolo.charAt(i) != letra) {
					if(!letrasNo.contains(letras)) {
						letrasNo = letrasNo + " " + letras;
					}
				}
			}
		}
		System.out.println("No aparecen las siguientes letras del abecedario: " + letrasNo);
	    System.out.println("Hay " + numChar + " caracteres y " + numNum + " numeros");
	    System.out.println("El numero de veces que aparece la vocal a es " + numA);
	    System.out.println("El numero de veces que aparece la vocal e es " + numE);
	    System.out.println("El numero de veces que aparece la vocal i es " + numI);
	    System.out.println("El numero de veces que aparece la vocal o es " + numO);
	    System.out.println("El numero de veces que aparece la vocal u es " + numU);
	    for(int i=texto.length()-1;i>=0;i--) {
				textoAlReves = textoAlReves + texto.charAt(i);
			}
	    System.out.println("El texto al reves es: " + textoAlReves);
	    System.out.println("El texto contiene " + (numPalabras+1) + " palabras");
	    String texto3 = texto;
	    texto3 = texto3.toLowerCase();
	    if(texto3.contains("programación") || texto3.contains("programacion")) {
	    	System.out.println("Si aparece la palabra programación");
	    }
	    textoSusE = texto.replace('a', 'e');
	    textoSusE = textoSusE.replace('o', 'e');
	    textoSusE = textoSusE.replace('u', 'e');
	    textoSusE = textoSusE.replace('i', 'e');
	    textoSusE = textoSusE.replace('á', 'e');
	    textoSusE = textoSusE.replace('ó', 'e');
	    textoSusE = textoSusE.replace('ú', 'e');
	    textoSusE = textoSusE.replace('í', 'e');
	    textoSusE = textoSusE.replace('A', 'e');
	    textoSusE = textoSusE.replace('O', 'e');
	    textoSusE = textoSusE.replace('U', 'e');
	    textoSusE = textoSusE.replace('I', 'e');
	    System.out.println("El texto con solo e: " + textoSusE);
	    textoSusEOI = texto.replace('e', '3');
	    textoSusEOI = textoSusEOI.replace('o', '0');
	    textoSusEOI = textoSusEOI.replace('i', '1');
	    textoSusEOI = textoSusEOI.replace('é', '3');
	    textoSusEOI = textoSusEOI.replace('ó', '0');
	    textoSusEOI = textoSusEOI.replace('í', '1');
	    textoSusEOI = textoSusEOI.replace('E', '3');
	    textoSusEOI = textoSusEOI.replace('O', '0');
	    textoSusEOI = textoSusEOI.replace('I', '1');
	    System.out.println("El texto cambiando vocales: " + textoSusEOI);
	    cambiarPriUlt();
	    vecesUnaPalabra();
	}

}
