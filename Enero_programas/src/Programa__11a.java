import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa__11a {

	private static Scanner leer;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte nEmpleados, i;
		double sueldo=0.0, maximo=0.0, minimo=9999999, total=0.0, isr=0;
		
		leer = new Scanner (System.in);
		
		DecimalFormat formateador = new DecimalFormat("###,###.##");
		
		System.out.println("Ingrese el número de empleados");
		nEmpleados = leer.nextByte();
		i=0;
		
		do{
			System.out.println("Ingrese el sueldo del empleado"+i+":");
			sueldo = leer.nextDouble();
			total+=sueldo;
			if(sueldo<minimo){
				minimo=sueldo;
			}
			if(sueldo>maximo){
				maximo= sueldo;
			}
			i++;
		}while(i<=nEmpleados);
		isr = total * 0.33;
		System.out.println("El total es: "+formateador.format(total));
		System.out.println("El ISR es: "+formateador.format(isr));
		System.out.println("Salario maximo: "+formateador.format(maximo));
		System.out.println("Salario minimo: "+formateador.format(minimo));
		}
	}