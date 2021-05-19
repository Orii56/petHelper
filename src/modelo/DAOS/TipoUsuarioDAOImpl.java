package modelo.DAOS;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.beans.Mascota;
import modelo.beans.TipoUsuario;

public class TipoUsuarioDAOImpl implements TipoUsuarioDAO{
	
	private EntityManagerFactory emf;
	private EntityManager em;
	private EntityTransaction tx;
	private String sql;
	private Query query;

	public TipoUsuarioDAOImpl() {
		emf = Persistence.createEntityManagerFactory("petHelper");
		em = emf.createEntityManager();
		tx = em.getTransaction();
		tx.begin();
	}

	@Override
	public TipoUsuario findById(int id_usuario) {
		return em.find(TipoUsuario.class, id_usuario);
	}


}
