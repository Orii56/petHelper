package modelo.DAOS;

import java.util.List;

import modelo.beans.Higiene;

public interface HigieneDAO {
	
	public Higiene findBy(int id);
	
	public List<Higiene> findByMascota(int id_mascota);

}
