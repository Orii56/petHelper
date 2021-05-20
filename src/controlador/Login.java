package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAOS.MascotaDAOImpl;
import modelo.DAOS.TipoUsuarioDAOImpl;
import modelo.DAOS.UsuarioDAOImpl;
import modelo.beans.Mascota;
import modelo.beans.TipoUsuario;
import modelo.beans.Usuario;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Usuario usu = null;
		UsuarioDAOImpl udao = new UsuarioDAOImpl();
		usu = (Usuario) request.getSession().getAttribute("usuario");

		String email = request.getParameter("email");
		String pwd = request.getParameter("password");

		int autoIncrement = 0;

		MascotaDAOImpl mdao = new MascotaDAOImpl();
		Mascota mascota = new Mascota();

		TipoUsuario tipo = new TipoUsuario();
		TipoUsuarioDAOImpl tdao = new TipoUsuarioDAOImpl();
		
		switch (request.getParameter("option")) {

		case "logear":

			if (udao.findByEmail(email) != null) {
					
				if (udao.findLogin(email, pwd) == null) {
					// el mail existe en la bd pero no coincide con la pwd
					request.setAttribute("estado", "combinación de usuario y contraseña incorrecta");
					request.getRequestDispatcher("logear.jsp").forward(request, response);

				} else {
					// login ok
					usu = udao.findLogin(email, pwd);
					request.getSession().setAttribute("usuario", usu);
					List<Mascota> lista = mdao.findByUsuario(usu.getIdUsuario());
					request.setAttribute("lista", lista);
					request.getRequestDispatcher("menuPrincipal.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("estado", "el usuario no existe, registrate");
				request.getRequestDispatcher("Registro.jsp").forward(request, response);
			}

			break;

		case "registrar":

			String pwdR= request.getParameter("passwordR");
			String nombre = request.getParameter("name");

			int cp = Integer.parseInt(request.getParameter("cp"));
			
			tipo = tdao.findById(1);
			
			if(udao.findByEmail(email)!=null) {
				request.setAttribute("estado", "ya estas registrado, haz login!");
				request.getRequestDispatcher("Login.jsp").forward(request, response);
			} else {
				//No existe el email en la BD, se puede registrar
				usu = new Usuario(autoIncrement, "", pwd, cp, "", email, nombre, "", tipo);
				udao.insert(usu);
				
				Usuario usuPrueba = null;
				request.getSession().setAttribute("usuario", usu);
				usuPrueba = (Usuario) request.getSession().getAttribute("usuario");
				
				request.getRequestDispatcher("menuPrincipal.jsp").forward(request, response);
				
				
				
			}
			 
			break;
			
		case "home":
			request.getSession().setAttribute("usuario", usu);
			List<Mascota> lista = mdao.findByUsuario(usu.getIdUsuario());
			request.setAttribute("lista", lista);
			
			request.getSession().setAttribute("usuario", usu);
			request.getRequestDispatcher("menuPrincipal.jsp").forward(request, response);
			
			
			break;
			

		}

	}

}