package modelo.DAOS;

import java.util.List;

import modelo.beans.Mascota;
import modelo.beans.Vacuna;

public interface VacunaDAO {

	
	public Vacuna findById(int id_vacuna);
	

	public List<Vacuna> findByMascota(int id_mascota);
}

