package pl.coderslab.homework_w3_d3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Zad6_4")
public class Zad6_4 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String page = "Strona 4";
		response.getWriter().append("<h1>Witaj na stronie 4</h1>\n" + 
				"\n" + 
				"<a href=\"Zad6_1\">Strona 1</a><br>\n" + 
				"<a href=\"Zad6_2\">Strona 2</a><br>\n" + 
				"<a href=\"Zad6_3\">Strona 3</a><br>");
		HttpSession sess = request.getSession();
		List<String> history = (List<String>) sess.getAttribute("history");
		if(history==null) {
			history = new ArrayList<>();
		}
		history.add(page);
		sess.setAttribute("history", history);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
