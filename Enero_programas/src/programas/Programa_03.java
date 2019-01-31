package programas;

import java.util.Scanner;

public class Programa_03 {

	private static Scanner leer;

	public static void main(String[] args) {
		leer = new Scanner(System.in);
String nombre;
int edad;
double estatura;
System.out.println("Ingrese su nombre ");
nombre=leer.nextLine();
System.out.println("Ingrese su edad ");
edad=leer.nextInt();
System.out.println("Ingrese su estatura ");
estatura=leer.nextDouble();
System.out.println("Hola " + nombre+ " tu edad es " + edad + " años" + "y tu estatura es de " + estatura);
	}

}
