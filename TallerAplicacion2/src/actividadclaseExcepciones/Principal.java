package actividadclaseExcepciones;

import java.util.Scanner;
import actividadclaseExcepciones.Vendedor;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nombre del vendedor = ");
		String nombre= teclado.next();
		System.out.println("Apellidos del vendedor = ");
		String apellidos = teclado.next();
		
		Vendedor vendedor = new Vendedor(nombre,apellidos);
		
		System.out.println("Edad del vendedor = ");
		int edad = teclado.nextInt();
		
		vendedor.verificarEdad(edad);
		vendedor.imprimir();
		
		/*try {
			System.out.println("ingresando al primer try");
			
			double cociente = 1000/0;
			System.out.println("despues de la division");
			
		} catch (ArithmeticException e) {
			System.out.println("se esta dividiendo en 0");	
		}finally {
			System.out.println("ingresando al finally");
		}*/
	}

}
