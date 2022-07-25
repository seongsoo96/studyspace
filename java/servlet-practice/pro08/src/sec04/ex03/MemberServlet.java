package sec04.ex03;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/member")
public class MemberServlet extends HttpServlet {
       
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
		doHandle(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		MemberDAO dao = new MemberDAO();
		
		List membersList = dao.listMembers();
		request.setAttribute("membersList", membersList);
		RequestDispatcher dispatch = request.getRequestDispatcher("viewMembers");
		dispatch.forward(request, response);
	}
}






//List<MemberVO> list = dao.listMembers();
//
//out.print("<html><body>");
//out.print("<table border=1><tr align='center' bgcolor='lightgreen'>");
//out.print("<td>아이디</td><td>비밀번호</td> <td>이름</td><td>이메일</td><td>가입일</td></tr>");
//
//for(int i=0; i<list.size(); i++) {
//	MemberVO memberVO = list.get(i);
//	String id = memberVO.getId();
//	String pwd = memberVO.getPwd();
//	String name = memberVO.getName();
//	String email = memberVO.getEmail();
//	Date joinDate = memberVO.getJoinDate();
//	out.print("<tr><td>" + id + "</td><td>"
//			+ pwd + "</td><td>"
//			+ name + "</td><td>"
//			+ email + "</td><td>"
//			+ joinDate + "</td></tr>");
//}
//out.print("</table></body></html");