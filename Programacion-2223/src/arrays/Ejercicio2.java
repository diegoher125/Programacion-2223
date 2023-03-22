package arrays;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[10];
		int mayor = 0;
		int media = 0;
		for(int i=0;i<numeros.length;i++) {
			numeros[i] = (int)(Math.random()*51);
			if(numeros[i] > mayor) {
				mayor = numeros[i];
			}
			media += numeros[i];
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
		for(int i=((numeros.length)-1);i>=0;i--) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
		System.out.println("El mayor es " + mayor);
		System.out.println("La media es " + (media / numeros.length));
	}

}
