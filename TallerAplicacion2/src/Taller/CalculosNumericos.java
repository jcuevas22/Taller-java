package Taller;

public class CalculosNumericos {
	
	public static void RaizCuadrada(double valor)
	{
		if(valor>=0) {
			double resultado = Math.sqrt(valor);
			System.out.println("la raiz cuadrada del numero "+valor+" es: "+resultado);
		}
		if(valor<0) {
			throw new ArithmeticException("El valor debe de ser positivo");
		}
	}
	
	public static void PendienteRecta(double x1,double x2,double y1, double y2) {
		double m = (y2-y1)/(x2-x1);
		System.out.println("la pendiente de la recta es: "+m);
	}
	public static void PuntoRecta(double x1,double x2,double y1, double y2) {
		double m = ((y2+y1)/2)+((x2+x1)/2);
		System.out.println("el punto medio de la recta es: "+m);
	}
	
	public static void RaizEcuacionCuadratica(double a,double b,double c) {
		double x1=(-b+(Math.sqrt((Math.pow(b, 2))-4*a*c)))/2*a;
		double x2=(-b-(Math.sqrt((Math.pow(b, 2))-4*a*c)))/2*a;
		
		System.out.println("el resultado de la ecuacion en x1 es: "+x1);
		System.out.println("el resultado de la ecuacion en x1 es: "+x2);
	}
	
	public static void Convertir(int numero1, int numero2)
	{
		
		int residuo;
		int cociente;
		residuo=numero1/numero2;
		cociente = numero1 % numero2;
		/*while( cociente>=numero2)
		{
			residuo=residuo/numero2;
		    cociente = residuo%numero2;
		}*/
		System.out.println("el residuo es: "+residuo);
		System.out.println("el cociente es: "+ cociente);
	}
}
