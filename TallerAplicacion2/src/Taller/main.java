package Taller;

import Taller.CalculosNumericos;

public class main {

	public static void main(String[] args) {
		CalculosNumericos raizCuadrada = new CalculosNumericos();
		CalculosNumericos pendienteRecta = new CalculosNumericos();
		CalculosNumericos puntoMedio = new CalculosNumericos();
		CalculosNumericos ecuCuadratica = new CalculosNumericos();
		CalculosNumericos convertir = new CalculosNumericos();
		raizCuadrada.RaizCuadrada(4);
		pendienteRecta.PendienteRecta(5, 5, 1, 19);
		puntoMedio.PuntoRecta(2, 0, 2, 0);
		ecuCuadratica.RaizEcuacionCuadratica(2, 9, 10);
		convertir.Convertir(10, 3);
	}

}
