package videoclub.articulos;

import java.util.Currency;
import java.util.Date;

public class Pelicula extends Articulo {
	protected static Currency precioAlquiler;
	private Date fechaPublicacion;
	private String director;
	private FormatoVideo formato;

	public Pelicula(){
		super();
	}

}