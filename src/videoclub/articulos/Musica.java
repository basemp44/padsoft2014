package videoclub.articulos;

import java.util.Currency;
import java.util.Date;

public class Musica extends Articulo {
	protected static Currency precioAlquiler;
	private Date fechaPublicacion;
	private String interprete;
	private FormatoAudio formato;

	public Musica(){
		super();
	}

}