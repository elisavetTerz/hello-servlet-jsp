package gr.aueb.cf.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HelloCFController
 */
@WebServlet("/hello-servlet")
public class HelloCFController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public HelloCFController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter printWriter = response.getWriter();
		String message = "Hello Coding Factory";
		
		printWriter.println("<html><body><h1>Hello " + message + "</h1></body></html>");
	}

}
