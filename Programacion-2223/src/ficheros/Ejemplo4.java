package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("ejemplo2.txt"));
		
		String linea = "";
		int suma = 0;
		while(linea != null) {
			linea = br.readLine();
			if(linea != null) {
				suma += Integer.parseInt(linea);
			}
		}
		br.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter("fatal.txt"));
		bw.write(Integer.toString(suma));
		bw.close();
	}

}
