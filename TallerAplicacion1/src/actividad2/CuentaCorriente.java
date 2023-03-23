package actividad2;

public class CuentaCorriente extends Cuenta {
	
	float sobregiro=0;
	
	public CuentaCorriente(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		
	}
	
	@Override
	public void Retirar(float retiro)
	{
		if(retiro > saldo)
		{
			sobregiro=sobregiro+(-(saldo-retiro));
			//saldo=saldo-retiro;
			saldo=0;
			nRetiros=nRetiros+1;
		}
		if(retiro < saldo)
		{
			super.Retirar(retiro);
		}
	}
	@Override
	public void Consignar(float consignacion)
	{
		if(sobregiro>0)
		{
			saldo=(consignacion-sobregiro);
			nConsignaciones = nConsignaciones +1;
			sobregiro=0;
			//super.Consignar(consignacion);
		}
		else {
			super.Consignar(consignacion);
		}
	}
	
	public void ExtractoMensual(float comisionMensual)
	{
		super.ExtractoMensual(comisionMensual);
	}
	
	@Override
	public void Imprimir()
	{
		int ntransacciones =0;
		ntransacciones=nConsignaciones+nRetiros;
		System.out.println("El saldo es: "+saldo);
		System.out.println("La comision mensual es: "+super.comisionMensual);
		System.out.println("El numero de tansacciones es: "+ntransacciones);
		System.out.println("El sobregiro es:"+sobregiro);
	}
}
