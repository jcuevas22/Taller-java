package actividad2;

public class CuentaAhorros extends Cuenta{
	
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
	//sirve para redefinir el metodo
	@Override
	public void Consignar(float consignacion)
	{
		if(cuentaActiva) {
			super.Consignar(consignacion);
		}
		else{
			System.out.println("Cuenta inactiva no se puede consignar");
		}
	}
	
	@Override
	public void Retirar(float retiro) {
		if(cuentaActiva)
		{
			super.Retirar(retiro);
		}
		else {
			System.out.println("Cuenta inactiva no se puede retirar");
		}
	}
	@Override
	public void ExtractoMensual(float comisionMensual)
	{
		int eComisionMensual=0;
		if(nRetiros>=4)
		{
			 eComisionMensual = (nRetiros-4)*1000;
		}
		else
		{
			 eComisionMensual = 0;
		}
		super.ExtractoMensual(comisionMensual);
		super.comisionMensual=comisionMensual+eComisionMensual;
		if(saldo < 10000)
		{
			cuentaActiva = false;
		}
		else
		{
			cuentaActiva = true;
		}
		if(cuentaActiva==true)
		{
			System.out.println("la cuenta esta activa");
		}
		if(cuentaActiva==false)
		{
			System.out.println("la cuenta esta inactiva");
		}
	}
	@Override
	public void Imprimir()
	{
		int ntransacciones =0;
		ntransacciones=nConsignaciones+nRetiros;
		System.out.println("El saldo es: "+saldo);
		System.out.println("La comision mensual es: "+super.comisionMensual);
		System.out.println("El numero de tansacciones es: "+ntransacciones);
	}
}
