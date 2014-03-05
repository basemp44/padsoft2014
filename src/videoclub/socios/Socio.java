package videoclub.socios;

import java.util.Date;
import java.util.List;
import java.util.Set;

import videoclub.copias.Copia;
import videoclub.tarifas.Tarifa;

public class Socio {

	/* ================================
	 *   Globales
	 * ================================
	 */

	public static final int MAX_PRESTAMOS = 5;

	/* ================================
	 *   Atributos
	 * ================================
	 */

	/** Identificador unico del socio */
	private int uid;
	/* DNI o NIA */
	private String dni;
	/* Nombre completo del socio */
	private String nombre;
	/* Numero de telefono */
	private String telefono;
	/* Direccion completa */
	private String direccion;

	/* Fecha en la que contrato la ultima tarifa */
	private Date fechaContratacion;
	/* Tarifa activa del socio (si existe) */
	public Tarifa tarifa;

	/* Lista de copias que tiene el socio */
	public Copia[] copia;

	/* ================================
	 *   Constructores
	 * ================================
	 */

	/* Constructor vacio interno */
	private Socio() {}

	/**
	 * Constructor minimo de la clase.
	 * @param uid Identificador unico
	 * @param dni DNI o NIA del socio
	 */
	public Socio(int uid, String dni) {
		this.uid              	= uid;
		this.dni              	= dni;
		this.copia            	= new Copia[Socio.MAX_PRESTAMOS];
		this.nombre           	= null;
		this.telefono         	= null;
		this.direccion        	= null;
		this.fechaContratacion	= null;
		this.tarifa           	= null;
	}

	/* ================================
	 *   Metodos
	 * ================================
	 */

	public Tarifa tarifaActiva() {
		Date now = new Date();
	}

	public List<Copia> obtenerPrestamos() {
		return this.copia;
	}

	/* ================================
	 *   Setters & getters
	 * ================================
	 */

	/**
	 * Get {@see #uid}.
	 * @return {@link #uid}.
	 */
	public int getUid() {
		return this.uid;
	}
	/**
	 * Get {@see #dni}.
	 * @return {@link #dni}.
	 */
	public String getDni() {
		return this.dni;
	}
	/**
	 * Get {@see #nombre}.
	 * @return {@link #nombre}.
	 */
	public String getNombre() {
		return this.nombre;
	}
	/**
	 * Get {@see #nombre}.
	 * @return {@link #nombre}.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Get {@see #telefono}.
	 * @return {@link #telefono}.
	 */
	public String getTelefono() {
		return this.telefono;
	}
	/**
	 * Set {@see #telefono}.
	 * @return {@link #telefono}.
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * Get {@see #direccion}.
	 * @return {@link #direccion}.
	 */
	public String getDireccion() {
		return this.direccion;
	}
	/**
	 * Set {@see #direccion}.
	 * @return {@link #direccion}.
	 */
	public void setDireccion() {
		this.direccion = direccion;
	}
}

