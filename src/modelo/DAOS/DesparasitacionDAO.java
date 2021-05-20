package modelo.DAOS;

import java.util.List;

import modelo.beans.Desparasitacion;

public interface DesparasitacionDAO {

	public Desparasitacion findById(int id);
	
	public List<Desparasitacion> findByMascota(int id_mascota);

	public int insert(Desparasitacion desparasitacion); 
	
	public int update(Desparasitacion desparasitacion);

	public int delete(Desparasitacion desparasitacion);
	
	
}
