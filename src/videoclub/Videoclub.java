package videoclub;

import java.util.List;
import java.util.Set;

import videoclub.articulos.Articulo;
import videoclub.buscador.Buscador;
import videoclub.logger.Logger;
import videoclub.socios.Socio;
import videoclub.tarifas.Tarifa;
import videoclub.usuarios.Usuario;

public class Videoclub {

	/* ================================
	 *   Atributos
	 * ================================
	 */

	/* Registro de todo lo que ocurre */
	private Logger registro;
	/* Buscador */
	private Buscador buscador;
	/* Lista de articulos */
	private Set<Articulo> articulos;
	/* Lista de empleados */
	private Set<Usuario> empleados;
	/* Lista de socios */
	private Set<Socio> socios;
	/* Tarifas validas */
	private Set<Tarifa> tarifas;

	/* ================================
	 *   Constructores
	 * ================================
	 */

	/**
	 * Constructor estandar.
	 */
	public Videoclub(){
		this.registro = new Logger(this);
		this.buscador = new Buscador(this);

		this.articulos = new Set<Articulo>();
		this.empleados = new Set<Empleado>();
		this.socios    = new Set<Socio>();
		this.tarifas   = new Set<Tarifa>();
	}

	/* ================================
	 *   Metodos
	 * ================================
	 */

	public void altaSocio(Socio socio) {
		this.socios.add(socio)
	}

	public void bajaSocio(Socio socio) {
		this.socios.remove(socio)
	}

	public void registrarArticulo(Articulo articulo) {
		this.articulos.add(articulo)
	}

	/**
	 * Devuelve una lista con los articulos mas prestados.
	 * Si hay menos de 10 articulos, habra nulls en la lista.
	 * @return Articulo[10]
	 */
	public Articulo[10] top10() {
		Articulo[] l_top10 = new Articulo[10];
		int vecesPrestado;
		for (Articulo articulo : this.articulos) {
			// La idea aqui seria
		}
		return null;
	}

	/**
	 * Devuelve una lista con los morosos.
	 * @return List<Socio>
	 */
	public List<Socio> morosos() {
		List<Socio> l_morosos = new List<Socio>();
		for (Socio socio : this.socios) {
			if (socio.esMoroso()) l_morosos.add(socio);
		}
		return l_morosos;
	}

	/* ================================
	 *   Setters & getters
	 * ================================
	 */

	private Logger registro;

	private Buscador buscador;

}
