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
	public Logger registro;
	private Set<Articulo> articulo;
	private Set<Usuario> empleado;
	private Set<Socio> socio;
	private Set<Tarifa> tarifa;
	public Buscador buscador;
	

	public Videoclub(){
		super();
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

	public Socio getSocio(int parameter) {
		// TODO : to implement
		return new Socio();	
	}
	
}