package sec05.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetServletContext
 */
@WebServlet("/cset")
public class SetServletContext extends HttpServlet {

	
	ServletContext context;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
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
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// ServletContext 객체를 가져옵니다.
//		ServletContext context = getServletContext();
		List member = new ArrayList();
		member.add("이순신");
		member.add(30);
		
		// ServletContext 객체에 데이터를 바인딩합니다.
		context.setAttribute("member", member);
		out.print("<html><body>");
		out.print("이순신과 30 설정");
		out.print("</body></html>");
	}

}
