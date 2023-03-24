package Actividad4;

public abstract class Cuenta {
	
	int nCuenta;
	float saldo;
	String propietario;
	public Cuenta(int nCuenta, float saldo, String propietario) {
		super();
		this.nCuenta = nCuenta;
		this.saldo = saldo;
		this.propietario = propietario;
	}
	public abstract void  depositar(int valDeposito);
	public abstract void retirar(int valRetiro);
}
