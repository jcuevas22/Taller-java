package actividad3;

public class Locales extends Inmuebles{
	String localizacion;

	public Locales(int identificadorInmoviliario, int area, String direccion, String localizacion) {
		super(identificadorInmoviliario, area, direccion);
		this.localizacion = localizacion;
	}
	
}

class LocalesComerciales extends Locales{
	String centroComercial;
	int vmc = 3000000;
	public LocalesComerciales(int identificadorInmoviliario, int area, String direccion, String localizacion,
			String centroComercial) {
		super(identificadorInmoviliario, area, direccion, localizacion);
		this.centroComercial = centroComercial;
		Valor();
	}
	public void Valor() {
		int vt=vmc*area;
		System.out.println("el valor del local comercial es: $"+vt);
	}
}


class Oficinas extends Locales{
	
	boolean pertenecenGobierno;
	int vmc = 3500000;

	public Oficinas(int identificadorInmoviliario, int area, String direccion, String localizacion,
			boolean pertenecenGobierno) {
		super(identificadorInmoviliario, area, direccion, localizacion);
		this.pertenecenGobierno = pertenecenGobierno;
		Valor();
	}
	
	public void Valor() {
		int vt=vmc*area;
		System.out.println("el valor de la oficina es: $"+vt);
	}
}