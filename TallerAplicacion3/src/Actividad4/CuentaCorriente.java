package Actividad4;

public class CuentaCorriente extends Cuenta{
	int i=1;
	public CuentaCorriente(int nCuenta, float saldo, String propietario) {
		super(nCuenta, saldo, propietario);
	}

	@Override
	public void depositar(int valDeposito) {
		saldo=saldo+valDeposito;
		System.out.println(saldo);
	}

	@Override
	public void retirar(int valRetiro) {
		if(valRetiro<=saldo)
		{
			if(i<=5)
			{
				saldo=saldo-valRetiro;
				System.out.println(saldo);
				i++;
			}
			else {
				throw new IllegalArgumentException("LA cuenta permite solo 5 retiros");
			}
		}
		else {
			throw new IllegalArgumentException("El valor del retiro es mayor al saldo de la cuenta");
		}
	}

}
