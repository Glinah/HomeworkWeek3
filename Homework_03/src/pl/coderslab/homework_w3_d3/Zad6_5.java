package pl.coderslab.homework_w3_d3;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/history")
public class Zad6_5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append("Historia: <br><br>");
		try {
			HttpSession sess = request.getSession();
			List<String> history = (List<String>) sess.getAttribute("history");
			for (String page : history) {
				response.getWriter().append(page + "<br>");
			}
			response.getWriter().append(
					"<br><form action=\"\" method=\"post\"><button name=\"history\" type=\"submit\" value=\"remove\">Usuń historię</button></form>");
		} catch (NullPointerException e) {
			response.getWriter().append("Brak historii.");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String history = request.getParameter("history");
			if(history.equals("remove")) {
				HttpSession sess = request.getSession();
				sess.removeAttribute("history");
				response.sendRedirect("history");
			}
		} catch (NullPointerException e) {

		}
	}

}
