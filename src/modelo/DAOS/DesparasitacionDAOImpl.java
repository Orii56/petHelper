package modelo.DAOS;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.beans.Desparasitacion;
import modelo.beans.Mascota;
import modelo.beans.Vacuna;

public class DesparasitacionDAOImpl implements DesparasitacionDAO {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	private EntityTransaction tx;
	private String sql;
	private Query query;
	
	public DesparasitacionDAOImpl() {
		emf = Persistence.createEntityManagerFactory("petHelper");
		em = emf.createEntityManager();
		tx = em.getTransaction();
		tx.begin();
	}


	@Override
	public Desparasitacion findById(int id) {
		return em.find(Desparasitacion.class, id);	
	}

	@Override
	public List<Desparasitacion> findByMascota(int id_mascota) {
sql = "select m from Desparasitacion where m.id_mascota = :nid";
		
		try {
			query = em.createQuery(sql);
			query.setParameter("nid", id_mascota);
			return query.getResultList();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
		
	}


	public int insert(Desparasitacion desparasitacion) {
		Desparasitacion d = null;
		
		try {
			d = em.find(Desparasitacion.class, desparasitacion.getIdDesparasitacion());
			
			if(d!=null) {
				tx.begin();
				em.merge(desparasitacion);
				tx.commit();
				return 1;
			} else if (d == null) {
				tx.begin();
				em.persist(desparasitacion);
				tx.commit();
				
				return 1;
		}} catch(Exception e) {
			System.out.println(e.getMessage());
		} return 0;

	

	}


	@Override
	public int update(Desparasitacion desparasitacion) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int delete(Desparasitacion desparasitacion) {
		// TODO Auto-generated method stub
		return 0;
	}
}
