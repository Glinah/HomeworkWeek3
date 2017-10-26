package pl.coderslab.collection;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet_04")
public class Servlet_04 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random generator = new Random();
		int[] tab = new int[10];
		for (int i=0; i<tab.length; i++) {
			tab[i] = generator.nextInt(100)+1;
		}
		response.getWriter().append("Generated numbers: \n");
		response.getWriter().append(Arrays.toString(tab) + " \n\n");
		Arrays.sort(tab);
		response.getWriter().append("Sorted numbers: \n");
		response.getWriter().append(Arrays.toString(tab));
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
