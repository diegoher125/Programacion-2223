package ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new FileWriter("ejemplo2.txt"));
		for(int i=0;i<50;i++) {
			bw.write((i+1) + "\n");
		}
		bw.close();
	}

}
