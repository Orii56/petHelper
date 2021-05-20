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
import modelo.DAOS.VacunaDAOImpl;
import modelo.beans.Mascota;
import modelo.beans.Usuario;
import modelo.beans.Vacuna;

/**
 * Servlet implementation class GestionMascota
 */
@WebServlet("/GestionMascota")
public class GestionMascota extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionMascota() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hace la llamada ok!");
		Usuario usu;
		UsuarioDAOImpl udao = new UsuarioDAOImpl();
		usu = (Usuario) request.getSession().getAttribute("usuario");
		
		Mascota m;
		m = (Mascota) request.getSession().getAttribute("mascota");
		MascotaDAOImpl mdao = new MascotaDAOImpl();
		
		switch(request.getParameter("option")) {
		
		case "mostrarMascotas":
			request.getSession().setAttribute("usuario", usu);
			List<Mascota> lista = mdao.findByUsuario(usu.getIdUsuario());
			request.setAttribute("lista", lista);
			request.getRequestDispatcher("menuMascota.jsp").forward(request, response);

			
			break;
		case "detallesMascota":
			request.getSession().setAttribute("usuario", usu);
			lista = mdao.findByUsuario(usu.getIdUsuario());
			request.setAttribute("lista", lista);
			String id = request.getParameter("id");
			m = mdao.findById(Integer.parseInt(id));
			request.getSession().setAttribute("idMascota", id);
			request.getSession().setAttribute("detalles", m);
			request.getRequestDispatcher("menuMascota.jsp").forward(request, response);
			
			break;
			
		case "vacuna":
			id = (String) request.getSession().getAttribute("idMascota");
			System.out.println("Vacuna id >>>>>> " +id);
			request.getSession().setAttribute("usuario", usu);

			System.out.println("Vacuna usu >>>>>> " +usu);
			request.setAttribute("idMascota", id);
			
			System.out.println("Vacuna id tras setAttribute>>>>>> " +id);
			
			VacunaDAOImpl vdao = new VacunaDAOImpl();
			List<Vacuna> v = vdao.findByMascota((Integer.parseInt(id)));
			System.out.println(v);
			request.setAttribute("listaV", v);
			
			request.getRequestDispatcher("menuVacuna.jsp").forward(request, response);
			
		
		break;
		
		}
	}

}
