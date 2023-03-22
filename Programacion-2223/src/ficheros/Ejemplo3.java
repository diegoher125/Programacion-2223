package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("ejemplo2.txt"));
		String linea = "";
		while(linea != null) {
			System.out.println(linea);
			linea = br.readLine();
		}
		br.close();
	}

}
