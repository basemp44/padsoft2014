package videoclub.articulos;

import java.util.Currency;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import videoclub.copias.Copia;

public class Musica extends Articulo {
	
	/* ================================
	 *   Atributos
	 * ================================
	 */
	
	/** Precio que cuesta alquilar un articulo de tipo musica */
	/*protected static Currency precioAlquiler;*/

	/* Interprete del disco*/
	private String interprete;
	/* Fecha en la que publico este disco */
	private Date fechaPublicacion;
	
	/* Formatos que puede soportar */
	private static Set<String> formatosAudio = new HashSet<String>();
	
	/* ================================
	 *   Constructores
	 * ================================
	 */
	
	/* Constructor vacio interno */
	/*private Musica() {}*/
	
	/**
	 * Constructor minimo de la clase.
	 * @param titulo Titulo del articulo.
	 * @param interprete Interprete del articulo.
	 * @param fechaPublicacion Fecha de publicación.
	 */
	public Musica(String titulo, String interprete, Date fechaPublicacion){
		super(titulo);
		this.interprete = interprete;
		this.fechaPublicacion = fechaPublicacion;
	}
	
	/* ================================
	 *   Metodos
	 * ================================
	 */
	
	/**
	 * Añade un nuevo tipo de formato de audio.
	 * @param formato
	 * @return Booleano.
	 */
	public static boolean añadirFormato(String formato) {
		return formatosAudio.add(formato);
	}
	
	/**
	 * Crea una nueva copia con este formato.
	 * El formato debera ser uno de la propia clase.
	 * Indica si se ha podido crear la nueva copia.
	 * @param formato Formato del articulo;
	 * @return Booleano.
	 */
	public boolean nuevaCopia(String formato) {
		if (formatosAudio.contains(formato)) {
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
	 * Get {@see #interprete}.
	 * @return {@link #interprete}.
	 */
	public String getInterprete() {
		return this.interprete;
	}
	/**
	 * Set {@see #interprete}.
	 * @return {@link #interprete}.
	 */
	public void setInterprete(String interprete) {
		this.interprete = interprete;
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