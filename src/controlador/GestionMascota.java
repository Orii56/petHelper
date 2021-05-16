package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.DAOS.MascotaDAOImpl;
import modelo.beans.Mascota;

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

		String opt = request.getParameter("option");
		
		MascotaDAOImpl mdao = new MascotaDAOImpl();
		
		switch(opt) {
		
		case "mostrarMascotas":

			List<Mascota> lista = mdao.findByUsuario(1);
			request.setAttribute("resultado", lista);
			
			break;
		case "detallesMascota":
			break;
		}
	}

}
