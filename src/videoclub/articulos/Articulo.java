package videoclub.articulos;

import java.util.Currency;
import java.util.HashSet;
import java.util.Set;

import videoclub.copias.Copia;


public abstract class Articulo {

	/* ================================
	 *   Atributos
	 * ================================
	 */

	/** Precio que cuesta alquilar un articulo */
	protected static Currency precioAlquiler; /*private static int precioAlquiler=3*/
	
	/* Identificador unico del articulo */
	private String id;
	/* Titulo del articulo */
	private String titulo;
	
	/* Categorias a las que puede pertenecer el articulo */
	private static Set<String> categorias = new HashSet<String>();
	/* Categorias a las que pertenece el artículo */
	private Set<String> categoriasMarcadas = new HashSet<String>();

	/* Copias asociadas a este articulo */
	private Set<Copia> copias = new HashSet<Copia>();
	
	/* Veces que se ha prestado este articulo */
	private int vecesPrestado;

	/* ================================
	 *   Constructores
	 * ================================
	 */
	
	/* Constructor vacio interno */
	/*private Articulo() {}*/
	
	/**
	 * Constructor minimo de la clase.
	 * @param titulo Titulo del articulo.
	 */
	public Articulo(String titulo) {
		this.titulo = titulo;
	}

	/* ================================
	 *   Metodos
	 * ================================
	 */
	
	/**
	 * Suma 1 al numero de veces que se ha prestado el articulo
	 * @return void.
	 */
	public void nuevoPrestamo(){
		this.vecesPrestado++;
	}
	
	/**
	 * Añade un nuevo tipo de categoria disponible para cualquier articulo.
	 * 
	 * @param categoria
	 * @return Booleano.
	 */
	public static boolean añadirCategoria(String categoria) {
		return categorias.add(categoria);
	}
	
	/**
	 * Asigna una nueva categoria a este articulo.
	 * Para ello, debe existir en la lista de categorias disponibles.
	 * Indica si se ha podido asignar. 
	 * @param categoria
	 * @return Booleano.
	 */
	public boolean marcarCategoria(String categoria) {
		if (categorias.contains(categoria))
			return this.categoriasMarcadas.add(categoria);
		return false;
	}
	
	/**
	 * Quita una categoria a este articulo, e indica si lo
	 * Para ello, debe tener la categoria.
	 * Indica si se ha podido quitar.
	 * @param categoria
	 * @return Booleano.
	 */
	public boolean desmarcarCategoria(String categoria) {
		return this.categoriasMarcadas.remove(categoria);
	}
	
	/**
	 * Añade una copia al conjunto total del articulo.
	 * Para ello, debe tener la categoria.
	 * Indica si se ha podido añadir.
	 * @param copia.
	 * @return Booleano.
	 */	
	public boolean añadirCopia(Copia copia) {
		return this.copias.add(copia);
	}

	/* ================================
	 *   Setters & getters
	 * ================================
	 */
	
	/**
	 * Get {@see #precioAlquiler}.
	 * @return {@link #precioAlquiler}.
	 */
	protected static Currency getPrecioAlquiler() {
		return precioAlquiler;
	}
	/**
	 * Set {@see #precioAlquiler}.
	 * @return {@link #precioAlquiler}.
	 */
	protected static void setPrecioAlquiler(Currency precioAlquiler) {
		Articulo.precioAlquiler = precioAlquiler;
	}
	
	/**
	 * Get {@see #id}.
	 * @return {@link #id}.
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * Get {@see #titulo}.
	 * @return {@link #titulo}.
	 */
	public String getTitulo() {
		return this.titulo;
	}
	/**
	 * Set {@see #titulo}.
	 * @return {@link #titulo}.
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/**
	 * Get {@see #vecesPrestado}.
	 * @return {@link #vecesPrestado}.
	 */
	public int getVecesPrestado() {
		return this.vecesPrestado;
	}
}