package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SecondServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession se= request.getSession();
		se.getAttribute("sn");
		
		PrintWriter writer = response.getWriter();
		writer.println("<h1>");
		writer.println(se.getAttribute("sn"));
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String a=(String)request.getAttribute("cname");
		HttpSession se= request.getSession();
		se.getAttribute("sn");
		
	PrintWriter writer = response.getWriter();
	writer.println("<h1>");
	writer.println(se.getAttribute("sn"));
	writer.println(a);
	
	writer.println("</h1>");
	}

}
