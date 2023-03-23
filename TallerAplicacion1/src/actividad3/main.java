package actividad3;
import actividad3.Inmuebles;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oficinas O = new Oficinas(5,3,"carrera5","interno",false);
		LocalesComerciales LC = new LocalesComerciales(4,4,"carrera6","externo","CC mayor");
		Rurales R = new Rurales(7,6,"v verde",3,2,1,2000,2800);
		Conjunto CC = new Conjunto(8,3,"conunto nuevo",3,2,1,150000,true);
		Independiente CI = new Independiente(10,6,"calle 8",5,3,2);
		Apartaestudio AE = new Apartaestudio(11,8,"avenida 8",1,1);
		Familiares AF = new Familiares(12,30,"transversal 15",3,2,120000);
	}
}
