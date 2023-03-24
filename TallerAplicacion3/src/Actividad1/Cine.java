package Actividad1;

public class Cine {
	private int nBoletas;
	public Cine(int nBoletas) {
		super();
		this.nBoletas = nBoletas;
		ComprarBoletas();
	}
	public void ComprarBoletas() {
		float totalCompra;
		if(nBoletas <0) {
			throw new IllegalArgumentException("El numero de boletas no puede ser negativo");
		}
		if(nBoletas>=0 && nBoletas<=20) {
			totalCompra=10000*nBoletas;
			System.out.println("El total de la compra es: $"+totalCompra);
		}
		if(nBoletas >20 && nBoletas <=100) {
			totalCompra=9000*nBoletas;
			System.out.println("El total de la compra es: $"+totalCompra);
		}
		if(nBoletas>100) {
			throw new IllegalArgumentException("El numero de boletas no puede ser mayor a la capacidad de la sala");
		}
	}
}
/*dentro del codigo prefiero generar unas excepcines ya que el son errores 
  con los datos ingresados e informar acerca del error, mientras que si solo
  retorno el valor de 0 el cliente no sabe la razon de dicho valor*/
