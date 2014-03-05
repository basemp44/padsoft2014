package videoclub.tarifas;

import java.util.Currency;

public class Tarifa {

	/* ================================
	 *   Atributos
	 * ================================
	 */

	/** Nombre de la tarifa */
	private String nombre;
	/** Duracion (en dias) */
	private int duracion;
	/** Dias extra que permite tener un alquiler */
	private int diasExtra;
	/** Precio de esta tarifa */
	private Currency precioTarifa;

	/** Incluye alquileres de musica? */
	private boolean incluyeMusica;
	/** Incluye alquileres de musica? */
	private boolean incluyePeliculas;
	/** Incluye alquileres de peliculas? */
	private boolean incluyeSeries;

	/* ================================
	 *   Constructores
	 * ================================
	 */

	/* Constructor interno */
	private Tarifa() {}

	/**
	 * Constructor minimo de la clase.
	 * @param uid Identificador unico
	 * @param dni DNI o NIA del socio
	 */
	public Tarifa(String nombre) {
		this.nombre          	= nombre;
		this.duracion        	= 1;
		this.diasExtra       	= 0;
		this.precioTarifa    	= null; /* IMPORTANTE CAMBIAR!!! */
		this.incluyeMusica   	= false;
		this.incluyePeliculas	= false;
		this.incluyeSeries   	= false;
	}

	/* ================================
	 *   Setters & getters
	 * ================================
	 */

	/**
	 * Get {@see #nombre}.
	 * @return {@link #nombre}.
	 *
	 */
	public String getNombre() {
		return this.nombre;
	}
	/**
	 * Set {@see #nombre}.
	 * @return {@link #nombre}.
	 */
	public void setNombre(nombre) {
		this.nombre = nombre;
	}
	/**
	 * Get {@see #duracion}.
	 * @return {@link #duracion}.
	 *
	 */
	public int getDuracion() {
		return this.duracion;
	}
	/**
	 * Set {@see #duracion}.
	 * Precaucion, operacion potencialmente peligrosa.
	 * @return {@link #duracion}.
	 */
	public void setDuracion(duracion) {
		this.duracion = duracion;
	}
	/**
	 * Get {@see #diasExtra}.
	 * @return {@link #diasExtra}.
	 *
	 */
	public int getDiasExtra() {
		return this.diasExtra;
	}
	/**
	 * Set {@see #diasExtra}.
	 * @return {@link #diasExtra}.
	 */
	public void setDiasExtra(diasExtra) {
		this.diasExtra = diasExtra;
	}
	/**
	 * Get {@see #precioTarifa}.
	 * @return {@link #precioTarifa}.
	 *
	 */
	public Currency getPrecioTarifa() {
		return this.precioTarifa;
	}
	/**
	 * Set {@see #precioTarifa}.
	 * @return {@link #precioTarifa}.
	 */
	public void setPrecioTarifa(precioTarifa) {
		this.precioTarifa = precioTarifa;
	}
	/**
	 * Get {@see #incluyeMusica}.
	 * @return {@link #incluyeMusica}.
	 *
	 */
	public boolean getIncluyeMusica() {
		return this.incluyeMusica;
	}
	/**
	 * Set {@see #incluyeMusica}.
	 * @return {@link #incluyeMusica}.
	 */
	public void setIncluyeMusica(incluyeMusica) {
		this.incluyeMusica = incluyeMusica;
	}
	/**
	 * Get {@see #incluyePeliculas}.
	 * @return {@link #incluyePeliculas}.
	 *
	 */
	public boolean getIncluyePeliculas() {
		return this.incluyePeliculas;
	}
	/**
	 * Set {@see #incluyePeliculas}.
	 * @return {@link #incluyePeliculas}.
	 */
	public void setIncluyePeliculas(incluyePeliculas) {
		this.incluyePeliculas = incluyePeliculas;
	}
	/**
	 * Get {@see #incluyeSeries}.
	 * @return {@link #incluyeSeries}.
	 *
	 */
	public boolean getIncluyeSeries() {
		return this.incluyeSeries;
	}
	/**
	 * Set {@see #incluyeSeries}.
	 * @return {@link #incluyeSeries}.
	 */
	public void setIncluyeSeries(incluyeSeries) {
		this.incluyeSeries = incluyeSeries;
	}
}
