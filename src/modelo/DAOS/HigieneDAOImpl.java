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

	@Override
	public int insert(Higiene higiene) {
Higiene h = null;
		
		try {
			h = em.find(Higiene.class, higiene.getIdHigiene());
			
			if(h!=null) {
				tx.begin();
				em.merge(higiene);
				tx.commit();
				return 1;
			} else if (h == null) {
				tx.begin();
				em.persist(higiene);
				tx.commit();
				
				return 1;
		}} catch(Exception e) {
			System.out.println(e.getMessage());
		} return 0;
	}

	@Override
	public int update(Higiene higiene) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Higiene higiene) {
		// TODO Auto-generated method stub
		
	}
	}
	


