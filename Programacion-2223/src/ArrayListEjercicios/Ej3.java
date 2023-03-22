package ArrayListEjercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> paises = new ArrayList<>();
		paises.add("España");
		paises.add("Francia");
		paises.add("Alemania");
		paises.add("Portugal");
		paises.add("Inglaterra");
		HashMap<String, String> paisCap = new HashMap<String, String>();
		paisCap.put("España" , "Madrid");
		paisCap.put("Francia" , "Paris");
		paisCap.put("Alemania" , "Berlin");
		paisCap.put("Portugal" , "Lisboa");
		paisCap.put("Inglaterra" , "Londres");
		System.out.println(paisCap);
		paisCap.keySet();
		paisCap.get(1);
		System.out.println(paisCap.keySet());
		System.out.println(paisCap.get("España"));
		for(String pais: paisCap.keySet()) {
			System.out.println("Pon la capital de " + pais);
			String capital = teclado.nextLine();
			
		}
	}

}
