package modelo.DAOS;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.beans.Higiene;
import modelo.beans.Mascota;

public class HigieneDAOImpl implements HigieneDAO {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	private EntityTransaction tx;
	private String sql;
	private Query query;
	
	public HigieneDAOImpl() {
		emf = Persistence.createEntityManagerFactory("petHelper");
		em = emf.createEntityManager();
		tx = em.getTransaction();
		tx.begin();
	}

	@Override
	public Higiene findById(int id) {
		return em.find(Higiene.class, id);
	
	}

	@Override
	public List<Higiene> findByMascota(int id_mascota) {
		
	sql = "select m from Higiene where m.id_mascota = :nid";
		
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
	


