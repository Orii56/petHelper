package modelo.DAOS;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.beans.Mascota;

public class MascotaDAOImpl implements MascotaDAO {
	
	Mascota m = new Mascota();
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
		System.out.println("MdaoIMPL: " + id_mascota);
		return em.find(Mascota.class, id_mascota);
	
	}

	@Override
	public List<Mascota> findByUsuario(int id_usuario) {
		System.out.println("MdaoIMPL: " + id_usuario);
		
		sql = "select m from Mascota m where m.usuario.idUsuario = :nid";
		System.out.println(sql);
		try {
			System.out.println("try");
			query = em.createQuery(sql);
			query.setParameter("nid", id_usuario);
			System.out.println(query.getResultList());
			return query.getResultList();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}
