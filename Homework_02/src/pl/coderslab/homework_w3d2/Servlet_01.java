package pl.coderslab.homework_w3d2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_01")
public class Servlet_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String exchange = request.getParameter("exchange");
		double value = Double.parseDouble(request.getParameter("value"));
		double rate = 0;
		if(exchange.equals("eu")) {
			rate=1.1763;
		}else if(exchange.equals("ue")){
			rate=0.8501;
		}else if(exchange.equals("ep")) {
			rate=4.2382;
		}else if(exchange.equals("pe")) {
			rate=0.2359;
		}else if(exchange.equals("up")) {
			rate=3.6031;
		}else if(exchange.equals("pu")) {
			rate=0.2775;
		}else {
			response.getWriter().append("coś poszło nie tak");
		}
		response.getWriter().append(rate*value+"");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
