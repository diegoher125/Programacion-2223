package Practicas;

import java.util.Scanner;

public class P3_Examen_HernandezPuga_Diego {
	
	private static Scanner teclado = new Scanner(System.in);
	
	private static int numero = 0;
	
	private static int opcion = 1;
	
	private static String numS = "";
	
	private static void esCapicua(int num) {
		boolean esCap = false;
		int numeroInvertido = 0;
		int falta = num;
		int resto = 0;
		while(falta != 0) {
			resto = falta % 10;
			numeroInvertido = numeroInvertido * 10 + resto;
			falta = falta / 10;
		}
		if(numeroInvertido == num) {
			esCap = true;
		}else {
			esCap = false;
		}
	    if(esCap == true) {
	    	System.out.println("Es capicua");
	    }else if(esCap == false) {
	    	System.out.println("No es capicua");
	    }
	}
	
	private static boolean esPrimo(int num) {
		if(num == 0 || num == 1 || num == 4) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	private static void siguientePrimo(int num) {
		num = num + 1;
		do {
			esPrimo(num);
			num++;
		}while(esPrimo(num) == false);
		System.out.println("El siguiente primo es " + num);
	}
	
	private static void digitos(int num) {
		int digitos = 0;
		int numeroDigitos = num;
		while(numeroDigitos != 0) {
			numeroDigitos = numeroDigitos / 10;
			digitos++;
		}
		System.out.println("El numero de digitos de " + num + " es " + digitos);
	}
	
	private static void voltea(int num) {
		int numeroInvertido = 0;
		int falta = num;
		int resto = 0;
		while(falta != 0) {
			resto = falta % 10;
			numeroInvertido = numeroInvertido * 10 + resto;
			falta = falta / 10;
		}
		System.out.println("El numero invertido es " + numeroInvertido);
	}
	
	private static void suma(int num) {
		int resultado = 0;
		while(num > 0) {
            resultado += num % 10;
            num = num / 10;
        }
		System.out.println("El resultado de sumar los digitos del numero es " + resultado);
	}
	
	private static void cambiarNumero() {
		System.out.println("Introduzca un nuevo numero");
		numero = teclado.nextInt();	
		System.out.println();
	}
	
	private static void pegaPorDelante(int num) {
		String numString = "";
		while(num > 0) {
			numString = (num%10) + numString;
			num = num/10;
		}
		numString = (int)(Math.random()*10) + numString;
		System.out.println("El numero añadiendo un digito aleatorio delante es " + numString);
	}
	
	private static void pegaPorDetras(int num) {
		String numString = "";
		while(num > 0) {
			numString = (num%10) + numString;
			num = num/10;
		}
		numString = numString + (int)(Math.random()*10);
		System.out.println("El numero añadiendo un digito aleatorio detras es " + numString);
	}
	
	private static void quitaPorDelante(int num) {
		String resultado = "";
		
		while(num > 9) {
            resultado = (num % 10) + resultado;
            num = num / 10;
        }
		System.out.println("El numero quitando un digito por delante es " + resultado);
	}
	
    private static void quitaPorDetras(int num) {
		num = num / 10;
		System.out.println("El numero quitando un digito por detras es " + num);
	}
    
    private static void masApariciones(int num) {
    	int n1 = 0;
    	int n2 = 0;
    	int n3 = 0;
    	int n4 = 0;
    	int n5 = 0;
    	int n6 = 0;
    	int n7 = 0;
    	int n8 = 0;    	
    	int n9 = 0;
    	int n0 = 0;
    	String num1 = "1";
    	String num2 = "2";
    	String num3 = "3";
    	String num4 = "4";
    	String num6 = "6";
    	String num5 = "5";
    	String num7 = "7";
    	String num8 = "8";
    	String num9 = "9";
    	String num0 = "0";
    	String numMasAparece = "";    	
    	int masAparece = 0;
    	while(num > 0) {
    		if(num%10 == 0) {
    			n0++;    			
    		}else if(num%10 == 1) {
    			n1++;    			
    		}else if(num%10 == 2) {
    			n2++;    			   			
    		}else if(num%10 == 3) {
    			n3++;    			
    		}else if(num%10 == 4) {
	            n4++;	            
            }else if(num%10 == 5) {
	            n5++;	            
            }else if(num%10 == 6) {
	            n6++;	            
            }else if(num%10 == 7) {
	            n7++;	            
            }else if(num%10 == 8) {
	            n8++;	            
            }else if(num%10 == 9) {
	            n9++;	            
            }
    		num = num / 10;
    	}
    	if(n0>masAparece) {
    		masAparece = n0;
    		numMasAparece = num0;
    	}else if(n1>masAparece) {
    		masAparece = n1;
    		numMasAparece = num1;
    	}else if(n2>masAparece) {
    		masAparece = n2;
    		numMasAparece = num2; 
    	}else if(n3>masAparece) {
    		masAparece = n3;
    		numMasAparece = num3;
    	}else if(n4>masAparece) {
    		masAparece = n4;
    		numMasAparece = num4;
    	}else if(n5>masAparece) {
    		masAparece = n5;
    		numMasAparece = num5;
    	}else if(n6>masAparece) {
    		masAparece = n6;
    		numMasAparece = num6;
    	}else if(n7>masAparece) {
    		masAparece = n7;
    		numMasAparece = num7;
    	}else if(n8>masAparece) {
    		masAparece = n8;
    		numMasAparece = num8;
    	}else if(n9>masAparece) {
    		masAparece = n9;
    		numMasAparece = num9;
    	}
    	System.out.println("El numero que mas aparece es " + numMasAparece + " apareciendo " + masAparece + " veces");
    }
    
    private static void noAparecen(int num) {
    	int n1 = 0;
    	int n2 = 0;
    	int n3 = 0;
    	int n4 = 0;
    	int n5 = 0;
    	int n6 = 0;
    	int n7 = 0;
    	int n8 = 0;    	
    	int n9 = 0;
    	int n0 = 0;
    	int resto = 0;
    	String num1 = "1 ";
    	String num2 = "2 ";
    	String num3 = "3 ";
    	String num4 = "4 ";
    	String num6 = "6 ";
    	String num5 = "5 ";
    	String num7 = "7 ";
    	String num8 = "8 ";
    	String num9 = "9 ";
    	String num0 = "0 ";
    	String noAparece = " ";
    	while(num > 0) {
    		resto = num % 10;
    		if(resto == 0) {
    			n0++;    			
    		}else if(resto == 1) {
    			n1++;    			
    		}else if(resto == 2) {
    			n2++;    			   			
    		}else if(resto == 3) {
    			n3++;    			
    		}else if(resto == 4) {
	            n4++;	            
            }else if(resto == 5) {
	            n5++;	            
            }else if(resto == 6) {
	            n6++;	            
            }else if(resto == 7) {
	            n7++;	            
            }else if(resto == 8) {
	            n8++;	            
            }else if(resto == 9) {
	            n9++;	            
            }
    		resto = 0;
    		num = num / 10;
    	}
    	if(n0==0) {
    		noAparece = num0 + noAparece;
    	}
    	if(n1==0) {
    		noAparece = num1 + noAparece;
    	}
    	if(n2==0) {
    		noAparece = num2 + noAparece;
    	}
    	if(n3==0) {
    		noAparece = num3 + noAparece;
    	}
    	if(n4==0) {
    		noAparece = num4 + noAparece;
    	}
    	if(n5==0) {
    		noAparece = num5 +  noAparece;
    	}
    	if(n6==0) {
    		noAparece = num6 + noAparece;
    	}
    	if(n7==0) {
    		noAparece = num7 + noAparece;
    	}
    	if(n8==0) {
    		noAparece = num8 + noAparece;
    	}
    	if(n9==0) {
    		noAparece = num9 + noAparece;
    	}
    	System.out.println("Los digitos que no aparecen son " + noAparece);
    }
    
    private static void noAparece(String num) {
    	System.out.println("Introduce un numero");
    	String dig = teclado.nextLine();
    	
    	if(numS.contains(dig=teclado.nextLine())) {
    		System.out.println("Si aparece");
    	}else {
    		System.out.println("No aparece");
    	}
    }
    
    private static void posicionDeDigito(int num) {
    	byte digito = 0;
    	System.out.println("Introduce un digito para buscar su posicion en el numero " + numero);
    	
    		digito = teclado.nextByte();
    	
    	String digitoChar = "" + digito;
    	String numeroString = "" + num;
    	int posicion = 0;
    	if(numeroString.contains(digitoChar)) {
    		posicion = numeroString.indexOf(digitoChar)+1;   			
    		System.out.println("El digito " + digito + " esta por primera vez en la posicion " + posicion + " del numero " + numero);
    	}else{
    		System.out.println("El digito " + digito + " no esta en el numero " + numero);
    	}
    }
    
    private static void digitoN(int num) {
    	String numeroString = "";
    	
    	int digito = 0;
    	System.out.println("Introduce un numero para buscar el digito que esta en esa posicion del numero " + numero);
    	digito = teclado.nextInt();
    	while(num > 0) {
    		numeroString = (num % 10) + numeroString;
            num = num / 10;
        }
    	
    	if(numeroString.length() >= (digito-1)) {
    		System.out.println("El digito en la posicion " + digito + " es " + numeroString.charAt(digito-1));
    	}else {
    		System.out.println("No hay tantos digitos en el numero " + numero);
    	}
    	
    }
    
    private static void hacer() {
    	System.out.println("0.acabar programa; 1.capicua; 2.primo; 3.siguiente primo; 4.digitos; 5.voltear numero; 6.digito en n; 7.posicion de un digito; 8.quitar el primer digito; 9.quitar ultimo digito; 10.añadir delante numero aleatorio; 11.añadir detras numero aleatorio; 12.sumar digitos; 13.digito que mas aparece; 14.pedir un digito y ver si aparece; 15.digitos que no aparecen; 16.cambiar numero");
		System.out.println("¿Que quieres hacer?");
		opcion = teclado.nextInt();
		System.out.println();
    }
	
	public static void main(String[] args) {
		System.out.println("Bienvenido!!");
		System.out.println("------------------------------------------------------");
		System.out.println("Introduzca un numero");
	    numero = teclado.nextInt();
	    System.out.println();
	    int num = numero;
	    while(num > 0) {
    		numS = (num % 10) + numS;
            num = num / 10;
        }
		do {
			hacer();						
			switch(opcion) {
			case 1:
				esCapicua(numero);
				break;
			case 2:
				esPrimo(numero);
				if(esPrimo(numero) == true) {
					System.out.println("Es primo");
				}else {
					System.out.println("No es primo");
				}
				break;
			case 3:
				siguientePrimo(numero);
				break;
			case 4:
				digitos(numero);
				break;
			case 5:
				voltea(numero);
				break;
			case 6:
				digitoN(numero);
				break;
			case 7:
				posicionDeDigito(numero);
				break;
			case 8:
				quitaPorDelante(numero);
				break;
			case 9:
				quitaPorDetras(numero);
				break;
			case 10:
				pegaPorDelante(numero);
				break;
			case 11:
				pegaPorDetras(numero);
				break;
			case 12:
				suma(numero);
				break;
			case 13:
				masApariciones(numero);
				break;
			case 14:
				noAparece(numS);
				break;
			case 15:
				noAparecen(numero);
				break;
			case 16:
				cambiarNumero();
				break;
			}
		}while(opcion != 0);
	}
	
}
