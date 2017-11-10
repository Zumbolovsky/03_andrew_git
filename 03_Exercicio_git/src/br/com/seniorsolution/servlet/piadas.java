package br.com.seniorsolution.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/piadas")
public class piadas extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public piadas() {
    
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("index.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			
			String piada1 = request.getParameter("piada1");
			String piada2 = request.getParameter("piada2");
			String piada3 = request.getParameter("piada3");
			int resposta = 0;
			
			switch(piada1) {
			case "r1":
				break;
			case "r2":
				resposta++;
				break;
			case "r3":
				break;
			}
			
			switch(piada2) {
			case "r1":
				resposta++;
				break;
			case "r2":
				break;
			case "r3":
				break;
			}
			
			switch(piada3) {
			case "r1":
				break;
			case "r2":
				break;
			case "r3":
				resposta++;
				break;
			}
			
			if(resposta==3) {
				request.setAttribute("mensagem", "Voce é o novo Mestre das Piadas!");
			}
			else {
				request.setAttribute("mensagem", "Você não se tornou os mestres das Piadas... :(");
			}
			
			request.getRequestDispatcher("index.jsp").forward(request, response);;
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
