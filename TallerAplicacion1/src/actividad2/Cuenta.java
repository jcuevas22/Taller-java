package actividad2;

public class Cuenta {
	
	//atributos
    float saldo;
	int nConsignaciones = 0;
	int nRetiros = 0;
	float tasaAnual;
	float comisionMensual =0;
	//constructor
	public Cuenta(float saldo, float tasaAnual)
	{
		this.saldo=saldo;
		this.tasaAnual=tasaAnual;
	}
	
	//metodos
	public void Consignar(float consignacion)
	{
		nConsignaciones = nConsignaciones +1;
		saldo =saldo + consignacion;
		//return consignacion;
	}
	
	public void Retirar(float retiro)
	{
		if(retiro > saldo)
		{
			System.out.println("Saldo insuficinete");
		}
		if(retiro < saldo)
		{
			nRetiros=nRetiros+1;
			saldo = saldo - retiro;
		}
		//return retiro;
	}
	
	public void InteresMensual()
	{
		float tasaMensual= tasaAnual/12;
		float interesMensual=saldo*tasaMensual;
		saldo+=interesMensual;
	}
	
	public void ExtractoMensual(float comisionMensual)
	{
		this.comisionMensual=comisionMensual;
		saldo-=comisionMensual;
		InteresMensual();
	}
	public void Imprimir()
	{
		System.out.println("El saldo es: "+saldo);
		System.out.println("El numero de consignaciones es: "+nConsignaciones);
		System.out.println("El numero de retiros es: "+nRetiros);
		System.out.println("La tasa anual es: "+tasaAnual);
		System.out.println("La comisionMensual es: "+comisionMensual);
	}

}
/*
class CuentaAhorros extends Cuenta
{

	boolean cuentaActiva = false; 

	public CuentaAhorros(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		if(saldo < 10000)
		{
			cuentaActiva = false;
		}
		else
		{
			cuentaActiva = true;
		}
	}

	
}*/
