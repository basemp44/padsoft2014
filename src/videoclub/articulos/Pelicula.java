package videoclub.articulos;

import java.util.Currency;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import videoclub.copias.Copia;

public class Pelicula extends Articulo {

	/* ================================
	 *   Atributos
	 * ================================
	 */
	
	/** Precio que cuesta alquilar un articulo de tipo musica */
	/*protected static Currency precioAlquiler;*/
	
	/* Director de la pelicula */
	private String director;
	/* Fecha en la que se publico esta pelicula */
	private Date fechaPublicacion;
	
	/* Formatos que puede soportar */
	private static Set<String> formatosVideo = new HashSet<String>();

	/* ================================
	 *   Constructores
	 * ================================
	 */
	
	/* Constructor vacio interno */
	/*private Pelicula() {}*/
	
	/**
	 * Constructor minimo de la clase.
	 * @param titulo Titulo de la pelicula.
	 * @param director Director de la pelicula.
	 * @param fechaPublicacion Fecha de publicación.
	 */
	public Pelicula(String titulo, String director, Date fechaPublicacion){
		super(titulo);
		this.director = director;
		this.fechaPublicacion = fechaPublicacion;
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
	 * Get {@see #director}.
	 * @return {@link #director}.
	 */
	 public String getDirector() {
		return this.director;
	 }
	/**
	 * Set {@see #director}.
	 * @return {@link #director}.
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * Get {@see #fechaPublicacion}.
	 * @return {@link #fechaPublicacion}.
	 */
	 public Date getFechaPublicacion() {
		return this.fechaPublicacion;
	 }
	/**
	 * Set {@see #fechaPublicacion}.
	 * @return {@link #fechaPublicacion}.
	 */
	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

}