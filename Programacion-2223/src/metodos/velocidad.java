package metodos;

import java.util.Scanner;

public class velocidad {
	private static int leer(String texto) {
		Scanner teclado = new Scanner(System.in);
	    System.out.println(texto);
		return teclado.nextInt();
	}
	private static float velKm(int dist, int tiempo) {
		float velKm = (dist/1000)/(tiempo/60);
		return velKm;
	}
	private static float velMs(int dist, int tiempo) {
		float velMs = (dist)/(tiempo*60);
		return velMs;
	}
	private static String vehiculo(int dist, int tiempo) {
		String vehiculo = "";
		if((dist/1000)/(tiempo/60) < 100) {
			vehiculo = "coche";
			consumo(dist);
		}else if((dist/1000)/(tiempo/60) < 300) {
			vehiculo = "tren";
		}else if((dist/1000)/(tiempo/60) >= 300) {
			vehiculo = "avion";
		}
		return vehiculo;
	}
	private static void consumo(int dist) {
		float consumo = (dist/1000)/100 * (float) 5.1736;
		
		System.out.println(consumo);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int distancia = leer("Distancia recorrida en metros");
		int tiempo = leer("Tiempo recorrido en minutos");
        System.out.println("La velocidad en Km/h es " + velKm(distancia, tiempo) + " y en m/s es " + velMs(distancia, tiempo));
        System.out.println("Esta viajando en " + vehiculo(distancia, tiempo));
	}

}
