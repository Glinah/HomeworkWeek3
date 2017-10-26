package pl.coderslab.collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/Servlet_02", "/Servlet_01" })
public class Servlet_02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("<!DOCTYPE html> <html> <head><title> Dzien 1 zadanie domowe 2</title> </head> <body>");
		response.getWriter().append("Lista jezykow programowania, ktore wzoruja sie na paradygmacie obiektowym: <br> <br>");
		try {
			File file = new File("/home/dawid/Pulpit/Coderslab/3tydzien/Repozytorium/KAT_JEE_S_01_Servlety/b_Zadania_Domowe/a_Dzien_1/oop.txt");
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()) {
				response.getWriter().append(scan.nextLine());
				response.getWriter().append( "<br>");
			}
			scan.close();
			response.getWriter().append("</body> </html>");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
