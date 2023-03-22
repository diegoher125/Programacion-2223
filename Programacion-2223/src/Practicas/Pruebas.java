package Practicas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Pruebas {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String nombreFichero = "";
		BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
		String linea = "";
		while(linea != null) {
			linea = br.readLine();
			if(linea != null) {
			}
		}
		br.close();
	}
}