package modelo.DAOS;

import java.util.List;

import modelo.beans.Higiene;

public interface HigieneDAO {
	
	public Higiene findById(int id);
	
	public List<Higiene> findByMascota(int id_mascota);


}
