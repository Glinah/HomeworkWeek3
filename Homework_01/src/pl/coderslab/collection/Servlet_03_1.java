package pl.coderslab.collection;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_03_1")
public class Servlet_03_1 extends HttpServlet {

	private static final long serialVersionUID = 1L;


	public Servlet_03_1() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("<a href=\"http://localhost:8080/Homework_01/Servlet_03_2?id=0\">Link1</a><br/>");
		response.getWriter().append("<a href=\"http://localhost:8080/Homework_01/Servlet_03_2?id=1\">Link2</a><br/>");
		response.getWriter().append("<a href=\"http://localhost:8080/Homework_01/Servlet_03_2?id=2\">Link3</a><br/>");
		response.getWriter().append("<a href=\"http://localhost:8080/Homework_01/Servlet_03_2?id=3\">Link4</a><br/>");
		response.getWriter().append("<a href=\"http://localhost:8080/Homework_01/Servlet_03_2?id=4\">Link5</a><br/>");
		response.getWriter().append("<a href=\"http://localhost:8080/Homework_01/Servlet_03_2?id=5\">Link6</a><br/>");
		response.getWriter().append("<a href=\"http://localhost:8080/Homework_01/Servlet_03_2?id=6\">Link7</a><br/>");
		response.getWriter().append("<a href=\"http://localhost:8080/Homework_01/Servlet_03_2?id=7\">Link8</a><br/>");
		response.getWriter().append("<a href=\"http://localhost:8080/Homework_01/Servlet_03_2?id=10\">Link11</a><br/>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
