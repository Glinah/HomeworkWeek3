package pl.coderslab.homework_w3d2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servler_03")
public class Servler_03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession sess = request.getSession();
		String[] inputs = null;
		try {
			inputs = (String[]) sess.getAttribute(("inputs"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if (inputs==null) {

			response.getWriter()
					.append("<form action=\"\" method=\"post\">"
							
							+ "		<<input type=\"text\" name=\"input\" >Tekst 1<br>"
							+ "		<input type=\"text\" name=\"input\" >Tekst 2<br>"
							+ "		<input type=\"text\" name=\"input\" >Tekst 3<br>"
							+ "		<input type=\"text\" name=\"input\" >Tekst 4<br>"
							+ "		<input type=\"text\" name=\"input\" >Tekst 5<br>"
							+ "		<input type=\"submit\">\n" + "	</form>" + "	<br><br>");
		} else {
			response.getWriter()
					.append("<form action=\"\" method=\"post\">");
							for(int i=0; i<inputs.length;i++) {
								response.getWriter().append("<input type=\"text\" name=\"input\" value=\"" + inputs[i] + "\" >Tekst"+(i+1)+"<br>");
							}

							response.getWriter().append( "		<input type=\"submit\">\n" + "	</form>" + "	<br><br>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String[] inputs = request.getParameterValues("input");
		HttpSession sess = request.getSession();
		sess.setAttribute("inputs", inputs);
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append("zapamiętano w sesji wartości :)");
	}

}
