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
		Mascota m = new Mascota();
		MascotaDAOImpl mdao = new MascotaDAOImpl();
		m = mdao.findById(id_mascota);
		
		sql = "select v from Vacuna v where v.mascota = :nid";
		
		try {
			query = em.createQuery(sql);
			query.setParameter("nid", m);
			return query.getResultList();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	public int insert(Vacuna vacuna) {
		Vacuna v = null;
		
		try {
			v = em.find(Vacuna.class, vacuna.getIdVacuna());
			
			if(v!=null) {
				tx.begin();
				em.merge(vacuna);
				tx.commit();
				return 1;
			} else if (v == null) {
				tx.begin();
				em.persist(vacuna);
				tx.commit();
				
				return 1;
		}} catch(Exception e) {
			System.out.println(e.getMessage());
		} return 0;
		
	}
	@Override
	public int update(Vacuna vacuna) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void delete(Vacuna vacuna) {
		// TODO Auto-generated method stub
		
	}

}
