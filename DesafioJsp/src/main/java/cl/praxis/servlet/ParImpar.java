package cl.praxis.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.praxis.utilidades.*;

/**
 * Servlet implementation class ObtenerEfemerides
 */

@WebServlet("/ParImpar")
public class ParImpar extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	//Constructor	
    public ParImpar() {
        super();
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int numero = Integer.parseInt(request.getParameter("num"));
		UtilesGenerales utilidades = new UtilesGenerales();
		String parImpar = utilidades.parImpar(numero);

		response.getWriter().append("El Numero " + numero + parImpar);

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
