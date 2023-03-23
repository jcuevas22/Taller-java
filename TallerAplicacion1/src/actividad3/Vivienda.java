package actividad3;

public class Vivienda extends Inmuebles{
	
	int nHabitaciones;
	int nBa�os;


	public Vivienda(int identificadorInmoviliario, int area, String direccion, int nHabitaciones, int nBa�os) {
		super(identificadorInmoviliario, area, direccion);
		this.nHabitaciones = nHabitaciones;
		this.nBa�os = nBa�os;
	}
	
}

class Casas extends Vivienda{
	int npisos;
	public Casas(int identificadorInmoviliario, int area, String direccion, int nHabitaciones, int nBa�os, int npisos) {
		super(identificadorInmoviliario, area, direccion, nHabitaciones, nBa�os);
		this.npisos = npisos;
	}
}

class Rurales extends Casas{
	
	int distancia;
	int altitud;
	int vmc = 1500000;
	public Rurales(int identificadorInmoviliario, int area, String direccion, int nHabitaciones, int nBa�os, int npisos,
			int distancia, int altitud) {
		super(identificadorInmoviliario, area, direccion, nHabitaciones, nBa�os, npisos);
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

	public Urbanas(int identificadorInmoviliario, int area, String direccion, int nHabitaciones, int nBa�os,
			int npisos) {
		super(identificadorInmoviliario, area, direccion, nHabitaciones, nBa�os, npisos);
	}
}

class Conjunto extends Urbanas{
	int valorAdministracion;
	boolean areasComunes;
	int vmc = 2500000;
	
	public Conjunto(int identificadorInmoviliario, int area, String direccion, int nHabitaciones, int nBa�os,
			int npisos, int valorAdministracion, boolean areasComunes) {
		super(identificadorInmoviliario, area, direccion, nHabitaciones, nBa�os, npisos);
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
	public Independiente(int identificadorInmoviliario, int area, String direccion, int nHabitaciones, int nBa�os,
			int npisos) {
		super(identificadorInmoviliario, area, direccion, nHabitaciones, nBa�os, npisos);
		Valor();
	}
	public void Valor() {
		int vt=vmc*area;
		System.out.println("el valor de la casa independiente es: $"+vt);
	}
}

class Apartamentos extends Vivienda{

	public Apartamentos(int identificadorInmoviliario, int area, String direccion, int nHabitaciones, int nBa�os) {
		super(identificadorInmoviliario, area, direccion, nHabitaciones, nBa�os);

	}
}

class Apartaestudio extends Apartamentos{
	int vmc = 1500000;
	public Apartaestudio(int identificadorInmoviliario, int area, String direccion, int nHabitaciones, int nBa�os) {
		super(identificadorInmoviliario, area, direccion, nHabitaciones, nBa�os);
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
	public Familiares(int identificadorInmoviliario, int area, String direccion, int nHabitaciones, int nBa�os,
			int valadministracion) {
		super(identificadorInmoviliario, area, direccion, nHabitaciones, nBa�os);
		this.valadministracion = valadministracion;
		Valor();
	}
	public void Valor() {
		int vt=vmc*area;
		System.out.println("el valor del apartamento familiar es: $"+vt);
	}
}