package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAOS.MascotaDAOImpl;
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Usuario usu = null;
		UsuarioDAOImpl udao = new UsuarioDAOImpl();
		usu = (Usuario) request.getSession().getAttribute("usuario");
		
		String mail = request.getParameter("formEmail");
		String pwd = request.getParameter("formPassword");
		
		int autoIncrement = 0;
	
		MascotaDAOImpl mdao = new MascotaDAOImpl();
		Mascota mascota = new Mascota();
		
		TipoUsuario tipo = new TipoUsuario();
		switch( request.getParameter("option") ) {
		case "registrar":


			List<Mascota> mlist = mdao.findByUsuario(autoIncrement);
			
			int cp = Integer.parseInt(request.getParameter("formPC"));
			String nombre = request.getParameter("formName");
			
			if (udao.findByEmail(mail) != null) {
				request.setAttribute("estado", "ya estas registrado, haz login!");
				request.getRequestDispatcher("Login.jsp").forward(request, response);
			}else {
//				usu = new Usuario(autoIncrement, "", pwd, cp, "",mail, nombre, "", mlist, tipo);
				udao.insert(usu);
				
				Usuario usuPrueba = null;
				request.getSession().setAttribute("usuario", usu);
				usuPrueba = (Usuario) request.getSession().getAttribute("usuario");
				
				request.getRequestDispatcher("menuPrincipal.jsp");
			}
			request.getRequestDispatcher("Registro.jsp").forward(request, response);

		break;
		
		case "logear":
			System.out.println(mail);
			if(udao.findByEmail(mail) != null) {
				if(udao.findLogin(mail, pwd) == null) {
				
				request.setAttribute("estado", "combinación de usuario y contraseña incorrecta");
				request.getRequestDispatcher("Login.jsp").forward(request, response);

			} else {
				usu = udao.findLogin(mail, pwd);
				
				request.getSession().setAttribute("usuario", usu);
				request.getRequestDispatcher("menuPrincipal.jsp").forward(request, response);
							
			}}
//			request.setAttribute("estado", "el usuario no existe");
			request.getRequestDispatcher("Registro.jsp").forward(request, response);
			
			
//			List<Mascota> lista = mdao.findByUsuario(usu.getIdUsuario());
//			request.setAttribute("resultado", lista);			
			break;
		
		

		}
	
	
	
	}

}
