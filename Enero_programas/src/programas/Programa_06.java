package programas;
import java.util.Scanner;
public class Programa_06 {

	private static Scanner leer;

	public static void main(String[] args) {
		leer = new Scanner (System.in);
		int num;
		System.out.println("Ingrese un número entero");
		num=leer.nextInt();
		if (num == 0){
			System.out.println("Par");
		}
			else{
				System.out.println("Impar");
		}
	}

}
