/*
 * 날짜 : 2019. 03. 25
 * 이름 : 박노빈
 * 내용 : formAction.jsp 파일에서 전송한 데이터를 받아 출력하는 예제.
 */

package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class formActionEx
 */


@WebServlet("/formActionEx")
public class formActionExServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public formActionExServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		
		//.. Post방식에서 setCharacterEncoding을 설정하지 않으면 출력시 한글깨짐 현상이 발생
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		//.. formAction.jsp 파일에서 전송한 name, id와 password를 받아 저장
		String uname = request.getParameter("uname");
		String uid = request.getParameter("uid");
		String upass = request.getParameter("upass");
		
		//.. checkbox는 여러개의 데이터를 한번에 전송할 수 있어서 배열을 이용해 저장
		String[] hobbys = request.getParameterValues("hobby");
		String major = request.getParameter("major");
		String protocol = request.getParameter("protocol");
		
		response.setContentType("text/html charset=UTF-8");
		PrintWriter write = response.getWriter();
		
		write.println("<html><head></head><body>");
		write.println("이름 : "+uname+"<br>");
		write.println("아이디 : "+uid+"<br>");
		write.println("비밀번호 : "+upass+"<br>");
		write.println("취미 : "+Arrays.toString(hobbys)+"<br>");
		write.println("전공 : "+major+"<br>");
		write.println("프로토콜 : "+protocol+"<br>");
		write.println("</body></html>");
		
		
	}

}
