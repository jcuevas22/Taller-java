package Actividad3;

public class Wav  extends ReproductorMusica{
	
	String duracion;
	double tama�o;
	String artista;
	String compositor;
	String genero;
	public Wav(String duracion, double tama�o, String artista, String compositor, String genero) {
		super();
		this.duracion = duracion;
		this.tama�o = tama�o;
		this.artista = artista;
		this.compositor = compositor;
		this.genero = genero;
	}
	
	@Override
	public void Reproducir() {
		System.out.println("Se esta reproduciendo un formato wav");
	}

}
