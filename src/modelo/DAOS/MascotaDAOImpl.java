package modelo.DAOS;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.beans.Mascota;

public class MascotaDAOImpl implements MascotaDAO {

	private EntityManagerFactory emf;
	private EntityManager em;
	private EntityTransaction tx;
	private String sql;
	private Query query;

	public MascotaDAOImpl() {
		emf = Persistence.createEntityManagerFactory("petHelper");
		em = emf.createEntityManager();
		tx = em.getTransaction();
		tx.begin();

	}

	@Override
	public int insert(Mascota mascota) {
		sql = "INSERT INTO mascota VALUES (:id_mascota , :id_usuario , :nombre , :fecha_nacimiento , :sexo , :raza , :tipo_mascota)";

		try {
			query = em.createQuery(sql);
			query.setParameter("id_mascota", mascota.getIdMascota());
			query.setParameter("id_usuario", mascota.getUsuario().getIdUsuario());
			query.setParameter("nombre", mascota.getNombre());
			query.setParameter("fecha_nacimiento", mascota.getFechaNacimiento());
			// query.setParameter("sexo", mascota.getSexo());
			query.setParameter("raza", mascota.getRaza());
			query.setParameter("tipo_mascota", mascota.getTipoMascotaBean().getIdTipo());
			query.executeUpdate();

			return 0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return -1;

	}

	@Override
	public int update(Mascota mascota) {

		sql = "UPDATE mascota SET id_usuario = :id_usuario , nombre = :nombre , fecha_nacimiento = :fecha_nacimiento , sexo = :sexo , raza = :raza , tipo_mascota = :tipo_mascota WHERE id_mascota = :id_mascota";

		try {
			query = em.createQuery(sql);
			query.setParameter("id_usuario", mascota.getUsuario().getIdUsuario());
			query.setParameter("nombre", mascota.getNombre());
			query.setParameter("fecha_nacimiento", mascota.getFechaNacimiento());
			query.setParameter("sexo", mascota.getSexo());
			query.setParameter("raza", mascota.getRaza());
			query.setParameter("tipo_mascota", mascota.getTipoMascotaBean().getIdTipo());
			query.setParameter("id_mascota", mascota.getIdMascota());
			query.executeUpdate();

			return 0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return -1;

	}

	@Override
	public int delete(Mascota mascota) {
		em.remove(mascota);
		tx.commit();
		return 0;
	}

	@Override
	public Mascota findById(int id_mascota) {

		return em.find(Mascota.class, id_mascota);
	}

	@Override
	public List<Mascota> findByUsuario(int id_usuario) {
		sql = "select m from Mascota where m.id_usuario = :nid";

		try {
			query = em.createQuery(sql);
			query.setParameter("nid", id_usuario);
			return query.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
