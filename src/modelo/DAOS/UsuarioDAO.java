package modelo.DAOS;

import modelo.beans.Usuario;

public interface UsuarioDAO {

	
	public int insert(Usuario usuario);

	public int update(Usuario usuario);

	public int delete(String idUsuario);
	
	public Usuario findByEmail(String email);
	
	public Usuario findLogin(String email, String contrasena);
	
	public Usuario findById(int id_usuario);
	

	
}
