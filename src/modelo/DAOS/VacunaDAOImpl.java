package modelo.DAOS;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.beans.Mascota;
import modelo.beans.Vacuna;


public class VacunaDAOImpl implements VacunaDAO{
	
	
	private EntityManagerFactory emf;
	private EntityManager em;
	private EntityTransaction tx;
	private String sql;
	private Query query;

	

	public VacunaDAOImpl() {
		emf = Persistence.createEntityManagerFactory("petHelper");
		em = emf.createEntityManager();
		tx = em.getTransaction();
		tx.begin();
	}
	public Vacuna findById(int id_vacuna) {
		return em.find(Vacuna.class, id_vacuna);
	}

	@Override
	public List<Vacuna> findByMascota(int id_mascota) {
		sql = "select m from Vacuna where m.id_mascota = :nid";
		
		try {
			query = em.createQuery(sql);
			query.setParameter("nid", id_mascota);
			return query.getResultList();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}
