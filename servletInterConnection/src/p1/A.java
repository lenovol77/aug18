package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Firstservlet")
public class A extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public A() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String pa= request.getParameter("name");
		request.setAttribute("cname",pa);
		//session variablw
		HttpSession se = request.getSession();
		se.setAttribute("sn",pa);
		RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
		rd.forward(request, response);
	}

}
