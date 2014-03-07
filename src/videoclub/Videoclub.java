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

	/* Registro de todo lo que ocurre*/
	private Logger registro;
	/* Buscador */
	private Buscador buscador;
	/* Lista de articulos */
	private Set<Articulo> articulo;
	/* Lista de empleados */
	private Set<Usuario> empleado;
	/* Lista de socios */
	private Set<Socio> socio;
	/* Tarifas validas */
	private Set<Tarifa> tarifa;

	/**
	 * Constructor estandar.
	 */
	public Videoclub(){
		this.registro = new Logger(this);
		this.buscador = new Buscador(this);

		this.articulo = new Set();
		this.empleado = new Set();
		this.socio    = new Set();
		this.tarifa   = new Set();
	}

	public void altaSocio(Socio socio) {
		// TODO : to implement
	}

	public void bajaSocio(Socio socio) {
		// TODO : to implement
	}

	public void registrarArticulo(Articulo articulo) {
		// TODO : to implement
	}

	public List<Articulo> top10() {
		// TODO : to implement
		return null;
	}

	public List<Socio> morosos() {
		// TODO : to implement
		return null;
	}
}
