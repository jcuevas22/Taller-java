package Actividad4;
import Actividad4.Cuenta;
public class main {

	public static void main(String[] args) {
		
		CuentaAhorros Cuenta1 = new CuentaAhorros(101545,20000,"Juan");
		CuentaCorriente Cuenta2 = new CuentaCorriente(101545,20000,"Juan");
		/*Cuenta1.retirar(3000);
		Cuenta1.retirar(3000);
		Cuenta1.retirar(3000);
		Cuenta1.depositar(2000);
		Cuenta1.depositar(2000);
		Cuenta1.depositar(2000);*/
		Cuenta2.depositar(2000);
		Cuenta2.retirar(2000);
		Cuenta2.retirar(2000);
		Cuenta2.retirar(2000);
		Cuenta2.retirar(2000);
		Cuenta2.retirar(2000);
		Cuenta2.retirar(2000);
	}

}
