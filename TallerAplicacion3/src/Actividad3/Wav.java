package Actividad3;

public class Wav  extends ReproductorMusica{
	
	String duracion;
	double tamaño;
	String artista;
	String compositor;
	String genero;
	public Wav(String duracion, double tamaño, String artista, String compositor, String genero) {
		super();
		this.duracion = duracion;
		this.tamaño = tamaño;
		this.artista = artista;
		this.compositor = compositor;
		this.genero = genero;
	}
	
	@Override
	public void Reproducir() {
		System.out.println("Se esta reproduciendo un formato wav");
	}

}
