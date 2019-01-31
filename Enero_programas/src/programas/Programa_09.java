package programas;
import java.util.Scanner;
public class Programa_09 {
private static Scanner leer;
	public static void main(String[] args) {
		leer = new Scanner (System.in);
	int op;
	double pulgadas, pies, centimetros ;
	
	System.out.println("Menu");
	System.out.println("1.- Pulgadas a centimetros");
	System.out.println("2.- Pies a centimetros");
	System.out.println("3.- Pies a pulgadas");
	System.out.println("Elige una opción");
	op=leer.nextInt();
	switch(op){
	case 1:
			System.out.println("Ingrese las pulgadas");
			pulgadas= leer.nextInt();
			centimetros=(pulgadas*2.54);
			System.out.println("");
			break;
	case 2:
		System.out.println("Ingrese los pies");
		pies = leer.nextInt();
		centimetros =(pies*30.48);
		System.out.println();
		break;
	case 3:
		System.out.println("");
		pies=leer.nextInt();
		centimetros=(pies*12);
		System.out.println("");
		break;
	default:
			System.out.println("");
			break;
}}}