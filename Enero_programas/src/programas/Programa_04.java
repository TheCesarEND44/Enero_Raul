package programas;

import java.util.Scanner;

public class Programa_04 {

	private static Scanner leer;

	public static void main(String[] args) {
		leer = new Scanner (System.in);
int edad;
System.out.println("Ingrese su edad");
edad=leer.nextInt();
if (edad>=18){
	System.out.println("Mayor de edad");
}
else { System.out.println("Menor de edad");
}
	}

}
