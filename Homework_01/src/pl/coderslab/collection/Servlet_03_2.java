package pl.coderslab.collection;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_03_2")
public class Servlet_03_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String products[] = {
			    "Asus Transformr;2999.99",
			    "iPhone 6';3499.18",
			    "Converse Sneakers;125.00",
			    "LG OLED55B6P OLED TV;6493.91",
			    "Samsung HT-J4100;800.99",
			    "Alpine Swiss Dress Belt;99.08",
			    "60 Watt LED;1.50",
			    "Arduino Nano;3.26",
			};
		String paramId = request.getParameter("id");
		int id = Integer.parseInt(paramId);
		if(id>products.length-1) {
			response.getWriter().append("Product not found");
		}else
		response.getWriter().append(products[id].replaceAll(";", " - "));
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
