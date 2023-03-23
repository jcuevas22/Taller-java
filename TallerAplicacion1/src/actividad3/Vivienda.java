package actividad3;

public class Vivienda extends Inmuebles{
	
	int nHabitaciones;
	int nBaños;


	public Vivienda(int identificadorInmoviliario, int area, String direccion, int nHabitaciones, int nBaños) {
		super(identificadorInmoviliario, area, direccion);
		this.nHabitaciones = nHabitaciones;
		this.nBaños = nBaños;
	}
	
}

class Casas extends Vivienda{
	int npisos;
	public Casas(int identificadorInmoviliario, int area, String direccion, int nHabitaciones, int nBaños, int npisos) {
		super(identificadorInmoviliario, area, direccion, nHabitaciones, nBaños);
		this.npisos = npisos;
	}
}

class Rurales extends Casas{
	
	int distancia;
	int altitud;
	int vmc = 1500000;
	public Rurales(int identificadorInmoviliario, int area, String direccion, int nHabitaciones, int nBaños, int npisos,
			int distancia, int altitud) {
		super(identificadorInmoviliario, area, direccion, nHabitaciones, nBaños, npisos);
		this.distancia = distancia;
		this.altitud = altitud;
		Valor();
	}
	public void Valor() {
		int vt=vmc*area;
		System.out.println("el valor de la casa rural es: $"+vt);
	}
}
class Urbanas extends Casas{

	public Urbanas(int identificadorInmoviliario, int area, String direccion, int nHabitaciones, int nBaños,
			int npisos) {
		super(identificadorInmoviliario, area, direccion, nHabitaciones, nBaños, npisos);
	}
}

class Conjunto extends Urbanas{
	int valorAdministracion;
	boolean areasComunes;
	int vmc = 2500000;
	
	public Conjunto(int identificadorInmoviliario, int area, String direccion, int nHabitaciones, int nBaños,
			int npisos, int valorAdministracion, boolean areasComunes) {
		super(identificadorInmoviliario, area, direccion, nHabitaciones, nBaños, npisos);
		this.valorAdministracion = valorAdministracion;
		this.areasComunes = areasComunes;
		Valor();
	}
	public void Valor() {
		int vt=vmc*area;
		System.out.println("el valor de la casa en conunto cerrado es: $"+vt);
	}
}

class Independiente extends Urbanas{
	int vmc = 3000000;
	public Independiente(int identificadorInmoviliario, int area, String direccion, int nHabitaciones, int nBaños,
			int npisos) {
		super(identificadorInmoviliario, area, direccion, nHabitaciones, nBaños, npisos);
		Valor();
	}
	public void Valor() {
		int vt=vmc*area;
		System.out.println("el valor de la casa independiente es: $"+vt);
	}
}

class Apartamentos extends Vivienda{

	public Apartamentos(int identificadorInmoviliario, int area, String direccion, int nHabitaciones, int nBaños) {
		super(identificadorInmoviliario, area, direccion, nHabitaciones, nBaños);

	}
}

class Apartaestudio extends Apartamentos{
	int vmc = 1500000;
	public Apartaestudio(int identificadorInmoviliario, int area, String direccion, int nHabitaciones, int nBaños) {
		super(identificadorInmoviliario, area, direccion, nHabitaciones, nBaños);
		nHabitaciones =1;
		Valor();
	}
	public void Valor() {
		int vt=vmc*area;
		System.out.println("el valor del apartaestudio es: $"+vt);
	}
}

class Familiares extends Apartamentos{
	int valadministracion;
	int vmc = 2000000;
	public Familiares(int identificadorInmoviliario, int area, String direccion, int nHabitaciones, int nBaños,
			int valadministracion) {
		super(identificadorInmoviliario, area, direccion, nHabitaciones, nBaños);
		this.valadministracion = valadministracion;
		Valor();
	}
	public void Valor() {
		int vt=vmc*area;
		System.out.println("el valor del apartamento familiar es: $"+vt);
	}
}