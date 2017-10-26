package pl.coderslab.homework_w3d2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_02")
public class Servlet_02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String str = request.getParameter("number");
		response.setContentType("text/html;charset=UTF-8");
		char[] chararray = str.toCharArray();
		boolean ifBinary = true;
		try {
			for (int i = 0; i < chararray.length; i++) {
				if (!(chararray[i] == '1') && !(chararray[i] == '0')) {
					ifBinary = false;
				}
			}

			if (ifBinary == false) {
				response.getWriter().append("Niepoprawna wartość binarna.");
			} else {
				int result = 0;
				for (int i = 0, j = chararray.length - 1; i < chararray.length; i++, j--) {
					int x = Character.getNumericValue(chararray[j]);
					result += x * Math.pow(2, i);
				}
				response.getWriter().append(str + " to liczba " + result);

			}

		} catch (NumberFormatException e) {
			response.getWriter().append(e.getMessage());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
