package pl.coderslab.homework_w3d2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_06")
public class Servlet_06 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String[] strNumbers = request.getParameterValues("num");
		try {
		int num1 = Integer.parseInt(strNumbers[0]);
		int num2 = Integer.parseInt(strNumbers[1]);
		int num3 = Integer.parseInt(strNumbers[2]);
		int num4 = Integer.parseInt(strNumbers[3]);
		int sum = num1 + num2 + num3 + num4;
		double avg = (double)sum/4.0;
		int product = num1 * num2 * num3 *num4;
		
		response.getWriter().append("Liczby: <br><ul><li>"+num1+"</li><li>"+num2+"</li><li>"+num3+"</li><li>"+num4+"</li></ul>");
		response.getWriter().append("Średnia: <ul><li>"+avg+"</li></ul>");
		response.getWriter().append("Suma: <ul><li>"+sum+"</li></ul>");
		response.getWriter().append("Iloczyn: <ul><li>"+product+"</li></ul>");
		}catch (NullPointerException e) {
			response.getWriter().append("Nie podano czterech liczb.");
		}catch (NumberFormatException e) {
			response.getWriter().append("Nie podano czterech liczb.");
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
