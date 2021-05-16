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
	}
	
	
	@Override
	public int insert(Mascota mascota) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Mascota mascota) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Mascota mascota) {
		// TODO Auto-generated method stub
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
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}
