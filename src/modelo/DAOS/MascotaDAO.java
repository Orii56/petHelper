package modelo.DAOS;

import java.util.List;

import modelo.beans.Mascota;

public interface MascotaDAO {


	public int insert(Mascota mascota);
	
	public int update(Mascota mascota);
	
	public int delete(Mascota mascota);

	public Mascota findById(int id_mascota);

	public List<Mascota> findByUsuario(int id_usuario);
	
	
	
}
