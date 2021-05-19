package modelo.DAOS;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.beans.Mascota;
import modelo.beans.Usuario;


public class UsuarioDAOImpl implements UsuarioDAO{
	private EntityManagerFactory emf;
	private EntityManager em;
	private EntityTransaction tx;
	private String sql;
	private Query query;


	public UsuarioDAOImpl() {
		emf = Persistence.createEntityManagerFactory("petHelper");
		em = emf.createEntityManager();
		tx = em.getTransaction();
		tx.begin();
	}
	
	
	@Override
	public int insert(Usuario usuario) {
		sql = "INSERT INTO usuario VALUES (:id_usuario , :mail , :nombre , :contrasena , :direccion , :cp , :ciudad , :pais, :tipo_user)";
		
		try {
			query = em.createQuery(sql);
			query.setParameter("id_usuario", usuario.getIdUsuario());
			query.setParameter("mail", usuario.getMail());
			query.setParameter("nombre", usuario.getNombre());
			query.setParameter("contrasena", usuario.getContrasena());
			query.setParameter("direccion", usuario.getDireccion());
			query.setParameter("cp", usuario.getCp());
			query.setParameter("ciudad",usuario.getCiudad());
			query.setParameter("pais", usuario.getPais());
			query.setParameter("tipo_user", usuario.getTipoUsuario());
			query.executeUpdate();
			
			return 0;
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return -1;
	}
	
	
	@Override
	public int update(Usuario usuario) {
		
		sql = "UPDATE  usuario SET  mail = :mail , nombre = :nombre , contrasena = :contrasena , direccion = :direccion ,cp = :cp , ciudad = :ciudad , pais = :pais, tipo_user = :tipo_user WHERE id_usuario = :id_usuario";
		
		try {
			query = em.createQuery(sql);
			query.setParameter("id_usuario", usuario.getIdUsuario());
			query.setParameter("mail", usuario.getMail());
			query.setParameter("nombre", usuario.getNombre());
			query.setParameter("contrasena", usuario.getContrasena());
			query.setParameter("direccion", usuario.getDireccion());
			query.setParameter("cp", usuario.getCp());
			query.setParameter("ciudad",usuario.getCiudad());
			query.setParameter("pais", usuario.getPais());
			query.setParameter("tipo_user", usuario.getTipoUsuario());
			query.executeUpdate();
			
			return 0;
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return -1;
	}

	
	
	
	@Override
	public int delete(String idUsuario) {
		em.remove(idUsuario);
		tx.commit();
		return 0;
		
	}
	

//	@Override
//	public Usuario findByEmail(String mail) {
//		System.out.println(">>>>>>findByEmail");
//		System.out.println(mail);
//		sql = "select u from Usuario u where u.mail = :mail";
//		System.out.println(sql);
//		
//		try {
//			System.out.println("try");
//				query = em.createQuery(sql);
//				System.out.println("em.createquery(Sql)");
//				query.setParameter("mail", mail);	
//				System.out.println("query.setParam");
//				return (Usuario) query.getSingleResult();
//		}catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		return null;
//	}
	
	
	@Override
	public Usuario findByEmail(String email) {
		return em.find(Usuario.class, email);
	}

	@Override
	public Usuario findLogin(String email, String contrasena) {
		return em.find(Usuario.class, contrasena);
	}
	

}


//	@Override
//	public Usuario findLogin(String mail, String contrasena) {
//		System.out.println(">>>>>>>>findLogin");
//		sql = "select u from Usuario u where u.mail = :mail and u.contrasena = :contrasena";
//		System.out.println(sql);
//		try {
//			System.out.println("try");
//			query = em.createQuery(sql);
//			System.out.println("em.cQ(sql)");
//			query.setParameter("mail", mail);
//			System.out.println("em.sP(mail)");
//			query.setParameter("contrasena", contrasena);
//			System.out.println("em.sP(pwd)");
//			return (Usuario) query.getSingleResult();
//					
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		return null;
//	}
//	
//	public Usuario deleteUser(String mail) {
//		Usuario usu = findByEmail(mail);
//		
//		em.getTransaction().begin();
//		em.remove(usu);
//		em.getTransaction().commit();
//		
//		return null;
//	}
	

//}
