package controlador;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAOS.DesparasitacionDAOImpl;
import modelo.DAOS.MascotaDAOImpl;
import modelo.DAOS.UsuarioDAOImpl;
import modelo.DAOS.VacunaDAOImpl;
import modelo.beans.Desparasitacion;
import modelo.beans.Mascota;
import modelo.beans.Usuario;
import modelo.beans.Vacuna;

/**
 * Servlet implementation class GestionSanitaria
 */
@WebServlet("/GestionSanitaria")
public class GestionSanitaria extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GestionSanitaria() {
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
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		Usuario usu;
		UsuarioDAOImpl udao = new UsuarioDAOImpl();
		usu = (Usuario) request.getSession().getAttribute("usuario");

		Mascota m;
		m = (Mascota) request.getSession().getAttribute("mascota");
		MascotaDAOImpl mdao = new MascotaDAOImpl();

		String id = (String) request.getSession().getAttribute("idMascota");
		request.setAttribute("idMascota", id);

		switch (request.getParameter("option")) {

		case "addVacuna":
			System.out.println("entra al servlet > addVacuna");
			String tipoVacuna = request.getParameter("name");
			String date = request.getParameter("date");

			Date fecha;
			try {
				fecha = (Date) formatter.parse(date);
				Vacuna v = new Vacuna(0, fecha, tipoVacuna, m);
				VacunaDAOImpl vdao = new VacunaDAOImpl();
				System.out.println(v);
				vdao.insert(v);
				System.out.println("TATAN!");

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;

		case "addDesparasitacion":

			String tipoDesparasitacion = request.getParameter("name");
			date = request.getParameter("date");

			String dateR = request.getParameter("dateR");

			try {
				fecha = (Date) formatter.parse(date);
				Desparasitacion d = new Desparasitacion(0, fecha, dateR, tipoDesparasitacion, m);
				DesparasitacionDAOImpl ddao = new DesparasitacionDAOImpl();
				System.out.println(d);
				ddao.insert(d);

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			break;

		case "addHigiene":

			String tipoHigiene = request.getParameter("name");
			date = request.getParameter("date");

			dateR = request.getParameter("dateR");

			try {
				fecha = (Date) formatter.parse(date);
				Desparasitacion d = new Desparasitacion(0, fecha, dateR, tipoHigiene, m);
				DesparasitacionDAOImpl ddao = new DesparasitacionDAOImpl();
				System.out.println(d);
				ddao.insert(d);

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;

		}

	}

}
