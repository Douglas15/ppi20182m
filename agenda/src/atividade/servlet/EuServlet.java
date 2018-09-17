package atividade.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

@WebServlet("/io")
public class EuServlet extends HttpServlet{
	
@Override
protected void service(HttpServletRequest request, HttpServletResponse resposne) throws ServletException, IOException {
	
	PrintWriter out =  resposne.getWriter();

	out.println("<html>");
	out.println("<body>");
	out.println("<h1> Félix Douglas </h1>");
	out.println("<h1> douglas@email.com </h1>");
	out.println("</body>");
	out.println("</html>");


}

	}
