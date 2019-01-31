package programas;
import java.util.Scanner;
public class Programa_07 {

	private static Scanner leer;

	public static void main(String[] args) {
		leer = new Scanner(System.in);
		double f, c;
		System.out.println("Ingresar en grados la temperatura para su conversión a farenheit");
		f =leer.nextInt();
		c =(f-32)/1.8;
		System.out.println("Los grados celcius son: "+f+" y su conversion es: "+c);
	}

}
