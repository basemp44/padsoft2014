package videoclub.articulos;

import java.util.Currency;
import java.util.Set;

import videoclub.copias.Copia;


public abstract class Articulo {
	protected static Currency precioAlquiler;
	private String id;
	private String titulo;
	private Set<String> categoria;
	private int vecesPrestado;

	private Set<Copia> copia;


	public Articulo() {
		// TODO Auto-generated constructor stub
	}

	public Copia nuevaCopia() {
		return new Copia();
	}

	public Copia getCopiaDisponible() {
		return new Copia();
	}

}