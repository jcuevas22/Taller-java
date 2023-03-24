package Actividad3;

public class Mp3 extends ReproductorMusica{

	String duracion;
	double tamaño;
	String artista;
	String compositor;
	String genero;
	public Mp3(String duracion, double tamaño, String artista, String compositor, String genero) {
		super();
		this.duracion = duracion;
		this.tamaño = tamaño;
		this.artista = artista;
		this.compositor = compositor;
		this.genero = genero;
	}
	
	
	@Override
	public void Reproducir() {
		System.out.println("Se esta reproduciendo un formato mp3");
	}
	
}
