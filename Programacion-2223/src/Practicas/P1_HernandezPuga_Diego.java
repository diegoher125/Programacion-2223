package Practicas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P1_HernandezPuga_Diego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#0.00");
		System.out.println("Bienvenido profesor!");
		Scanner teclado = new Scanner(System.in);
		
		int practicas = 0;
		int examenes = 0;
		int asistencia = 0;
		
		while((practicas+examenes+asistencia)!=100) {
			System.out.println("Introduzca el porcentaje asignado a las practicas: ");
			practicas = teclado.nextInt();
			System.out.println("Introduzca el porcentaje asignado a los examenes: ");
			examenes = teclado.nextInt();
			System.out.println("Introduzca el porcentaje asignado a la asistencia: ");
			asistencia = teclado.nextInt();
		}
		System.out.println();
		
		int alumnos = 0;
		while(alumnos<=0) {
			System.out.println("Por favor, introduzca cuantos alumnos desea insertar la calificación: ");
			alumnos = teclado.nextInt();
		}
		System.out.println();
		
		String nombreNotaMax = "";
		String nombreNotaMin = "";
		double notaMasAlta = 0;
		double notaMasBaja = 10;
		double notaMedia = 0;
		double suspenso = 0;
		double aprobado = 0;
		double notable = 0;
		double sobresaliente = 0;
		
		for(int i=1;i<=alumnos;i++) {
			teclado = new Scanner(System.in);
				System.out.println("Introduzca el nombre del alumno " + i);
				String nombreAlumno = teclado.nextLine();
				while(nombreAlumno != "") {
				    System.out.println("Introduzca la nota de practicas de " + nombreAlumno);
				    double notaPracticas = teclado.nextDouble();
				    notaPracticas = (notaPracticas * practicas)/ 100;
				    System.out.println("Introduzca la nota de examenes de " + nombreAlumno);
				    double notaExamenes = teclado.nextDouble();
				    notaExamenes = (notaExamenes * examenes) / 100;
				    System.out.println("Introduzca la nota de asistencia de " + nombreAlumno);
				    double notaAsistencia = teclado.nextDouble();
				    notaAsistencia = (notaAsistencia * asistencia) / 100;
				    double notaTotal = notaPracticas + notaExamenes + notaAsistencia;
				    
				    System.out.println("La nota final de " + nombreAlumno + " es: " + df.format(notaTotal));
				
				    System.out.println("La nota redondeada de " + nombreAlumno + " es: " + Math.round(notaTotal));
				    if(Math.round(notaTotal)<5) {
					    System.out.println("La calificación de " + nombreAlumno + " es: Suspenso");
					    suspenso++;
				    }else if(Math.round(notaTotal)<7 && Math.round(notaTotal)>=5) {
					    System.out.println("La calificación de " + nombreAlumno + " es: Aprobado");
					    aprobado++;
				    }else if(Math.round(notaTotal)<9 && Math.round(notaTotal)>=7) {
					    System.out.println("La calificación de " + nombreAlumno + " es: Notable");
					    notable++;
				    }else if(Math.round(notaTotal)<=10 && Math.round(notaTotal)>=9) {
					    System.out.println("La calificación de " + nombreAlumno + " es: Sobresaliente");
					    sobresaliente++;
				    }else {
					
				    }
				    notaMedia = notaMedia + notaTotal;
				    if(notaTotal<notaMasBaja) {
				    	notaMasBaja = notaTotal;
					    nombreNotaMin = nombreAlumno;
				    }else {
					
				    }
				    if(notaTotal>notaMasAlta) {
				    	notaMasAlta = notaTotal;
					    nombreNotaMax = nombreAlumno;
				    }else {
					
				    }
				    nombreAlumno = "";
				    System.out.println();
			    }
			
		}
		System.out.println();
		
		System.out.println(nombreNotaMax + " ha sido la máxima nota con " + df.format(notaMasAlta));
		System.out.println(nombreNotaMin + " ha sido la mínima nota con " + df.format(notaMasBaja));
		
		notaMedia = (notaMedia*1) / alumnos;
		System.out.println("La nota media ha sido " + df.format(notaMedia));
		
		suspenso = (suspenso*100) / alumnos;
		System.out.println("El porcentaje de suspensos ha sido: " + df.format(suspenso)+ "%");
		aprobado = (aprobado*100) / alumnos;
		System.out.println("El porcentaje de aprobados ha sido: " + df.format(aprobado)+ "%");
		notable = (notable*100) / alumnos;
		System.out.println("El porcentaje de notables ha sido: " + df.format(notable)+ "%");
		sobresaliente = (sobresaliente*100) / alumnos;
		System.out.println("El porcentaje de sobresalientes ha sido: " + df.format(sobresaliente) + "%");
	}

}
