package Actividad3;

public class Mp3 extends ReproductorMusica{

	String duracion;
	double tama�o;
	String artista;
	String compositor;
	String genero;
	public Mp3(String duracion, double tama�o, String artista, String compositor, String genero) {
		super();
		this.duracion = duracion;
		this.tama�o = tama�o;
		this.artista = artista;
		this.compositor = compositor;
		this.genero = genero;
	}
	
	
	@Override
	public void Reproducir() {
		System.out.println("Se esta reproduciendo un formato mp3");
	}
	
}
