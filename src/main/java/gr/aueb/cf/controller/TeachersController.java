package gr.aueb.cf.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import gr.aueb.cf.model.Teacher;

/**
 * Servlet implementation class TeachersController
 */
@WebServlet("/teachers")
public class TeachersController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String admin = "Elisavet";
		request.setAttribute("adminXXX", admin);
		request.getRequestDispatcher("/jsps/teachers/teacher-search.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String lastname = request.getParameter("lastname");
		
		if(lastname.equals("Androutsos")) {
			List <Teacher> teachers = Arrays.asList(
					new Teacher(1L, "SSN123", "Athanasios", "Androutsos"),
					new Teacher(2L, "SSN125", "Athanasios", "Androutsopoulos"),
					new Teacher(3L, "SSN127", "Maria", "Androutsou"),
					new Teacher(4L, "SSN129", "Eleni", "Androutsou")
			);
			request.setAttribute("teacher", teachers);
			request.getRequestDispatcher("/jsps/teachers/teachers.jsp").forward(request, response);
		} else {
			response.getWriter().print("<h2>Teacher not found</h2>");
			request.getRequestDispatcher("/jsps/teachers/teacher-search.jsp").forward(request, response);
		}
	
	}

}
