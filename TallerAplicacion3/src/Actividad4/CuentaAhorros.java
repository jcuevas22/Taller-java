package Actividad4;

public class CuentaAhorros extends Cuenta{
	int i=1;
	int j=1;
	public CuentaAhorros(int nCuenta, float saldo, String propietario) {
		super(nCuenta, saldo, propietario);
	}

	@Override
	public void depositar(int valDeposito) {
		if(j<=2)
		{
			j++;
			float porcentaje = (float) ((valDeposito/100)*0.5);
			float incremento = valDeposito+porcentaje;
			saldo=saldo+incremento;
			System.out.println(saldo);
		}
		else {
			j++;
			saldo=saldo+valDeposito;
			System.out.println(saldo);
		}
	}

	@Override
	public void retirar(int valRetiro) {
		if(valRetiro<=saldo) {
			if(i<=3)
			{
				i++;
				saldo=saldo-valRetiro;
				System.out.println(saldo);
			}
			else {
				i++;
				float porcentaje = valRetiro/100;
				float descuento = valRetiro+porcentaje;
				saldo=saldo-descuento;
				System.out.println(saldo);
			}
		}
		else {
			throw new IllegalArgumentException("El valor del retiro es mayor al saldo de la cuenta");
		}
	}
}
