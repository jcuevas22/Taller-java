package actividad2;
import actividad2.Cuenta;
public class main {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(10000,5);
		CuentaAhorros ca = new CuentaAhorros(19000,50);
		CuentaCorriente cc = new CuentaCorriente(10000,50);
		cc.Retirar(15000);
		cc.Consignar(6000);
		cc.Consignar(6000);
		cc.Retirar(10000);
		cc.Retirar(10000);
		cc.Consignar(16000);
		//ca.Consignar(5000);
		//ca.Consignar(5000);
		//c.Consignar(8000);
		//c.Consignar(5000);
		//ca.Retirar(2000);
		//ca.Retirar(2000);
		//ca.Retirar(2000);
		//ca.Retirar(2000);
		//ca.Retirar(2000);
		//ca.ExtractoMensual(1000);
		//c.Imprimir();
		//ca.Imprimir();
		cc.Imprimir();
	}

}
