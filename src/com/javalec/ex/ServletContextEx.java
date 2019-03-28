package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletContextEx
 */
@WebServlet("/ServletContextEx")
public class ServletContextEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletContextEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		
		response.setCharacterEncoding("UTF-8");
		
		//.. web.xml파일에 선언한 <context-param>안에 있는 id와 pw, path가 출력
		// 데이터를 모든 서블릿에서 사용하기 위해 servletcontext를 사용
		String id = getServletContext().getInitParameter("id");
		String pw = getServletContext().getInitParameter("pw");
		String path = getServletContext().getInitParameter("path");
		
		response.setContentType("text/html charset=utf-8");
		PrintWriter write = response.getWriter();
		
		write.println("<html><head></head><body>");
		write.println("아이디 : "+id+"<br>");
		write.println("비밀번호 : "+pw+"<br>");
		write.println("path: "+path+"<br>");
		write.println("</body></html>");
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
