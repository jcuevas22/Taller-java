package Actividad3;

public class Mp4 extends ReproductorMusica{

	String creador;
	String tipoVideo;
	
	
	public Mp4(String creador, String tipoVideo) {
		super();
		this.creador = creador;
		this.tipoVideo = tipoVideo;
	}


	@Override
	public void Reproducir() {
		System.out.println("Se esta reproduciendo el audio de un formato mp4");
	}

}
