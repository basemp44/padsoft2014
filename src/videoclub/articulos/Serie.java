package videoclub.articulos;

import java.util.Currency;
import java.util.HashSet;
import java.util.Set;

import videoclub.copias.Copia;

public class Serie extends Articulo {
	
	/* ================================
	 *   Atributos
	 * ================================
	 */

	/** Precio que cuesta alquilar un articulo de tipo musica */
	/*protected static Currency precioAlquiler;*/

	/* Temporada */
	private int temporada;
	/* Volumen */
	private int volumen;
	
	/* Formatos que puede soportar */
	private static Set<String> formatosVideo = new HashSet<String>();

	/* ================================
	 *   Constructores
	 * ================================
	 */
	/* Constructor vacio interno */
	/*private Serie(){}*/
	
	/**
	 * Constructor minimo de la clase
	 * @param titulo titulo de la serie.
	 */
	public Serie(String titulo) {
		super(titulo);
	}
	
	/* ================================
	 *   Metodos
	 * ================================
	 */
	
	/**
	 * Añade un nuevo tipo de formato de video.
	 * @param formato
	 * @return Booleano.
	 */
	public static boolean añadirFormato(String formato) {
		return formatosVideo.add(formato);
	}
	
	/**
	 * Crea una nueva copia con este formato.
	 * El formato debera ser uno de la propia clase.
	 * Indica si se ha podido crear la nueva copia.
	 * @param formato Formato del articulo;
	 * @return Booleano.
	 */
	public boolean nuevaCopia(String formato) {
		if (formatosVideo.contains(formato)) {
			new Copia(formato);
			return true;
		}
		return false;
	}
	
	/* ================================
	 *   Setters & getters
	 * ================================
	 */

	/**
	 * Get {@see #temporada}.
	 * @return {@link #temporada}.
	 */
	 public int getTemporada() {
		return this.temporada;
	 }
	/**
	 * Set {@see #temporada}.
	 * @return {@link #temporada}.
	 */
	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}

	/**
	 * Get {@see #volumen}.
	 * @return {@link #volumen}.
	 */
	 public int getVolumen() {
		return this.volumen;
	 }
	/**
	 * Set {@see #volumen}.
	 * @return {@link #volumen}.
	 */
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

}

