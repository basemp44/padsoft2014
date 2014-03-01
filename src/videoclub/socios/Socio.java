package videoclub.socios;

import java.util.Date;
import java.util.List;
import java.util.Set;

import videoclub.copias.Copia;
import videoclub.tarifas.Tarifa;

public class Socio {
	private int uid;
	private int dni;
	private String nombre;
	private int telefono;
	private String direccion;
	private Date fechaContratacion;
	
	public Set<Copia> copia;
	public Tarifa tarifa;
	
	public Socio(){
		super();
	}

	public List<Copia> obtenerPrestamos() {
		return null;	
	}
	
}

