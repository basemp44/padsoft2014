package videoclub.copias;

import java.util.Date;

import videoclub.articulos.Articulo;
import videoclub.socios.Socio;

public class Copia {
	/*Aqui*/
	private String id;
	private String observaciones;
	private EstadoCopia estado;
	private Date fechaInicio;
	private int duracion;

	public Socio socio;
	public Articulo articulo;

	public Copia(String formato){
		super();
	}

	public int retraso() {
		// TODO : to implement
		return 0;
	}

	public void cancelar() {
		// TODO : to implement
	}

	public void devolver() {
		// TODO : to implement
	}

	public void incidente() {
		// TODO : to implement
	}

	public void prestar(Socio soc) {
		// TODO : to implement
	}
}

