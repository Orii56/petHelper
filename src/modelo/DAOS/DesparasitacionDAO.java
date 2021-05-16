package modelo.DAOS;

import java.util.List;

import modelo.beans.Desparasitacion;

public interface DesparasitacionDAO {

	public Desparasitacion findBy(int id);
	
	public List<Desparasitacion> findByMascota(int id_mascota);
	
	
}
