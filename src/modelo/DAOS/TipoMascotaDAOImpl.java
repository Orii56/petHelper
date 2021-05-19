package modelo.DAOS;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.beans.Mascota;
import modelo.beans.TipoMascota;

public class TipoMascotaDAOImpl implements TipoMascotaDAO {
	private EntityManagerFactory emf;
	private EntityManager em;
	private EntityTransaction tx;
	private String sql;
	private Query query;

	public TipoMascotaDAOImpl() {
		emf = Persistence.createEntityManagerFactory("petHelper");
		em = emf.createEntityManager();
		tx = em.getTransaction();
		tx.begin();
	}

	@Override
	public TipoMascota findById(int id_tipo) {
		return em.find(TipoMascota.class, id_tipo);
	}

}
