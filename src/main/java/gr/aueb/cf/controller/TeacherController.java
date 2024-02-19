package gr.aueb.cf.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import gr.aueb.cf.model.Teacher;

/**
 * Servlet implementation class TeacherController
 */
@WebServlet("/teacher")
public class TeacherController extends HttpServlet {
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
			Teacher teacher = new Teacher(1L, "SSN123", "Athanasios", "Androutsos");
			request.setAttribute("teacher", teacher);
			request.getRequestDispatcher("/jsps/teachers/teacher.jsp").forward(request, response);
		} else {
			response.getWriter().print("<h2>Teacher not found</h2>");
			request.getRequestDispatcher("/jsps/teachers/teacher-search.jsp").forward(request, response);
		}
	
	}

}
