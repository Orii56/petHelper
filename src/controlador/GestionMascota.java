package controlador;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAOS.DesparasitacionDAOImpl;
import modelo.DAOS.HigieneDAOImpl;
import modelo.DAOS.MascotaDAOImpl;
import modelo.DAOS.TipoMascotaDAOImpl;
import modelo.DAOS.UsuarioDAOImpl;
import modelo.DAOS.VacunaDAOImpl;
import modelo.beans.Desparasitacion;
import modelo.beans.Higiene;
import modelo.beans.Mascota;
import modelo.beans.TipoMascota;
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
		Usuario usu;
		UsuarioDAOImpl udao = new UsuarioDAOImpl();
		usu = (Usuario) request.getSession().getAttribute("usuario");
		
		Mascota m;
		m = (Mascota) request.getSession().getAttribute("mascota");
		MascotaDAOImpl mdao = new MascotaDAOImpl();
		
		Date fecha = null;
		switch(request.getParameter("option")) {
		
		case "mostrarMascotas":
			request.getSession().setAttribute("usuario", usu);
			List<Mascota> lista = mdao.findByUsuario(usu.getIdUsuario());
			request.setAttribute("lista", lista);
			request.getRequestDispatcher("menuMascota.jsp").forward(request, response);

			
			break;
		
		case "crearMascotas":
			request.getSession().setAttribute("usuario", usu);

			
			
			
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
			request.getSession().setAttribute("usuario", usu);

			request.setAttribute("idMascota", id);
			VacunaDAOImpl vdao = new VacunaDAOImpl();
			List<Vacuna> v = vdao.findByMascota((Integer.parseInt(id)));
			request.setAttribute("listaV", v);
			
			request.getRequestDispatcher("menuVacuna.jsp").forward(request, response);
			
		
		break;

		case "desparasitacion":
			id = (String) request.getSession().getAttribute("idMascota");
			request.getSession().setAttribute("usuario", usu);

			request.setAttribute("idMascota", id);
			
			DesparasitacionDAOImpl ddao = new DesparasitacionDAOImpl();
			
			List<Desparasitacion> d = ddao.findByMascota((Integer.parseInt(id)));
			
			request.setAttribute("listaD", d);
			
			request.getRequestDispatcher("menuDesparasitacion.jsp").forward(request, response);
			
		
		break;
		
		
		case "higiene":
			id = (String) request.getSession().getAttribute("idMascota");
			request.getSession().setAttribute("usuario", usu);

			request.setAttribute("idMascota", id);
			
			HigieneDAOImpl hdao = new HigieneDAOImpl();
			
			List<Higiene> h = hdao.findByMascota((Integer.parseInt(id)));
			
			request.setAttribute("listaH", h);
			
			request.getRequestDispatcher("menuHigiene.jsp").forward(request, response);
			
		
		break;
		
		case "addMascota":
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
			TipoMascota tipo = new TipoMascota();
			TipoMascotaDAOImpl tdao = new TipoMascotaDAOImpl();
			String date = request.getParameter("date");
			String nombre = request.getParameter("name");
			String raza = request.getParameter("raza");
			String sexo = request.getParameter("sexo");
			String t =  request.getParameter("jspVar");
		
			
			try {
				fecha = formatter.parse(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			tipo = tdao.findById(Integer.parseInt(t));
			System.out.println(fecha +" "+ tipo);
			Mascota mascota = new Mascota(0, fecha , nombre, raza, sexo, tipo, usu);
			System.out.println(mascota);
			mdao.insert(mascota);
			
		break;
		}
	}

}
