package programas;

import java.util.Scanner;

public class Programa_05 {

	private static Scanner leer;

	public static void main(String[] args) {
		leer = new Scanner (System.in);
		int calificacion;
		System.out.println("Ingrese su calificación");
		calificacion=leer.nextInt();
		if (calificacion>=80){
				System.out.println("Aprobado");
		}
		else{
			System.out.println("Reprobado");
		}
		
		
	}

}
