package programas;

import java.util.Scanner;

public class Programa_02 {

	private static Scanner leer;

	public static void main(String[] args) {
		leer = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre: ");
		String nombre=leer.nextLine();
		
		System.out.println("Hola "+nombre);
	}

}
