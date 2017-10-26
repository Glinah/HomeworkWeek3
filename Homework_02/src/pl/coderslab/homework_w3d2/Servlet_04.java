package pl.coderslab.homework_w3d2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_04")
public class Servlet_04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		Cookie[] cookies = request.getCookies();
		String strVisits = null;
		try {
			for (Cookie c : cookies) {
				if ("visits".equals(c.getName())) {
					strVisits = c.getValue();
				}
			}
		} catch (NullPointerException e) {

		}

		if (strVisits == null) {
			response.getWriter().append("Witaj pierwszy raz na naszej stronie");
			Cookie newCookie = new Cookie("visits", "1");
			newCookie.setMaxAge(60 * 60 * 24 * 365);
			response.addCookie(newCookie);
		} else {
			response.getWriter().append("Witaj, odwiedziłeś nas już " + strVisits + " razy.");
			int visits = Integer.parseInt(strVisits);
			visits++;
			Cookie newCookie = new Cookie("visits", Integer.toString(visits));
			newCookie.setMaxAge(60 * 60 * 24 * 365);
			response.addCookie(newCookie);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
