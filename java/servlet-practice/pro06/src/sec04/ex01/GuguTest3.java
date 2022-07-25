package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuguTest
 */
@WebServlet("/guguTest3")
public class GuguTest3 extends HttpServlet {

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("call init method");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("call destroy method");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		int dan = Integer.parseInt(request.getParameter("dan"));
		out.print("<table border=1 width=800 align=center>");
		out.print("<tr align=center bgcolor='yellow'>");
		out.print("<td colspan=2>" + dan + " 단 출력 </tb>");
		out.print("</tr>");
		for(int i=1; i<10; i++) {
			if(i%2 ==0) {
				out.print("<tr align=center bgcolor=grey>");
			} else {
				out.print("<tr align=center bgcolor=skyblue>");
			}
			out.print("<td width=200>");
			out.print("<input type='radio' />" + i);
			out.print("</td>");
			out.print("<td width=200>");
			out.print("<input type='checkbox'/>" + i);
			out.print("</td>");
			out.print("<td width=400>");
			out.print(dan + "* " + i);
			out.print("</td>");
			out.print("<td width=400>");
			out.print(i*dan);
			out.print("</td>");
			out.print("</tr>");
		}
		out.print("</table>");
	}

}
