package sec03.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessiionTest
 */
@WebServlet("/sess2")
public class SessiionTest2 extends HttpServlet {

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
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// gettSession()을 호출하여 최초 요청시
		// 세션 객체를 새로 생성하거나 기존 세션을 반환함
		HttpSession session = request.getSession();
		out.println("세션 아이디 : " + session.getId() + "<br>");
		out.println("최초 세션 생성 시각 : " + new Date(session.getCreationTime()) + "<br>");
		out.println("최근 세션 접근 시각 : " + new Date(session.getLastAccessedTime()) + "<br>");
		
		out.println("기본 세션 유효 시간 : " + session.getMaxInactiveInterval() + "<br>");
		session.setMaxInactiveInterval(5);
		out.println("세션 유효 시간 : " + session.getMaxInactiveInterval() + "<br>");
		
		if(session.isNew()) {
			out.print("새 세션이 만들어졌습니다.");
		}
	
	
	
	}

}
